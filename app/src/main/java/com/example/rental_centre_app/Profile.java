package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    private Button returnBtn;
    private Button personal_info;
    private Button payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        returnBtn = (Button)findViewById(R.id.btn_return);
        personal_info = (Button)findViewById(R.id.btn_PI);
        payment = (Button)findViewById(R.id.btn_PP);
        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        returnBtn.setOnClickListener(onclick);
        personal_info.setOnClickListener(onclick);
        payment.setOnClickListener(onclick);
    }
    private class Onclick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.btn_return:
                    intent = new Intent(Profile.this, MainActivity.class);
                    break;
                case R.id.btn_PI:
                    intent = new Intent(Profile.this, Edit_Personal_info.class);
                    break;
                case R.id.btn_PP:
                    intent = new Intent(Profile.this, Edit_card_info.class);
            }
            startActivity(intent);
        }
    }
}