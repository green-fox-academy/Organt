package com.greenfoxacademy.controllers;

import com.greenfoxacademy.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    TodoRepo database;

    @Autowired
    public TodoController(TodoRepo database) {
        this.database = database;
    }


    @RequestMapping({"/", "/list"})
    public String list(Model model){
        model.addAttribute("todos", database.findAll());
        return "todolist";
    }
}
