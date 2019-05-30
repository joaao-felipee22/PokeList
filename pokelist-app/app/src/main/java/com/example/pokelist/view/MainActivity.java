package com.example.pokelist.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.pokelist.R;
import com.example.pokelist.controller.PokeAdapter;
import com.example.pokelist.model.Client;
import com.example.pokelist.model.GetApi;
import com.example.pokelist.model.ListPojo;
import com.example.pokelist.model.PokePojo;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private PokeAdapter adapter;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetApi service = Client.getClient().create(GetApi.class);

        Call<ListPojo> call = service.getAllCards();
        call.enqueue(new Callback<ListPojo>() {


            @Override
            public void onResponse(Call<ListPojo> call, Response<ListPojo> response) {
                generateListCards(response.body().getResults());
            }

            @Override
            public void onFailure(Call<ListPojo> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Ocorreu um erro, tente mais tarde!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }


    private void generateListCards(ArrayList<PokePojo> listaCards) {

        recyclerView = (RecyclerView) findViewById(R.id.recycler_poke);

        adapter = new PokeAdapter(listaCards, MainActivity.this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
}
