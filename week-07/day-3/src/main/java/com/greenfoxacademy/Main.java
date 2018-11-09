package com.greenfoxacademy;

import com.greenfoxacademy.model.MyColor;
import com.greenfoxacademy.model.PinkColor;
import com.greenfoxacademy.model.Printer;
import com.greenfoxacademy.model.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class Main implements CommandLineRunner{
    Printer printer;
    MyColor color;

    @Autowired
    public Main(Printer printer, MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        color.printColor();
    }
}
