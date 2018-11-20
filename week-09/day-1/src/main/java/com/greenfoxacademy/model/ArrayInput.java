package com.greenfoxacademy.model;

import java.util.List;

public class ArrayInput {
    int[] numbers;
    String what;

    public ArrayInput() {
    }

    public ArrayInput(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
