package com.example.rental_centre_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Order extends AppCompatActivity {

    private Button btn_return, btn_back, btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        btn_return = findViewById(R.id.btn_return);
        btn_back = findViewById(R.id.btn_back);
        btn_next = findViewById(R.id.btn_next);
        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        btn_return.setOnClickListener(onclick);
        btn_back.setOnClickListener(onclick);
        btn_next.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_return:
                    intent = new Intent(Order.this, Profile.class);
                    break;
                case R.id.btn_back:

                    break;
                case R.id.btn_next:

                    break;
            }
            startActivity(intent);
        }
    }
}