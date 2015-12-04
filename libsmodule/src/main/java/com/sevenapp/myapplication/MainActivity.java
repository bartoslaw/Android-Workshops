package com.sevenapp.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.TextHttpResponseHandler;
import com.sevenapp.myapplication.backend.handler.WeatherRequest;
import com.sevenapp.myapplication.models.WeatherModel;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getWeather();
    }

    private void getWeather() {
        //TODO wywołaj funkcje WeatherRequest.getWeather z odpowiednimi parametrami (dla miasta Poznan oraz dla 8 ostatnich dni)
        //hint1: http://loopj.com/android-async-http/
        //TODO Przy pomocy Gson przeprasuj otrzymany wynik (http://google.github.io/gson/apidocs/)

    }

    private void init() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    }

    private void initRecyclerView(WeatherModel data) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setAdapter();
    }



}
