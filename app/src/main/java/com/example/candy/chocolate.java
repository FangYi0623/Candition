package com.example.candy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.planner.R;

public class chocolate extends AppCompatActivity {
    Button btnRuby, btnDark, btnCouverture, btnMilk, btnWhite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate);

        btnRuby = findViewById(R.id.btnRuby);
        btnDark = findViewById(R.id.btnDark);
        btnCouverture = findViewById(R.id.btnCouverture);
        btnWhite = findViewById(R.id.btnWhite);
        btnMilk = findViewById(R.id.btnMilk);

        btnMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(chocolate.this);

                myBuilder.setTitle("Welcome to the chocolate world!");
                myBuilder.setMessage("Milk chocolate can be eaten with strawberries and drizzled on frozen yogurt as desserts. It is the most popular form of chocolate in many countries.");
                myBuilder.setCancelable(false);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();

            }
        });

        btnDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(chocolate.this);

                myBuilder.setTitle("Welcome to the chocolate world!");
                myBuilder.setMessage("Dark chocolate can be found commonly in supermarkets and has many types containing different percentages of cocoa powder. The higher the amount, the more bitter/sour it is.");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

        btnRuby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(chocolate.this);

                myBuilder.setTitle("Welcome to the chocolate world!");
                myBuilder.setMessage("Ruby chocolate is a pink chocolate and is sweet. One of its usage is that it is being used in Magnum ice cream.");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

        btnCouverture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(chocolate.this);

                myBuilder.setTitle("Welcome to the chocolate world!");
                myBuilder.setMessage("Couverture chocolate refers to certain class of high-quality chocolate. It is usually eaten as cookie dippings, truffles and dipping molds.");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

        btnWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(chocolate.this);

                myBuilder.setTitle("Welcome to the chocolate world!");
                myBuilder.setMessage("White chocolate is a white chocolate and is sweet. It can be used to coat strawberries to make it into dessert and is a great combination with frozen yogurt.");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });
    }
}