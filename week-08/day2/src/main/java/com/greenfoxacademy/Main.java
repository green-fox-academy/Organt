package com.greenfoxacademy;

import com.greenfoxacademy.model.Todo;
import com.greenfoxacademy.repository.TodoRepo;
import com.sun.glass.ui.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    TodoRepo database;

    public Main(TodoRepo database) {
        this.database = database;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        database.save(new Todo("Start the day"));
        database.save(new Todo("Finish H2 workshop1"));
        database.save(new Todo("Finish JPA workshop2"));
        database.save(new Todo("Create a CRUD project"));

    }
}
