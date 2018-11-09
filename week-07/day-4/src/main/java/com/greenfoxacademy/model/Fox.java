package com.greenfoxacademy.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
public class Fox {
    String name;
    List<String> listOfTricks = new ArrayList<>();
    String food = "no food";
    String drink = "no drink";

    public Fox() {
        name = "Mr.Green";
        food = "pizza";
        drink = "lemonade";
        listOfTricks.add("write HTML");
        listOfTricks.add("code in Java");
    }


    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getListOfTricks() {
        return listOfTricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfTricks(List<String> listOfTricks) {
        this.listOfTricks = listOfTricks;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
