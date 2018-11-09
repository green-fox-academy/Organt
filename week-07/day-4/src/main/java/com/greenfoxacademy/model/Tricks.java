package com.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.List;

public class Tricks {
    public List<String> tricks = new ArrayList<>();

    public Tricks() {
        tricks.add("write HTML");
        tricks.add("code in Java");
        tricks.add("dance");
        tricks.add("sing");
        tricks.add("cook");
        tricks.add("joggle");

    }

    public List<String> getTricks() {
        return tricks;
    }
}
