package com.greenfoxacademy.model;

public class AppendA {

    String appended;

    public AppendA(String string) {
        this.appended = string + "a";
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }

    public String getAppended() {
        return appended;
    }
}
