package com.example.at_your_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class DashboardClient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dashboard_client);

        Button btnFindWorker = findViewById(R.id.buttonFindWorker);
        btnFindWorker.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DashboardClient.this, ExploreClientRecruit.class));
            }
        });

        ImageButton navExplore = findViewById(R.id.navExplore);
        navExplore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DashboardClient.this, ExploreMenuClient.class));
            }
        });
        ImageButton navMessage = findViewById(R.id.navMessage);
        navMessage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DashboardClient.this, MessagesMenu.class));
            }
        });
        ImageButton navJob = findViewById(R.id.navJob);
        navJob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DashboardClient.this, DashboardClient.class));
            }
        });
        ImageButton navNotif = findViewById(R.id.navNotif);
        navNotif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DashboardClient.this, Notifications.class));
            }
        });
        ImageButton navProfile = findViewById(R.id.navProfile);
        navProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(DashboardClient.this, Profile.class));
            }
        });


    }
}