package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeAbs extends AppCompatActivity {

    CardView homesitups;
    CardView homebicyclecrunches;
    CardView homevups;
    CardView homerussiantwist;
    CardView homeplank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_abs);

        homesitups=findViewById(R.id.homesitups);
        homebicyclecrunches=findViewById(R.id.homebicyclecrunches);
        homevups=findViewById(R.id.homevups);
        homerussiantwist=findViewById(R.id.homerussiantwist);
        homeplank=findViewById(R.id.homeplank);


        homesitups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAbs.this,HomeSitups.class));
            }
        });

        homebicyclecrunches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAbs.this,HomeBicyclecrunches.class));
            }
        });

        homevups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAbs.this,HomeVups.class));
            }
        });

        homerussiantwist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAbs.this,HomeRussiantwist.class));
            }
        });

        homeplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAbs.this,HomePlank.class));
            }
        });
    }
}