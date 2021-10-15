package com.example.rental_centre_app;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rental_centre_app.adapter.RecentsAdapter;
import com.example.rental_centre_app.adapter.TopHouseAdapter;
import com.example.rental_centre_app.model.RecentsData;
import com.example.rental_centre_app.model.TopHouseData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recentRecycler,topHouseRecycler;
    private RecentsAdapter recentsAdapter;
    private TopHouseAdapter topHouseAdapter;
    private ImageView profile;
    private ImageView key;
    private Button buttonc;
    private Button buttonp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Omaha,4 bedrooms", "8 Taiawa place,Omaha,Rodney,Auckland", "Per Week $500",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Claudelands, 1 bedroom", "6 Boundary Road, Claudelands, Hamilton", "Per Week $450",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("Ashburton,3 bedrooms", "34 Ashbury Grove,Ashburton,Canterbury", "Per Week $600",R.drawable.recentimage3));
        recentsDataList.add(new RecentsData("Newtown,2 bedroom", "120 Owen Street, Newtown,Wellington", "Per Week $480",R.drawable.recentimage4));
        recentsDataList.add(new RecentsData("Feilding,5 bedrooms", "71 Derby Street, Feilding, Manawatu, Manawatu", "Per Week $500",R.drawable.recentimage5));
        recentsDataList.add(new RecentsData("Henderson,3 bedroom", "76H Edmonton Road, Henderson,Auckland", "Per Week $550",R.drawable.recentimage6));
        recentsDataList.add(new RecentsData("Papakura,2 bedrooms", "34a Kelvin Road, Papakura, Auckland", "Per Week $500",R.drawable.recentimage7));
        recentsDataList.add(new RecentsData("Henderson,4 bedroom", "147a Rathgar Road, Henderson,Auckland", "Per Week $600",R.drawable.recentimage8));




        setRecentRecycler(recentsDataList);

        List<TopHouseData> topHouseDataList = new ArrayList<>();
        topHouseDataList.add(new TopHouseData("Spotswood, 3 bedrooms","40 Hobart Drive, Spotswood, New Plymouth", "Per Week $550",R.drawable.tophouse));
        topHouseDataList.add(new TopHouseData("Upper Riccarton, 2 bedrooms","68C Peer Street, Upper Riccarton, Christchurch City", "Per Week $450",R.drawable.tophouse1));
        topHouseDataList.add(new TopHouseData("Rodney, 4 bedrooms","9 Tapu Road, Huapai, Rodney, Auckland", "Per Week $650",R.drawable.tophouse2));
        topHouseDataList.add(new TopHouseData("Wharewaka, 3 bedrooms","2 Harakeke Drive, Wharewaka, Taupo, Waikato", "Per Week $600",R.drawable.tophouse3));
        topHouseDataList.add(new TopHouseData("Papatoetoe, 5 bedrooms","88 Hillcrest Road, Papatoetoe, Manukau City, Auckland", "Per Week $500",R.drawable.tophouse4));



        setTopHouseRecycler(topHouseDataList);

        profile = (ImageView) findViewById(R.id.img_profile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });
        buttonc = findViewById(R.id.buttonc);
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent);
            }
        });
        buttonp = findViewById(R.id.buttonp);
        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CMainActivity.class);
                startActivity(intent);
            }
        });

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
        //update


    }
}

