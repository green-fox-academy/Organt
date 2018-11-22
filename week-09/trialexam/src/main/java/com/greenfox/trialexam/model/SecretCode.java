package com.greenfox.trialexam.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.greenfox.trialexam.repository.LinksRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class SecretCode {
    String secretCode;

    public SecretCode() {
    }

    public SecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public String getSecretCode() {
        return secretCode;
    }
}
