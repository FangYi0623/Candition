package com.example.candy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.planner.R;

public class gummy extends AppCompatActivity {
    Button btnWorms, btnBear, btnFruit, btnbelts, btnStraw, btnBites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gummy);
        
        btnBear = findViewById(R.id.btnBear);
        btnbelts = findViewById(R.id.btnBelts);
        btnBites = findViewById(R.id.btnBites);
        btnFruit = findViewById(R.id.btnFruit);
        btnStraw = findViewById(R.id.btnStraw);
        btnWorms = findViewById(R.id.btnWorms);

        btnBear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(gummy.this);

                myBuilder.setTitle("Welcome to the gummy world!");
                myBuilder.setMessage("Gummy bears are one of the most popular gummy varieties in the world. They are made mostly out of gelatin and has many colours.");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

        btnbelts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(gummy.this);

                myBuilder.setTitle("Welcome to the gummy world!");
                myBuilder.setMessage("Gummy belts are long candies that are fun to eat and they come in many forms: rolled-up and strips.");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

        btnBites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(gummy.this);

                myBuilder.setTitle("Welcome to the gummy world!");
                myBuilder.setMessage("Gummy bites are small sized gummies and are bit-sized pieces. They can be sour, sweet or both due to the sugar coating or is they contain malic acid.");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

        btnFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(gummy.this);

                myBuilder.setTitle("Welcome to the gummy world!");
                myBuilder.setMessage("Fruit gummies are sweets that are in the shape of fruits. They can be used to teach the toddlers to learn about the variety of fruits by using the gummies as a reward for answering correctly!");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

        btnStraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(gummy.this);

                myBuilder.setTitle("Welcome to the gummy world!");
                myBuilder.setMessage("Straw gummies can be used literally as a straw to enhance the flavours of various liquids/drinks but is not represented to use it with plain water. It is hollow in the middle so liquid can ngo through it and get sipped up by us!");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

        btnWorms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(gummy.this);

                myBuilder.setTitle("Welcome to the gummy world!");
                myBuilder.setMessage("The longest gummy worm in the world so far is 26-inches. They may have multiple colours in a worm and each represent different flavours. They may be sour if there is a sugar/powder coating outside of it.");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

    }
}