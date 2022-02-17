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

public class ExploreWorkerApply extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"I Can’t Open my Cellphone, Can Someone Repair it", "Can Someone Take a Look at My Car",
            "My Faucet Snapped, Can Someone Help me?", "I Need Someone who can Fix my Shelves"};
    String mDescription[] = {"I'm looking for someone who can repair my phone asap. My friend accidentally throws it in the water and now I can't open my phone.",
            "I'm looking for someone who can take a look at my car and the problem is the engine won't start I need help asap.",
            "Install plumbing systems in new construction and rehab properties.",
            "Perform repair on old furniture, to maintain it, and to refurbish it upon the clients’ request."};
    int images[] = {R.drawable.jobposting_img1, R.drawable.jobposting_img2, R.drawable.jobposting_img3, R.drawable.jobposting_img4};
    String mButton[] = {"APPLY", "APPLY", "APPLY", "APPLY"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_explore_worker_apply);

        listView = findViewById(R.id.listViewApply);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images, mButton);
        listView.setAdapter(adapter);

        ImageButton navExplore = findViewById(R.id.navExplore);
        navExplore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreWorkerApply.this, ExploreMenu.class));
            }
        });
        ImageButton navMessage = findViewById(R.id.navMessage);
        navMessage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreWorkerApply.this, MessagesMenu.class));
            }
        });
        ImageButton navJob = findViewById(R.id.navJob);
        navJob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreWorkerApply.this, DashboardWorker.class));
            }
        });
        ImageButton navNotif = findViewById(R.id.navNotif);
        navNotif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreWorkerApply.this, Notifications.class));
            }
        });
        ImageButton navProfile = findViewById(R.id.navProfile);
        navProfile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(ExploreWorkerApply.this, Profile.class));
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];
        String rButton[];

        MyAdapter (Context c, String title[], String description[], int imgs[], String button[]) {
            super(c, R.layout.explore_worker_apply_item, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
            this.rButton = button;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.explore_worker_apply_item, parent, false);
            ImageView images = row.findViewById(R.id.imageView6);
            TextView myTitle = row.findViewById(R.id.textView5);
            TextView myDescription = row.findViewById(R.id.textView6);
            Button button = row.findViewById(R.id.buttonApply);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            button.setText(rButton[position]);

            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (position ==  0) {
                        startActivity(new Intent(ExploreWorkerApply.this, MessagesMenu.class)); // Change this to message class
                    }
                    if (position ==  1) {
                        startActivity(new Intent(ExploreWorkerApply.this, MessagesMenu.class)); // Change this to message class
                    }
                    if (position ==  2) {
                        startActivity(new Intent(ExploreWorkerApply.this, MessagesMenu.class)); // Change this to message class
                    }
                    if (position ==  3) {
                        startActivity(new Intent(ExploreWorkerApply.this, MessagesMenu.class)); // Change this to message class
                    }
                }
            });

            return row;
        }
    }
}