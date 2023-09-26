package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeArms extends AppCompatActivity {

    CardView homechinpullups;
    CardView homefloortricepdips;
    CardView homemilitarypushups;
    CardView homepushuplowhold;
    CardView hometricepstretch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_arms);

        homechinpullups=findViewById(R.id.homechinpullups);
        homefloortricepdips=findViewById(R.id.homefloortricepdips);
        homemilitarypushups=findViewById(R.id.homemillitarypushups);
        homepushuplowhold=findViewById(R.id.homepushuplowhold);
        hometricepstretch=findViewById(R.id.hometricepstretch);


        homechinpullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeArms.this,HomeChinpullups.class));
            }
        });

        homefloortricepdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeArms.this,HomeFloortricepdips.class));
            }
        });

        homemilitarypushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeArms.this,HomeMilitarypushups.class));
            }
        });

        homepushuplowhold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeArms.this,HomePushuplowhold.class));
            }
        });

        hometricepstretch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeArms.this,HomeTricepstretch.class));
            }
        });
    }
}