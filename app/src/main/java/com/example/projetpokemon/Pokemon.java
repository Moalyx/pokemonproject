package com.example.projetpokemon;

import java.util.List;

public class Pokemon {

    private  String scream;
    private  String description;
    private  int title;
    private  int image;

    public Pokemon(String scream, String description, int title, int image) {
        this.scream = scream;
        this.description = description;
        this.title = title;
        this.image = image;
    }

    public String getScream() {
        return scream;
    }

    public void setScream(String scream) {
        this.scream = scream;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}