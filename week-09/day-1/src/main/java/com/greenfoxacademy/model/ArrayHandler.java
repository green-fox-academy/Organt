package com.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ArrayHandler {
    Object result;
    String error;

    public ArrayHandler(String what, int[] numbers) {
        if (what == null || numbers == null){
            error = "Please provide what to do with the numbers!";
        }
        else if (what.equals("sum")){
            Integer sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            this.result = sum;
        }
        else if (what.equals("multiply")){
            Integer multiplicator = 1;
            for (int i = 0; i < numbers.length; i++) {
                multiplicator = numbers[i] * multiplicator;
            }
            this.result = multiplicator;
        }
        else if (what.equals("double")){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                list.add(2 * numbers[i]);
            }
            result = list;
        }

    }

    public Object getResult() {
        return result;
    }

    public String getError() {
        return error;
    }


}
