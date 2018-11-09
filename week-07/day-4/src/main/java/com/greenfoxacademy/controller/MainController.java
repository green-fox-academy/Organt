package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Fox;
import com.greenfoxacademy.model.Tricks;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    List<Fox> foxList = new ArrayList<>();
    Fox loggedFox = new Fox();



    @RequestMapping(value = "/")
    public String index(Model model) {

        model.addAttribute("fox", loggedFox);
        return "index";
    }

    @GetMapping(value = "/login")
    public String getLogin(Model model) {

        return "login";
    }

    @PostMapping(value = "/login")
    public String postLogin(String name, Model model) {
        if (!name.isEmpty()) {
            for (Fox fox :
                    foxList) {
                if (fox.getName().equals(name)) {
                    loggedFox = fox;
                    return "redirect:/";
                }
            }
            Fox newFox = new Fox(name);
            foxList.add(newFox);
            loggedFox = newFox;
            return "redirect:/";
        } else {
            model.addAttribute("error", "You didn't choose or created any fox!");
            return "login";
        }
    }

    @GetMapping(value = "/nutritionStore")
    public String nutritionStore(Model model) {
        return "/nutritionStore";
    }

    @PostMapping(value = "/changeNutrition")
    public String postNutrition(String food, String drink, Model model) {
                loggedFox.setFood(food);
                loggedFox.setDrink(drink);
        return "redirect:/";
    }

    @GetMapping(value = "/trickCenter")
    public String getTricks (Model model){
        Tricks alltricks = new Tricks();
        for (int i = 0; i < alltricks.tricks.size(); i++) {
            if (loggedFox.getListOfTricks().contains(alltricks.tricks.get(i))){
                alltricks.tricks.remove(i);
                i--;
            }
        }
        if (alltricks.tricks.size() == 0){
            model.addAttribute("error", "All tricks learned!");
        }
        else model.addAttribute("tricks", alltricks.getTricks());
        return "tricks";
    }

    @PostMapping(value = "/trickCenter")
    public String tricks(String trick, Model model){
        List<String> newTricks = new ArrayList<>();
         newTricks = loggedFox.getListOfTricks();
         newTricks.add(trick);
        loggedFox.setListOfTricks(newTricks);
        return "redirect:/";
    }
}
