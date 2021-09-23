package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DetailsActivity extends AppCompatActivity {

    private Button bookbutton;
    private Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        bookbutton = findViewById(R.id.bookbutton);
        backbutton = findViewById(R.id.backbutton);

        bookbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this, Payment_method.class);
                startActivity(intent);
            }
            });
             backbutton.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
                     startActivity(intent);

                 }
             });
             //test



    }
}