package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rental_centre_app.model.Payment;

public class DetailsActivity extends AppCompatActivity {

    Button bookbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        bookbutton = findViewById(R.id.bookbutton);
        bookbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DetailsActivity.this, Payment.class);
                startActivity(intent);
            }
        });
    }
}