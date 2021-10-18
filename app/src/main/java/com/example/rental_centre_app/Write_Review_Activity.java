package com.example.rental_centre_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Write_Review_Activity extends AppCompatActivity {
    private Button btn_return, btn_submit;
    private RatingBar rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_review);
        btn_return = findViewById(R.id.btn_return);
        btn_submit = findViewById(R.id.btn_submit);
        rb = (RatingBar)findViewById(R.id.stars);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

            }
        });
        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        btn_return.setOnClickListener(onclick);
        btn_submit.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            Toast toast;

            switch (view.getId()){
                case R.id.btn_return:
                    intent = new Intent(Write_Review_Activity.this, Order.class);
                    startActivity(intent);
                    break;
                case R.id.btn_submit:
                    toast = Toast.makeText(Write_Review_Activity.this, "Submitted successfully", Toast.LENGTH_SHORT);
                    toast.show();
                    break;
            }
        }
    }

    private class OnRating implements RatingBar.OnRatingBarChangeListener{

        @Override
        public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
            float i = rb.getRating();
        }
    }
}