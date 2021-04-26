package com.example.projetpokemon;

public class Pokemon {

    private String scream;
    private String description;
    private int title;
    private String imageUrl;
    private String detailUrl;


    public Pokemon(String scream, String description, int title, String imageUrl, String detailUrl) {
        this.scream = scream;
        this.description = description;
        this.title = title;
        this.imageUrl = imageUrl;
        this.detailUrl = detailUrl;
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

    public int getTitle(int position) {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public String getImageUrl(int position) {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDetailUrl(int position) {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }
}