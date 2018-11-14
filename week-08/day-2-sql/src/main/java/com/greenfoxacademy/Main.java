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
        database.save(new Todo("poklop1"));
        database.save(new Todo("poklop2", true, true));
        database.save(new Todo("poklop3", true, false));
        database.save(new Todo("poklop4", false, true));

    }
}
