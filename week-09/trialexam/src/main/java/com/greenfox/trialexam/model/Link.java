package com.greenfox.trialexam.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String url;
    String alias;
    int hitCount;
    @JsonIgnore
    String secretCode;

    public Link() {
    }

    public Link(String url, String alias) {
        this.url = url;
        this.alias = alias;
        secretCode = String.format("%04d", (int)(Math.random()*10000));
    }

    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getAlias() {
        return alias;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setHitCount(int hitCount) {
        this.hitCount += hitCount;
    }
}
