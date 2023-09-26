package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PPLWorkout extends AppCompatActivity {

    ImageView pplpush;
    ImageView pplpull;
    ImageView ppllegs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pplworkout);
        pplpush=findViewById(R.id.pplpush);
        pplpull=findViewById(R.id.pplpull);
        ppllegs=findViewById(R.id.ppllegs);

        pplpush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PPLWorkout.this,PPLPush.class));
            }
        });

        pplpull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PPLWorkout.this,PPlPull.class));
            }
        });

        ppllegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PPLWorkout.this,PPlLegs.class));
            }
        });
    }
}