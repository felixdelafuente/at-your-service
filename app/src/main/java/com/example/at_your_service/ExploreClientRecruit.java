package com.example.at_your_service;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ExploreClientRecruit extends AppCompatActivity {

    ListView listView;
    String mName[] = {"Mika Peraldo", "Eloisa Soberano", "Felix Navidad", "Philip Screw"};
    String mJobTitle[] = {"Plumber", "Mobile Technician", "Electrician", "Repairman"};
    String mRate[] = {"4.9", "4.3", "3.9", "4.5"};
    String mJob[] = {"07", "05", "02", "06"};
    String mLocation[] = {"Dasmariñas, CVT", "Dasmariñas, CVT", "Dasmariñas, CVT", "Dasmariñas, CVT"};
    String mButton[] = {"MESSAGE", "MESSAGE", "MESSAGE", "MESSAGE"};
    int images[] = {R.drawable.mika_perlado_worker, R.drawable.eloisa_soberano_worker,
            R.drawable.felix_navidad_worker, R.drawable.philip_screw_worker};
    int imgLocation[] = {R.drawable.explore_location_icon, R.drawable.explore_location_icon,
            R.drawable.explore_location_icon, R.drawable.explore_location_icon};
    int imgRate[] = {R.drawable.rate_star_icon, R.drawable.rate_star_icon, R.drawable.rate_star_icon,
            R.drawable.rate_star_icon};
    int imgJob[] = {R.drawable.rate_job_done__icon, R.drawable.rate_job_done__icon,
            R.drawable.rate_job_done__icon, R.drawable.rate_job_done__icon};
    int imgHeart[] = {R.drawable.explore_heart_icon, R.drawable.explore_heart_icon,
            R.drawable.explore_heart_icon, R.drawable.explore_heart_icon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_explore_client_recruit);

        listView = findViewById(R.id.listViewRecruit);

        ExploreClientRecruit.MyAdapter adapter = new ExploreClientRecruit.MyAdapter(
                this, mName, mJobTitle, mRate, mJob, images, mLocation, mButton, imgLocation, imgRate, imgJob, imgHeart);
        listView.setAdapter(adapter);

        ImageButton navExplore = findViewById(R.id.navExplore);
        navExplore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreClientRecruit.this, ExploreMenuClient.class));
            }
        });
        ImageButton navMessage = findViewById(R.id.navMessage);
        navMessage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreClientRecruit.this, MessagesMenu.class));
            }
        });
        ImageButton navJob = findViewById(R.id.navJob);
        navJob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreClientRecruit.this, DashboardClient.class));
            }
        });
        ImageButton navNotif = findViewById(R.id.navNotif);
        navNotif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreClientRecruit.this, Notifications.class));
            }
        });
        ImageButton navProfile = findViewById(R.id.navProfile);
        navProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreClientRecruit.this, Profile.class));
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rName[];
        String rJobTitle[];
        String rRate[];
        String rJob[];
        int rImgs[];
        String rLocation[];
        String rButton[];
        int rimgLocation[];
        int rimgRate[];
        int rimgJob[];
        int rimgHeart[];

        MyAdapter (Context c, String name[], String jobTitle[], String rate[], String job[], int imgs[],
                   String location[], String button[], int mgLocation[], int mgRate[], int mgJob[],
                           int mgHeart[]) {
            super(c, R.layout.explore_client_recruit_item, R.id.textView1, name);
            this.context = c;
            this.rName = name;
            this.rJobTitle = jobTitle;
            this.rRate = rate;
            this.rJob = job;
            this.rImgs = imgs;
            this.rLocation = location;
            this.rButton = button;
            this.rimgLocation = mgLocation;
            this.rimgRate = mgRate;
            this.rimgJob = mgJob;
            this.rimgHeart = mgHeart;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.explore_client_recruit_item, parent, false);
            ImageView images = row.findViewById(R.id.imageView10);
            TextView myName = row.findViewById(R.id.textView8);
            TextView myJobTitle = row.findViewById(R.id.textView12);
            TextView myLocation = row.findViewById(R.id.textView14);
            TextView myRate = row.findViewById(R.id.textView15);
            TextView myJob = row.findViewById(R.id.textView16);
            Button button = row.findViewById(R.id.button6);
            ImageView imgLocation = row.findViewById(R.id.imageView11);
            ImageView imgRate = row.findViewById(R.id.imageView12);
            ImageView imgJob = row.findViewById(R.id.imageView13);
            ImageButton imgHeart = row.findViewById(R.id.imageButton2);

            images.setImageResource(rImgs[position]);
            myName.setText(rName[position]);
            myJobTitle.setText(rJobTitle[position]);
            myLocation.setText(rLocation[position]);
            myRate.setText(rRate[position]);
            myJob.setText(rJob[position]);
            button.setText(rButton[position]);
            imgLocation.setImageResource(rimgLocation[position]);
            imgRate.setImageResource(rimgRate[position]);
            imgJob.setImageResource(rimgJob[position]);
            imgHeart.setImageResource(rimgHeart[position]);

            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (position ==  0) {
                        startActivity(new Intent(ExploreClientRecruit.this, MessagesChat.class));
                    }
                    if (position ==  1) {
                        startActivity(new Intent(ExploreClientRecruit.this, MessagesMenu.class));
                    }
                    if (position ==  2) {
                        startActivity(new Intent(ExploreClientRecruit.this, MessagesMenu.class));
                    }
                    if (position ==  3) {
                        startActivity(new Intent(ExploreClientRecruit.this, MessagesMenu.class));
                }
            }});

            return row;
        }
    }
}