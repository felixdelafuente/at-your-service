package com.example.at_your_service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MessagesMenu extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_messages_menu);

        listView = findViewById(R.id.listviewMessages);

        //Create Data
        ArrayList<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person(R.drawable.mika_perlado_worker,"Mika Perlado","Thank you!", "Today 12:00pm" ));
        arrayList.add(new Person(R.drawable.philip_screw_worker,"Philip Screw","Let's meet up at the cit...", "yesterday 12:45pm" ));
        arrayList.add(new Person(R.drawable.felix_navidad_worker,"Felix Navidad","Sure I would be glad to...", "Monday 8:25am" ));
        arrayList.add(new Person(R.drawable.eloisa_soberano_worker,"Eloisa Soberano","Hello I have Work Experi...", "A month ago 19:07 pm" ));

        //We make custom adapter
        PersonAdapter personAdapter = new PersonAdapter(this,R.layout.messages_menu_item,arrayList);
        listView.setAdapter(personAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    startActivity(new Intent(MessagesMenu.this, MessagesChat.class));
                }
                if (position ==  1) {
                    startActivity(new Intent(MessagesMenu.this, MessagesChat.class));
                }
                if (position ==  2) {
                    startActivity(new Intent(MessagesMenu.this, MessagesChat.class));
                }
                if (position ==  3) {
                    startActivity(new Intent(MessagesMenu.this, MessagesChat.class));
                }
                if (position ==  4) {
                    startActivity(new Intent(MessagesMenu.this, MessagesChat.class));
                }
                if (position ==  5) {
                    startActivity(new Intent(MessagesMenu.this, MessagesChat.class));
                }
            }
        });

        ImageButton navExplore = findViewById(R.id.navExplore);
        navExplore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MessagesMenu.this, ExploreMenuClient.class));
            }
        });
        ImageButton navMessage = findViewById(R.id.navMessage);
        navMessage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MessagesMenu.this, MessagesMenu.class));
            }
        });
        ImageButton navJob = findViewById(R.id.navJob);
        navJob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MessagesMenu.this, DashboardClient.class));
            }
        });
        ImageButton navNotif = findViewById(R.id.navNotif);
        navNotif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MessagesMenu.this, Notifications.class));
            }
        });
        ImageButton navProfile = findViewById(R.id.navProfile);
        navProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MessagesMenu.this, Profile.class));
            }
        });

    }

}