package com.example.pokelist.model;

public class PokePojo {

    private String name;
    private String url;
    private int number;
    private int base_experience;
    private int height;

    public PokePojo(String name, String url, int number, int base_experience, int height) {
        this.name = name;
        this.url = url;
        this.number = number;
        this.base_experience = base_experience;
        this.height = height;
    }
    public int getNumber() {
        String [] urlPartes = url.split("/");
        return Integer.parseInt(urlPartes[urlPartes.length - 1]);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
