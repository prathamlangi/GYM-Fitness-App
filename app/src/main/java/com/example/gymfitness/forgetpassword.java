package com.example.gymfitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgetpassword extends AppCompatActivity {


    TextView backtologin;
    Button btnForget;
    EditText inputEmail1;
    String email;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        auth=FirebaseAuth.getInstance();

        inputEmail1=findViewById(R.id.inputEmail1);
        btnForget=findViewById(R.id.btnForget);
        backtologin=findViewById(R.id.backtologin);

        backtologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(forgetpassword.this,MainActivity.class));
            }
        });

        btnForget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateData();
            }
        });

    }

    private void validateData() {
        email=inputEmail1.getText().toString();
        if (email.isEmpty()){
            inputEmail1.setError("Required");
        }
        else{
            forgetPass();
        }
    }

    private void forgetPass() {
        auth.sendPasswordResetEmail(email)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(forgetpassword.this, "Check your Email", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(forgetpassword.this,MainActivity.class));
                            finish();
                        }
                        else {
                            Toast.makeText(forgetpassword.this, "Error"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}