package com.example.chatapplication;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MessageAdapter extends RecyclerView.Adapter {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }



    class senderViewHolder extends RecyclerView.ViewHolder {
        public senderViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    class receiverviewHolder extends RecyclerView.ViewHolder {
        public receiverviewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
