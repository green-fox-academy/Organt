package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RestControllerX {

    @GetMapping(value = "/doubling")
    public Doubling doubling(@RequestParam(value = "input", required = false) Integer input){
        return new Doubling(input);
    }

    @GetMapping(value = "/greeter")
    public Greeting greeting(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title){
        return new Greeting(name, title);
    }

    @GetMapping(value = "/appenda/{appendable}")
    public AppendA appenda(@PathVariable(value = "appendable") String appendable){
        return new AppendA(appendable);
    }

    @PostMapping(value = "/dountil/{action}")
    public DoUntil dountil(@PathVariable(value = "action") String action, @RequestBody UntilNumber until){
        return new DoUntil(action, until);
    }

    @PostMapping("/arrays")
    public ArrayHandler sdf(@RequestBody ArrayInput arrayInput){
        return new ArrayHandler(arrayInput.getWhat(), arrayInput.getNumbers());
    }

//    @GetMapping(value = "/log")
//    public Log log(){
//        return Log
//    }
}
