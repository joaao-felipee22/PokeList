package com.example.pokelist.model.pokeList;

import java.util.ArrayList;

public class ListPojo {

    private ArrayList<PokePojo> results;

    public ArrayList<PokePojo> getResults() {
        return results;
    }

    public void setResults(ArrayList<PokePojo> results) {
        this.results = results;
    }

    public ListPojo(ArrayList<PokePojo> results) {
        this.results = results;
    }




}
