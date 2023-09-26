package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Slplashscreen extends AppCompatActivity {


    ImageView imageView;
    TextView textView;
    TextView textsView;
    Animation down,downs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slplashscreen);


//        ImageView imageView=findViewById(R.id.appsplash);
//        down= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
//        textView.setAnimation(down);

        TextView textView=findViewById(R.id.appname);
        down= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        textView.setAnimation(down);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();

            }
        },3500);

    }
}