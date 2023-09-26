package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeWorkout1 extends AppCompatActivity {
     ImageView mhomechest;
     ImageView mhomeback;
     ImageView mhomeshoulder;
     ImageView mhomearms;
     ImageView mhomelegs;
     ImageView mhomeabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_workout1);
        mhomechest=findViewById(R.id.homechest);
        mhomeback=findViewById(R.id.homeback);
        mhomeshoulder=findViewById(R.id.homeshoulder);
        mhomearms=findViewById(R.id.homearms);
        mhomelegs=findViewById(R.id.homelegs);
        mhomeabs=findViewById(R.id.homeabs);


        mhomechest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeWorkout1.this,HomeChest.class));
            }
        });

        mhomeback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeWorkout1.this,HomeBack.class));
            }
        });

        mhomeshoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeWorkout1.this,HomeShoulder.class));
            }
        });

        mhomearms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeWorkout1.this,HomeArms.class));
            }
        });

        mhomelegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeWorkout1.this,HomeLegs.class));
            }
        });

        mhomeabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeWorkout1.this,HomeAbs.class));
            }
        });
    }
}