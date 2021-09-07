package com.example.rental_centre_app;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_centre_app.adapter.RecentsAdapter;
import com.example.rental_centre_app.adapter.TopHouseAdapter;
import com.example.rental_centre_app.model.RecentsData;
import com.example.rental_centre_app.model.TopHouseData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {


    RecyclerView recentRecycler,topHouseRecycler;
    RecentsAdapter recentsAdapter;
    TopHouseAdapter topHouseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Omaha,4 bedrooms", "8 Taiawa place,Omaha,Rodney,Auckland", "Per Week $500",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Claudelands, 1 bedroom", "6 Boundary Road, Claudelands, Hamilton", "Per Week $450",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Omaha,4 bedrooms", "8 Taiawa place,Omaha,Rodney,Auckland", "Per Week $500",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Claudelands, 1 bedroom", "6 Boundary Road, Claudelands, Hamilton", "Per Week $450",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Omaha,4 bedrooms", "8 Taiawa place,Omaha,Rodney,Auckland", "Per Week $500",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Claudelands, 1 bedroom", "6 Boundary Road, Claudelands, Hamilton", "Per Week $450",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Omaha,4 bedrooms", "8 Taiawa place,Omaha,Rodney,Auckland", "Per Week $500",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Claudelands, 1 bedroom", "6 Boundary Road, Claudelands, Hamilton", "Per Week $450",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Omaha,4 bedrooms", "8 Taiawa place,Omaha,Rodney,Auckland", "Per Week $500",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Claudelands, 1 bedroom", "6 Boundary Road, Claudelands, Hamilton", "Per Week $450",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Omaha,4 bedrooms", "8 Taiawa place,Omaha,Rodney,Auckland", "Per Week $500",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Claudelands, 1 bedroom", "6 Boundary Road, Claudelands, Hamilton", "Per Week $450",R.drawable.recentimage2));


        setRecentRecycler(recentsDataList);

        List<TopHouseData> topHouseDataList = new ArrayList<>();
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $600",R.drawable.tophouse));
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $600",R.drawable.tophouse));
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $600",R.drawable.tophouse));
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $600",R.drawable.tophouse));
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $600",R.drawable.tophouse));
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $600",R.drawable.tophouse));
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $600",R.drawable.tophouse));
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $600",R.drawable.tophouse));
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $600",R.drawable.tophouse));
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $600",R.drawable.tophouse));


        setTopHouseRecycler(topHouseDataList);
        }

        private void setRecentRecycler(List<RecentsData> recentsDataList){

            recentRecycler = findViewById(R.id.recent_cecycler);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            recentRecycler.setLayoutManager(layoutManager);
            recentsAdapter = new RecentsAdapter(this, recentsDataList);
            recentRecycler.setAdapter(recentsAdapter);

        }

        private void setTopHouseRecycler(List<TopHouseData> topHouseDataList){

            topHouseRecycler = findViewById(R.id.top_house_recycler);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
            topHouseRecycler.setLayoutManager(layoutManager);
            topHouseAdapter = new TopHouseAdapter(this, topHouseDataList);
            topHouseRecycler.setAdapter(topHouseAdapter);

        }
}