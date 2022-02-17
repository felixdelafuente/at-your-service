package com.example.at_your_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button btnLogin;
    Button btnRegister;
    EditText typedEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

        btnLogin = (Button)findViewById(R.id.btnLoginLogin);
        typedEmail = (EditText) findViewById(R.id.txtLoginEmail);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (typedEmail.getText().toString().equals("worker@gmail.com")) {
                    startActivity(new Intent(Login.this, ExploreMenu.class));
                } else if (typedEmail.getText().toString().equals("client@gmail.com")) {
                    startActivity(new Intent(Login.this, ExploreMenuClient.class));
                }
            }
        });

        btnRegister = (Button)findViewById(R.id.btnLoginRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(Login.this, RegisterMenu.class));
            }
        });
    }
}