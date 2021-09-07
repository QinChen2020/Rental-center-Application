package com.example.rental_centre_app.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_centre_app.DetailsActivity;
import com.example.rental_centre_app.R;
import com.example.rental_centre_app.model.RecentsData;

import java.util.List;

public class RecentsAdapter extends RecyclerView.Adapter <RecentsAdapter.RecentsViewHolder>{


    public RecentsAdapter(Context context, List<RecentsData> recentsDataList) {
        this.context = context;
        this.recentsDataList = recentsDataList;
    }

    Context context;
    List<RecentsData> recentsDataList;

    @NonNull
    @Override
    public RecentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recents_row_item,parent, false);

        //because we create a recyclerview row item layout file
        return new RecentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentsViewHolder holder, int position) {

        holder.locationName.setText(recentsDataList.get(position).getLocationName());
        holder.houseName.setText(recentsDataList.get(position).getHouseName());
        holder.price.setText(recentsDataList.get(position).getPrice());
        holder.houseImage.setImageResource(recentsDataList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(context, DetailsActivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return recentsDataList.size();
    }

    public static final class RecentsViewHolder extends RecyclerView.ViewHolder{

        ImageView houseImage;
        TextView houseName, locationName, price;

        public RecentsViewHolder(@NonNull View itemView) {
            super(itemView);

            houseImage = itemView.findViewById(R.id.house_image);
            houseName = itemView.findViewById(R.id.house_name);
            locationName = itemView.findViewById(R.id.location_name);
            price = itemView.findViewById(R.id.price);
        }
    }
}
