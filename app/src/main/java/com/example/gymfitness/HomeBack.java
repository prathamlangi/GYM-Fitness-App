package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeBack extends AppCompatActivity {

    CardView homepullups;
    CardView homehyperextension;
    CardView homesupinepushup;
    CardView homeflooryraises;
    CardView homechildpose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_back);


        homepullups=findViewById(R.id.homepullups);
        homehyperextension=findViewById(R.id.homehyperextension);
        homesupinepushup=findViewById(R.id.homesupinepushup);
        homeflooryraises=findViewById(R.id.homeflooryraises);
        homechildpose=findViewById(R.id.homechildpose);


        homepullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeBack.this,HomePullups.class));
            }
        });

        homehyperextension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeBack.this,HomeHyperextension.class));
            }
        });

        homesupinepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeBack.this,HomeSupinepushup.class));
            }
        });

        homeflooryraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeBack.this,HomeFloorYraises.class));
            }
        });

        homechildpose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeBack.this,HomeChildpose.class));
            }
        });
    }
}