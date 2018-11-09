package com.greenfoxacademy.contollers;

import com.greenfoxacademy.model.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/gfa")
    public String students(String list, Model model){
        model.addAttribute("students", studentService.findAll());
        if (list != null) {
            model.addAttribute("list", list);
        }
        return "students";
    }

    @GetMapping(value = "/gfa/{list}")
    public String listOfStudents(Model model){
        model.addAttribute("students", studentService.findAll());
        model.addAttribute("list", "list");
        return "students";
    }

    @GetMapping(value = "/gfa/add")
    public String add(String name, Model model){
        return "students";
    }
}
