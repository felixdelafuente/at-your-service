package com.example.at_your_service;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MessagesChat extends AppCompatActivity {

    private ArrayList<User> userList = new ArrayList<User>();
    private RecyclerView recyclerView;

    String myMessage;
    ImageButton btnSend;
    EditText etMessage;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_messages_chat);

        etMessage = findViewById(R.id.message_editText);
        btnSend = findViewById(R.id.send_button);
        recyclerView = findViewById(R.id.chat_recyclerView);

        userList.add(new User("other", "Hi I would like to take up on your job offering"));
        userList.add(new User("other", "I’m am experienced with 2 years of experience in professional plumbing"));

        setAdapter();

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myMessage = etMessage.getText().toString();
                userList.add(new User("me", myMessage));

                if (myMessage.equals("Hello thank you for your response I would like you to work on Monday is that alright for you?")){
                    etMessage.setText("");
                    userList.add(new User("other", "Yes Sure! Where is your address sir?"));
                }
                if (myMessage.equals("B168 L14 PH4 Paliparan Site, Dasmariñas, 4114 Cavite")){
                    etMessage.setText("");
                    userList.add(new User("other", "I’ll go there around 10 am"));
                    userList.add(new User("other", "Thank you!"));
                }
                setAdapter();
            }
        });

    }

    private void setAdapter() {
        MessageListAdapter adapter = new MessageListAdapter(userList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}