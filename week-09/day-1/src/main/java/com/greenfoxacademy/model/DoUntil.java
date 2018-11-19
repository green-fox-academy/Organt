package com.greenfoxacademy.model;

import org.springframework.web.bind.annotation.ResponseBody;

public class DoUntil {
    Integer result;
    String error;



    public void setError(String error) {
        this.error = error;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public DoUntil(String action, UntilNumber until) {
        if (until.getUntil() == null){
            error = "Please provide a number!";
        }
        else if (action.equals("sum")){
            result = 0;
            for (int i = 1; i <= until.getUntil(); i++) {
                result += i;
            }
        }
        else if (action.equals("factor")){
            result = 1;
            for (int i = 1; i <= until.getUntil(); i++) {
                result = i * result;
            }
        }

    }
}
