package com.example.at_your_service;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ExploreMenu extends AppCompatActivity {
    GridView gridView;
    String mTitle[] = {"Beauty Services", "Building Services", "Cleaning Services", "Cooking Services", "Repair\nServices", "Tutoring Services"};
    int images[] = {R.drawable.beauty_services_icon, R.drawable.building_services_icon, R.drawable.cleaning_services_icon, R.drawable.cooking_services_icon, R.drawable.repair_services_icon, R.drawable.tutoring_services_icon};

    ImageButton navExplore;
    ImageButton navMessage;
    ImageButton navJob;
    ImageButton navNotif;
    ImageButton navProfile;
    @SuppressLint("WrongViewCast")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_explore_menu);

        gridView = findViewById(R.id.gridView);

        MyAdapter adapter = new MyAdapter(this, mTitle, images);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
                    startActivity(new Intent(ExploreMenu.this, ExploreWorkerApply.class));
                }
                if (position ==  1) {
                    startActivity(new Intent(ExploreMenu.this, ExploreWorkerApply.class));
                }
                if (position ==  2) {
                    startActivity(new Intent(ExploreMenu.this, ExploreWorkerApply.class));
                }
                if (position ==  3) {
                    startActivity(new Intent(ExploreMenu.this, ExploreWorkerApply.class));
                }
                if (position ==  4) {
                    startActivity(new Intent(ExploreMenu.this, ExploreWorkerApply.class));
                }
                if (position ==  5) {
                    startActivity(new Intent(ExploreMenu.this, ExploreWorkerApply.class));
                }
            }
        });

        navExplore = findViewById(R.id.navExplore);
        navExplore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreMenu.this, ExploreMenu.class));
            }
        });
        navMessage = findViewById(R.id.navMessage);
        navMessage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreMenu.this, MessagesMenu.class));
            }
        });
        navJob = findViewById(R.id.navJob);
        navJob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreMenu.this, DashboardWorker.class));
            }
        });
        navNotif = findViewById(R.id.navNotif);
        navNotif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreMenu.this, Notifications.class));
            }
        });
        navProfile = findViewById(R.id.navProfile);
        navProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreMenu.this, Profile.class));
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        int rImgs[];

        MyAdapter (Context c, String title[], int imgs[]) {
            super(c, R.layout.explore_menu_item, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.explore_menu_item, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);

            return row;
        }
    }
}