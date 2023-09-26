package com.example.gymfitness;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class HomeFragment extends Fragment {

    ImageView mhomeworkout1;
    ImageView mpplworkout;
    ImageView msplitworkout;
    ImageView mhomeworkout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        mhomeworkout1=view.findViewById(R.id.homeworkout1);
        mpplworkout=view.findViewById(R.id.pplworkout);
        msplitworkout=view.findViewById(R.id.splitworkout);
        mhomeworkout=view.findViewById(R.id.homeworkout);


        mhomeworkout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),HomeWorkout1.class));
            }
        });

        mpplworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),PPLWorkout.class));
            }
        });

        msplitworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),SplitWorkout.class));
            }
        });

        mhomeworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),HomeWorkout.class));
            }
        });

        return view;
    }
}