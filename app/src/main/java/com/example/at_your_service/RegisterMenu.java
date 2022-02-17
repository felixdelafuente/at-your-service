package com.example.at_your_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;

public class RegisterMenu extends AppCompatActivity {
    LinearLayout registerWorker;
    LinearLayout registerClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_register_menu);

        registerWorker = (LinearLayout)findViewById(R.id.RegisterAsWorker);
        registerWorker.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(RegisterMenu.this, RegisterWorker.class));
            }
        });

        registerClient = (LinearLayout)findViewById(R.id.RegisterAsClient);
        registerClient.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(RegisterMenu.this, RegisterClient.class));
            }
        });
    }
}