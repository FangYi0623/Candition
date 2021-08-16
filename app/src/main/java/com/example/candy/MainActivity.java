package com.example.candy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.planner.R;

public class MainActivity extends AppCompatActivity {
    TextView tvGummy, tvChoco, tvMints;
    ImageView ivGummy, ivChoco, ivMints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvChoco = findViewById(R.id.tvChoco);
        tvGummy = findViewById(R.id.tvGummy);
        tvMints = findViewById(R.id.tvMints);
        ivChoco = findViewById(R.id.ivChoco);
        ivGummy = findViewById(R.id.ivGummy);
        ivMints = findViewById(R.id.ivMints);

        ivChoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, chocolate.class);
                startActivity(i);
            }
        });

        ivGummy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, gummy.class);
                startActivity(i);
            }
        });

        ivMints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, mints.class);
                startActivity(i);
            }
        });

        tvChoco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, chocolate.class);
                startActivity(i);
            }
        });

        tvGummy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, gummy.class);
                startActivity(i);
            }
        });

        tvMints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, mints.class);
                startActivity(i);
            }
        });

    }
}