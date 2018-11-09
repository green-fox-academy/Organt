package com.greenfoxacademy.Organt.controllers;

import com.greenfoxacademy.Organt.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
    AtomicLong id=new AtomicLong();

    @RequestMapping(value="/greeting")
    public Greeting greeting(String name){
        return new Greeting(id.incrementAndGet(), "Hello, " + name);
    }
}
