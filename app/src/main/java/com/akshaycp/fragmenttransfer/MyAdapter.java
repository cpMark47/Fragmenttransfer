package com.akshaycp.fragmenttransfer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myviewholder> {

    ArrayList<TransferModes> transferHolder;

    public MyAdapter(ArrayList<TransferModes> transferHolder) {
        this.transferHolder = transferHolder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent , false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  MyAdapter.myviewholder holder, int position) {

        holder.textView.setText(transferHolder.get(position).mode);

    }

    @Override
    public int getItemCount() {
        return transferHolder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{

        TextView textView;

        public myviewholder(@NonNull  View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view_item);
        }
    }
}


