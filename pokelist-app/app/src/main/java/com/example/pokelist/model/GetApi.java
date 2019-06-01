package com.example.pokelist.model;

import com.example.pokelist.model.pokeList.ListPojo;
import com.example.pokelist.model.pokeList.PokePojo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetApi {

    @GET("pokemon")
    Call<ListPojo> getAllCards();

    @GET("pokemon/{id}")
    Call<PokePojo> getCard(@Path("id") String id);
}
