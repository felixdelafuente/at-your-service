package com.example.at_your_service;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Notifications extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_notifications);

        listView = findViewById(R.id.listViewNotifications);

        //Create Data
        ArrayList<Person1> arrayList = new ArrayList<>();

        arrayList.add(new Person1(R.drawable.notification_message_icon, "New Message From Mika","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor..."));
        arrayList.add(new Person1(R.drawable.notification_message_icon, "New Message From Philip", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor..."));
        arrayList.add(new Person1(R.drawable.briefcase_blue_icon, "Mika Asks for a Feedback", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor..."));

        //We make custom adapter
        PersonAdapter1 personAdapter = new PersonAdapter1(this,R.layout.notifications_item,arrayList);
        listView.setAdapter(personAdapter);

        ImageButton navExplore = findViewById(R.id.navExplore);
        navExplore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Notifications.this, ExploreMenuClient.class));
            }
        });
        ImageButton navMessage = findViewById(R.id.navMessage);
        navMessage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Notifications.this, MessagesMenu.class));
            }
        });
        ImageButton navJob = findViewById(R.id.navJob);
        navJob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Notifications.this, DashboardClient.class));
            }
        });
        ImageButton navNotif = findViewById(R.id.navNotif);
        navNotif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Notifications.this, Notifications.class));
            }
        });
        ImageButton navProfile = findViewById(R.id.navProfile);
        navProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Notifications.this, Profile.class));
            }
        });

    }

}