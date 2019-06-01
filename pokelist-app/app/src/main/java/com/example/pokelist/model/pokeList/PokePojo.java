package com.example.pokelist.model.pokeList;

import java.util.ArrayList;

public class PokePojo {

    private String name;
    private String url;
    private int number;
    private ArrayList<Sprites> img_result;

    public ArrayList<Sprites> getImg_result() {
        return img_result;
    }

    public void setImg_result(ArrayList<Sprites> img_result) {
        this.img_result = img_result;
    }

    public PokePojo(String name, String url, int number, ArrayList<Sprites> img_result) {
        this.name = name;
        this.url = url;
        this.number = number;
        this.img_result = img_result;
    }
    public int setNumber() {
        String [] urlPartes = url.split("/");
        return Integer.parseInt(urlPartes[urlPartes.length - 1]);
    }

    public void getNumber(int number) {
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

}
