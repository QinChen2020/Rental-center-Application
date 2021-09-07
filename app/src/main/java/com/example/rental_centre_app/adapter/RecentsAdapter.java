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
import com.example.rental_centre_app.model.RecentsData;

import java.util.List;

public class RecentsAdapter extends RecyclerView.Adapter <RecentsAdapter.RecentsViewHolder>{

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
