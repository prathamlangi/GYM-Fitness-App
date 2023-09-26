package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeShoulder extends AppCompatActivity {

    CardView homejumpingjack1;
    CardView homepikepushup;
    CardView homehindupushup1;
    CardView homeinchworm;
    CardView homepikepushup1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_shoulder);

        homejumpingjack1=findViewById(R.id.homejumpjack1);
        homepikepushup=findViewById(R.id.homepikepushup);
        homehindupushup1=findViewById(R.id.homehindupushups1);
        homeinchworm=findViewById(R.id.homeinchworm);
        homepikepushup1=findViewById(R.id.homepikepushup1);


        homejumpingjack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeShoulder.this,HomeJumpingjack1.class));
            }
        });

        homepikepushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeShoulder.this,HomePikepushup1.class));
            }
        });

        homehindupushup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeShoulder.this,HomeHindupushup1.class));
            }
        });

        homeinchworm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeShoulder.this,HomeInchworm.class));
            }
        });

        homepikepushup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeShoulder.this,HomePikepushup1.class));
            }
        });
    }
}