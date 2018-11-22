package com.greenfox.trialexam.controller;

import com.greenfox.trialexam.model.Link;
import com.greenfox.trialexam.model.SecretCode;
import com.greenfox.trialexam.repository.LinksRepo;
import jdk.net.SocketFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RESTMainController {

    @Autowired
    LinksRepo linksRepo;
//    public RESTMainController(LinksRepo linksRepo) {
//        this.linksRepo = linksRepo;
//    }

    @GetMapping("/api/links")
    public List<Link> sfsd() {
        return linksRepo.findAll();
    }

    @DeleteMapping(value = "/api/links/{id}")
    public ResponseEntity<Void> sfw(@PathVariable(value = "id") Long id, @RequestBody SecretCode secretCode) {
        System.out.println("hi there");
        if (linksRepo.findAnyById(id) == null){
            System.out.println("(id) == null");

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else if (linksRepo.findById(id).get().getSecretCode().equals(secretCode.getSecretCode())){
            System.out.println("linksRepo.findById(id).get().getSecretCode().equals(secretCode.getSecretCode())");
            linksRepo.delete(linksRepo.findById(id).get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else {
            System.out.println("else");

            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }
}
