package com.example.lab5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public  class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{
    private ArrayList<information> informationlist;
    public UserAdapter(ArrayList<information> informationlist){
        this.informationlist = informationlist;
    }
    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view= layoutInflater.inflate(R.layout.item_user, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        information information = informationlist.get(position);
        holder.imageView.setImageAlpha(information.getPicture());
        holder.tvInfo.setText(information.getInfomation());
        holder.tvCategory.setText(information.getCategory());

    }

    @Override
    public int getItemCount() {
        return informationlist.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tvInfo;
        TextView  tvCategory;
        public ViewHolder (@NonNull View itemView){
            super (itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvInfo = itemView.findViewById(R.id.tvInfo);
            tvCategory = itemView.findViewById(R.id.tvCategory);
        }
    }
}
