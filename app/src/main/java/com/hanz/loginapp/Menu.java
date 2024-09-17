package com.hanz.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {
    private ImageView logoListMahasiswa, logoKontakMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        logoListMahasiswa = findViewById(R.id.imageView5);
        logoKontakMahasiswa = findViewById(R.id.imageView4);

        logoListMahasiswa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ListMHSActivity2.class);
                startActivity(intent);
            }
        });
        logoKontakMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, .class);
                startActivity(intent);
            }
        });
    }
}