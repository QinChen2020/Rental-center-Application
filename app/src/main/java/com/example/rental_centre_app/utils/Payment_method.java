package com.example.rental_centre_app.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rental_centre_app.R;

public class Payment_method extends AppCompatActivity {
    private Button existing_card;
    private Button question;
    private TextView cvv_explain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
        existing_card.findViewById(R.id.existing_card);
        question.findViewById(R.id.question);
        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        existing_card.setOnClickListener(onclick);
        question.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.existing_card:
                    break;
                case R.id.question:
                    cvv_explain.setVisibility(View.VISIBLE);
                    break;
            }
            startActivity(intent);
        }
    }
}