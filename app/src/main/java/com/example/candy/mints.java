package com.example.candy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.planner.R;

public class mints extends AppCompatActivity {
    Button btnSpear, btnPepper, btnCandyCane;
    ImageView ivSpear, ivPepper, ivCandyCane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mints);

        ivCandyCane = findViewById(R.id.ivCandyCane);
        ivPepper = findViewById(R.id.ivPepper);
        ivSpear = findViewById(R.id.ivSpear);
        btnCandyCane = findViewById(R.id.btnCandyCane);
        btnPepper = findViewById(R.id.btnPepper);
        btnSpear = findViewById(R.id.btnSpear);

        btnSpear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(mints.this);

                myBuilder.setTitle("Welcome to the mint world!");
                myBuilder.setMessage("This candy is made of spearmint. It has a refreshing and cooling sensation to the mouth");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();

            }
        });

        btnPepper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(mints.this);

                myBuilder.setTitle("Welcome to the mint world!");
                myBuilder.setMessage("This candy is made of peppermint. It is sweet and beautiful. It is not found in areas such as Singapore");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

        btnCandyCane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(mints.this);

                myBuilder.setTitle("Welcome to the mint world!");
                myBuilder.setMessage("Candy cane is made of peppermint. It is sweet and often appears during christmas.");
                myBuilder.setCancelable(true);
                myBuilder.setNeutralButton("OK", null);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });
    }
}