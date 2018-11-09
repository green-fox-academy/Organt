package com.greenfoxacademy.model;

import java.text.DecimalFormat;

public class BankAccount {
    static int maxID = 0;
    int id;
    String name;
    DecimalFormat df = new DecimalFormat("0.00");
    String balance;
    String currency = "Zebra";
    String animalType;
    boolean King;
    String character;

    public BankAccount(String name, String number, String animalType) {
        maxID++;
        this.id = maxID;
        this.name = name;
        balance = df.format(Integer.parseInt(number));
        this.animalType = animalType;
        if (name.equals("Simba")) {
            King = true;
        } else King = false;
        if (name.equals("Mufasa")) {
            character = "Bad Guy";
        } else {
            character = "Good Guy";
        }
    }

        public String getName () {
            return name;
        }

        public String getBalance () {
            return balance;
        }

        public String getCurrency () {
            return currency;
        }

        public String getAnimalType () {
            return animalType;
        }

        public int getId () {
            return id;
        }

        public boolean isKing () {
            return King;
        }


    public String getCharacter() {
        return character;
    }

    public void setBalance() {
        balance = "12";
    }
}
