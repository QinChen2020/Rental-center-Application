package com.example.rental_centre_app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_centre_app.R;
import com.example.rental_centre_app.model.TopHouseData;

import java.util.List;

public class TopHouseAdapter extends RecyclerView.Adapter <TopHouseAdapter.TopHouseViewHolder>{

    Context context;
    List<TopHouseData> TopHouseDataList;

    public TopHouseAdapter(Context context, List<TopHouseData> TopHouseDataList) {
        this.context = context;
        this.TopHouseDataList = TopHouseDataList;
    }

    @NonNull
    @Override
    public TopHouseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.top_house_row_item,parent, false);

        //because we create a recyclerview row item layout file
        return new TopHouseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopHouseViewHolder holder, int position) {

        holder.locationName.setText(TopHouseDataList.get(position).getLocationName());
        holder.houseName.setText(TopHouseDataList.get(position).getHouseName());
        holder.price.setText(TopHouseDataList.get(position).getPrice());
        holder.houseImage.setImageResource(TopHouseDataList.get(position).getImageUrl());

    }

    @Override
    public int getItemCount() {
        return TopHouseDataList.size();
    }

    public static final class TopHouseViewHolder extends RecyclerView.ViewHolder{

        ImageView houseImage;
        TextView houseName, locationName, price;

        public TopHouseViewHolder(@NonNull View itemView) {
            super(itemView);

            houseImage = itemView.findViewById(R.id.house_image);
            houseName = itemView.findViewById(R.id.house_name);
            locationName = itemView.findViewById(R.id.location_name);
            price = itemView.findViewById(R.id.price);
        }
    }
}
