package com.greenfox.trialexam.controller;

import com.greenfox.trialexam.model.Link;
import com.greenfox.trialexam.repository.LinksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    LinksRepo repo;

    @Autowired
    public MainController(LinksRepo repo) {
        this.repo = repo;
    }


    @GetMapping(value = "/")
    public String dsfsf(Model model) {
        return "link";
    }

    @PostMapping(value = "/save-link")
    public String sdfasdf(Model model, String url, String alias){
        for (int i = 0; i < repo.findAll().size(); i++) {
            if (repo.findAll().get(i).getAlias().equals(alias)){
                model.addAttribute("error", "Your alias is already in use!");
                return "link";
            }
        }
        Link newLink = new Link(url, alias);
        repo.save(newLink);
        model.addAttribute("link", newLink);
        return "link";
    }


    @GetMapping("/a/{alias}")
    public Object asfda(@PathVariable(value = "alias", required = false) String alias) {
        if (alias != null) {
            repo.findByAlias(alias).setHitCount(1);
            repo.save(repo.findByAlias(alias));
            return "redirect:http://" + repo.findByAlias(alias).getUrl();
        }
        else return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
