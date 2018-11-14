package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Todo;
import com.greenfoxacademy.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    TodoRepo database;

    @Autowired
    public TodoController(TodoRepo database) {
        this.database = database;
    }


    @GetMapping({"/list", "/"})
    public String list(String isActive, Model model){
        if (isActive != null && isActive.equals("true")){
            model.addAttribute("todos", database.findAll().stream().filter(x -> !x.isDone()).collect(Collectors.toList()));
        }
        else {
            model.addAttribute("todos", database.findAll());
        }
        return "todolist";
    }

    @PostMapping(value = "/list/add")
    public String add(String newTodo, @RequestParam(name = "done", required = false, defaultValue = "false") Boolean done, @RequestParam(name = "urgent", required = false, defaultValue = "false") Boolean urgent, Model model){
        database.save(new Todo(newTodo, urgent, done));
        model.addAttribute("todos", database.findAll());
        return "redirect:/todo/list";
    }

    @GetMapping(value = "/list/add")
    public String sfsfds(){
        return "newtodo";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable("id") Long id){
        database.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping(value = "/{id}/edit")
    public String getEdit(@PathVariable("id") Long id, Model model){
        model.addAttribute("todo", database.findById(id).get());
        return "edit";
    }
    @PostMapping(value = "/{id}/edit")
    public String postEdit(@PathVariable("id") Long id, String edit, Model model, @RequestParam(name = "done", required = false, defaultValue = "false") Boolean done, @RequestParam(name = "urgent", required = false, defaultValue = "false") Boolean urgent){
        Todo todo = database.findById(id).get();
        todo.setTitle(edit);
        todo.setDone(done);
        todo.setUrgent(urgent);
        database.save(todo);
        return "redirect:/todo/list";
    }
}
