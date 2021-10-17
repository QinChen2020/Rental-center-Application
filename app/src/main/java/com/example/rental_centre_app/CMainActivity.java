package com.example.rental_centre_app;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CMainActivity extends AppCompatActivity {
    //initialize variable
    RecyclerView recyclerView;
    FloatingActionButton fbAdd;
    JSONArray jsonArray = new JSONArray();
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmain);

        //Assign variable
        recyclerView = findViewById(R.id.recycler_view);
        fbAdd = findViewById(R.id.fb_add);

        //set layout manager
        recyclerView.setLayoutManager(new GridLayoutManager(
                this, 3
        ));
        //Initialize adapter
        adapter = new MainAdapter(this, jsonArray);
        //set adapter
        recyclerView.setAdapter(adapter);

        fbAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Initialize dialog
                Dialog dialog = new Dialog(CMainActivity.this);
                //set background transparent
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(
                        Color.TRANSPARENT
                ));
                //set view
                dialog.setContentView(R.layout.dialog);
                //Display dialog
                dialog.show();

                //Initialize and assign variable
                RatingBar ratingBar = dialog.findViewById(R.id.rating_bar);
                TextView tvRating = dialog.findViewById(R.id.tv_rating);
                Button btSubmit = dialog.findViewById(R.id.bt_submit);

                ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        //set selected rating on text view
                        tvRating.setText(String.format("(%s)", v));
                    }
                });
                //set listener on submit button
                btSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Get rating from rating bar
                        String sRaring = String.valueOf(ratingBar.getRating());

                        try {
                            //Add value in json array
                            jsonArray.put(new JSONObject().put("rating", sRaring));
                            //set adapter
                            recyclerView.setAdapter(adapter);
                            //Dismiss dialog
                            dialog.dismiss();
                            Intent intent = new Intent(CMainActivity.this, MainActivity.class);
                            startActivity(intent);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }


                });


            }
        });


    }
}