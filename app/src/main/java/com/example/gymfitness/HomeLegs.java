package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeLegs extends AppCompatActivity {

    CardView homesquats;
    CardView homelunges;
    CardView homejumpsquats;
    CardView homewallsit;
    CardView homebutterflystretch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_legs);

        homesquats=findViewById(R.id.homesquats);
        homelunges=findViewById(R.id.homelunges);
        homejumpsquats=findViewById(R.id.homejumpsquats);
        homewallsit=findViewById(R.id.homewallsit);
        homebutterflystretch=findViewById(R.id.homebutterflystretch);



        homesquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeLegs.this,HomeSquats.class));
            }
        });

        homelunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeLegs.this,HomeLunges.class));
            }
        });

        homejumpsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeLegs.this,HomeJumpSquats.class));
            }
        });

        homewallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeLegs.this,HomeWallsit.class));
            }
        });

        homebutterflystretch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeLegs.this,HomeButterflystretch.class));
            }
        });
    }
}