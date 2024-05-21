package com.example.checpoint4.dealers.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Dealer {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private boolean isOwner;

    public Dealer(){}

    public Dealer(long id, String name, boolean isOwner) {
        this.id = id;
        this.name = name;
        this.isOwner = isOwner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }
}
