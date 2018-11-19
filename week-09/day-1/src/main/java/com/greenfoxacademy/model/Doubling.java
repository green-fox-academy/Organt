package com.greenfoxacademy.model;

public class Doubling {
    Integer received;
    Integer result;
    String error;


    public Doubling(Integer input) {
        if (input == null){
            error = "Please provide an input!";
        }
        else {
            this.received = input;
            result = 2 * input;
        }
    }

    public Integer getReceived() {
        return received;
    }

    public Integer getResult() {
        return result;
    }

    public String getError() {
        return error;
    }
}
