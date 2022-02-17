package com.example.at_your_service;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MessageListAdapter extends RecyclerView.Adapter<MessageListAdapter.MyViewHolder> {
    private static final int ME = 1;
    private static final int OTHER = 2;

    private ArrayList<String> messageList;
    private ArrayList<User> userList;

    public MessageListAdapter(ArrayList<User> userList){
        this.userList = userList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tvMyMessage, tvOtherMessage;

        public MyViewHolder(final View view){
            super(view);
            tvMyMessage = view.findViewById(R.id.myMessage_textView);
            tvOtherMessage = view.findViewById(R.id.otherMessage_textView);
        }
    }

    @Override
    public int getItemViewType(int position){
        User user = (User) userList.get(position);

        if (user.getType() == "me"){
            return ME;
        }else {
            return OTHER;
        }
    }

    @NonNull
    @Override
    public MessageListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == ME){
            View myMessageView = LayoutInflater.from(parent.getContext()).inflate(R.layout.me, parent, false);
            return new MyViewHolder(myMessageView);
        }else {
            View otherMessageView = LayoutInflater.from(parent.getContext()).inflate(R.layout.other, parent, false);
            return new MyViewHolder(otherMessageView);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull MessageListAdapter.MyViewHolder holder, int position) {
        String message = userList.get(position).getMessage();

        switch (holder.getItemViewType()){
            case ME:
                holder.tvMyMessage.setText(message);
                break;
            case OTHER:
                holder.tvOtherMessage.setText(message);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}