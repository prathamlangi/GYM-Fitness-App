package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeChest extends AppCompatActivity {

    CardView homejumpjack;
    CardView homeinclinepushup;
    CardView homepushups;
    CardView homehindupushups;
    CardView homedaimondpushups;
    CardView homecobrastretch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chest);

        homejumpjack=findViewById(R.id.homejumpjack);
        homeinclinepushup=findViewById(R.id.homeinclinepushup);
        homepushups=findViewById(R.id.homepushups);
        homehindupushups=findViewById(R.id.homehindupushups);
        homedaimondpushups=findViewById(R.id.homedaimondpushups);
        homecobrastretch=findViewById(R.id.homecobrastretch);


        homejumpjack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeChest.this,HomeJumpjack.class));
            }
        });

        homeinclinepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeChest.this,HomeInclinepushup.class));
            }
        });

        homepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeChest.this,HomePushups.class));
            }
        });

        homehindupushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeChest.this,HomeHindupushups.class));
            }
        });

        homedaimondpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeChest.this,HomeDiamondpushups.class));
            }
        });

        homecobrastretch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeChest.this,HomeCobrastretch.class));
            }
        });
    }
}