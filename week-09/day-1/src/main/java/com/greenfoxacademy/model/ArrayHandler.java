package com.greenfoxacademy.model;

import java.util.List;

public class ArrayHandler {
    Object result;
    String error;

    public ArrayHandler(String what, List<Integer> numbers) {
        if (what == null){
            error = "Please provide what to do with the numbers!";
        }
        else if (numbers == null){
            error = "Please provide what to do with the numbers!";
        }
        else if (what.equals("sum")){
            
        }

    }
}
