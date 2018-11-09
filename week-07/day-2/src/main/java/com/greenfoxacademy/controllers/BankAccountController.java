package com.greenfoxacademy.controllers;


import com.greenfoxacademy.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {
    List<BankAccount> accounts = new ArrayList<>();

    public BankAccountController() {
        BankAccount Simba = new BankAccount("Simba", "5000", "Lion");
        BankAccount Scar = new BankAccount("Scar", "10000", "Lion");
        BankAccount Mufasa = new BankAccount("Mufasa", "7000", "Lion");
        BankAccount Zazu = new BankAccount("Zazu", "500", "Bird");
        accounts = Arrays.asList(Simba, Scar, Mufasa, Zazu);

    }

    @RequestMapping(value = "/show")
    public String show(Model model){
        BankAccount newBankAccount = new BankAccount("Simba", "2000", "lion");
        accounts.add(newBankAccount);
        model.addAttribute("name", newBankAccount.getName());
        model.addAttribute("balance", newBankAccount.getBalance());
        model.addAttribute("animalType", newBankAccount.getAnimalType());
        model.addAttribute("currency", newBankAccount.getCurrency());
        return "accounts";
    }

    @RequestMapping(value = "/ception")
    @ResponseBody
    public String ception(){
        return "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    }

    @RequestMapping(value = "/ception2")
    public String ception2(){
        return "ception";
    }

    @GetMapping("/show-all")
    public String showAll(String name, Model model){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getName().equals(name)){
//                accounts.get(i).setBalance();
            }
        }
        model.addAttribute("accounts", accounts);
        return "allaccounts";
    }
}
