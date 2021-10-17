package com.example.rental_centre_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;


public class DetailsActivity extends AppCompatActivity {

    private Button bookbutton;
    private Button backbutton;
    private String date;

    public String getDate(){
        return date;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        bookbutton = findViewById(R.id.bookbutton);
        backbutton = findViewById(R.id.backbutton);


        bookbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this,Payment_method.class);
                startActivity(intent);
            }
            });
             backbutton.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     long currentTime = System.currentTimeMillis();
                     date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(currentTime);
                     Order order = new Order();
                     order.setOrderDate(date);

                     Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
                     startActivity(intent);

                 }
             });
             //test



    }
}