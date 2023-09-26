package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplitWorkout extends AppCompatActivity {

    ImageView splitchest;
    ImageView splitback;
    ImageView splitshoulder;
    ImageView splitarms;
    ImageView splitlegs;
    ImageView splitabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split_workout);

        splitchest=findViewById(R.id.splitchest);
        splitback=findViewById(R.id.splitback);
        splitshoulder=findViewById(R.id.splitshoulder);
        splitarms=findViewById(R.id.splitarms);
        splitlegs=findViewById(R.id.splitlegs);
        splitabs=findViewById(R.id.splitabs);

        splitchest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplitWorkout.this,SplitChest.class));
            }
        });
        splitback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplitWorkout.this,SplitBack.class));
            }
        });
        splitshoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplitWorkout.this,SplitShoulder.class));
            }
        });
        splitarms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplitWorkout.this,SplitArms.class));
            }
        });
        splitlegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplitWorkout.this,SplitLegs.class));
            }
        });
        splitarms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplitWorkout.this,SplitArms.class));
            }
        });
    }
}