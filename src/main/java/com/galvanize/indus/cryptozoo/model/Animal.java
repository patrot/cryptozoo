package com.galvanize.indus.cryptozoo.model;

import javax.persistence.Entity;

@Entity
public class Animal {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
}
