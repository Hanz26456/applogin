package com.hanz.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class Login extends AppCompatActivity {
    private AppCompatButton btn_login, btn_signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.appCompatButton2);
        btn_signUp = findViewById(R.id.appCompatButton);

        btn_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Menu.class);
                startActivity(intent);
            }
        });
        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}