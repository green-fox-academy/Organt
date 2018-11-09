package com.greenfoxacademy.model;

import org.springframework.beans.factory.annotation.Autowired;

public class PinkColor implements MyColor {

    Printer printer;
    @Autowired
    public PinkColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("this is in pink");
    }
}
