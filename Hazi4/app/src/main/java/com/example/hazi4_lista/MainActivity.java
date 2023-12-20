package com.example.hazi4_lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] currencies = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};
    private String[] prices = {"100.50", "120.75", "88.90", "143.25", "75.60"};
    private Integer[] images={R.drawable.eur, R.drawable.usd,R.drawable.gbp, R.drawable.aud, R.drawable.cad, R.drawable.chf, R.drawable.dkk, R.drawable.huf};

    ListView currencyListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currencyListView = findViewById(R.id.currencyListView);
        CustomListAdapter adapter = new CustomListAdapter(this, currencies, prices, images);
        currencyListView.setAdapter(adapter);
        }
    }