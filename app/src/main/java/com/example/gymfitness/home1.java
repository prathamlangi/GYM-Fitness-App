package com.example.gymfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class home1 extends AppCompatActivity {

    private int selectedTab=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);

        final LinearLayout homeLayout=findViewById(R.id.home);
        final LinearLayout reportLayout=findViewById(R.id.report);
        final LinearLayout calculatorLayout=findViewById(R.id.calculator);
        final LinearLayout profileLayout=findViewById(R.id.profile);

        final ImageView homeimg=findViewById(R.id.homeimg);
        final ImageView reportimg=findViewById(R.id.reportimg);
        final ImageView calculatorimg=findViewById(R.id.calculatorimg);
        final ImageView profileimg=findViewById(R.id.profileimg);

        final TextView hometxt=findViewById(R.id.hometxt);
        final TextView reporttxt=findViewById(R.id.reporttxt);
        final TextView calculatortxt=findViewById(R.id.calculatortxt);
        final TextView profiletxt=findViewById(R.id.profiletxt);

        //set home fragment default
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentcontainer,HomeFragment.class,null)
                .commit();

        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab !=1){
                    //set home fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentcontainer,HomeFragment.class,null)
                            .commit();

                    reporttxt.setVisibility(view.GONE);
                    calculatortxt.setVisibility(view.GONE);
                    profiletxt.setVisibility(view.GONE);

                    reportimg.setImageResource(R.drawable.ic_baseline_show_chart_24);
                    calculatorimg.setImageResource(R.drawable.ic_baseline_calculate_24);
                    profileimg.setImageResource(R.drawable.ic_baseline_person_24);

                    reportLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    calculatorLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    profileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    hometxt.setVisibility(View.VISIBLE);
                    homeimg.setImageResource(R.drawable.ic_baseline_home_selected_24);
                    homeLayout.setBackgroundResource(R.drawable.round_back_home_100);

                    ScaleAnimation scaleAnimation=new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    homeLayout.startAnimation(scaleAnimation);

                    selectedTab=1;
                }

            }
        });

        reportLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab !=2) {

                    //set fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentcontainer,ReportFragment.class,null)
                            .commit();

                    hometxt.setVisibility(view.GONE);
                    calculatortxt.setVisibility(view.GONE);
                    profiletxt.setVisibility(view.GONE);

                    homeimg.setImageResource(R.drawable.ic_baseline_home_24);
                    calculatorimg.setImageResource(R.drawable.ic_baseline_calculate_24);
                    profileimg.setImageResource(R.drawable.ic_baseline_person_24);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    calculatorLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    profileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    reporttxt.setVisibility(View.VISIBLE);
                    reportimg.setImageResource(R.drawable.ic_baseline_show_chart_selected_24);
                    reportLayout.setBackgroundResource(R.drawable.round_back_home_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    reportLayout.startAnimation(scaleAnimation);

                    selectedTab = 2;
                }
            }
        });

        calculatorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (selectedTab !=3) {
                        //set fragment
                        getSupportFragmentManager().beginTransaction()
                                .setReorderingAllowed(true)
                                .replace(R.id.fragmentcontainer,calculatorFragment.class,null)
                                .commit();

                        hometxt.setVisibility(view.GONE);
                        reporttxt.setVisibility(view.GONE);
                        profiletxt.setVisibility(view.GONE);

                        homeimg.setImageResource(R.drawable.ic_baseline_home_24);
                        reportimg.setImageResource(R.drawable.ic_baseline_show_chart_24);
                        profileimg.setImageResource(R.drawable.ic_baseline_person_24);

                        homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        reportLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        profileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                        calculatortxt.setVisibility(View.VISIBLE);
                        calculatorimg.setImageResource(R.drawable.ic_baseline_calculate_selected_24);
                        calculatorLayout.setBackgroundResource(R.drawable.round_back_home_100);

                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                        scaleAnimation.setDuration(200);
                        scaleAnimation.setFillAfter(true);
                        calculatorLayout.startAnimation(scaleAnimation);

                        selectedTab = 3;
                    }
            }

        });

        profileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab != 4) {
                    //set fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentcontainer,profileFragment.class,null)
                            .commit();

                    hometxt.setVisibility(view.GONE);
                    reporttxt.setVisibility(view.GONE);
                    calculatortxt.setVisibility(view.GONE);

                    homeimg.setImageResource(R.drawable.ic_baseline_home_24);
                    reportimg.setImageResource(R.drawable.ic_baseline_show_chart_24);
                    calculatorimg.setImageResource(R.drawable.ic_baseline_person_24);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    reportLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    calculatorLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    profiletxt.setVisibility(View.VISIBLE);
                    profileimg.setImageResource(R.drawable.ic_baseline_person_selected_24);
                    profileLayout.setBackgroundResource(R.drawable.round_back_home_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    profileLayout.startAnimation(scaleAnimation);

                    selectedTab = 4;
                }
            }
        });

    }
}