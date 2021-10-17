package com.example.rental_centre_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Order extends AppCompatActivity {

    private Button btn_return, btn_back, btn_next;
    private Button view_1, view_2, view_3, view_4;
    private Button write_review_1, write_review_2, write_review_3, write_review_4;
    private TextView book_date_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        btn_return = findViewById(R.id.btn_return);
        btn_back = findViewById(R.id.btn_back);
        btn_next = findViewById(R.id.btn_next);
        book_date_1 = findViewById(R.id.book_date_1);
        view_1 = findViewById(R.id.btn_view_1);
        write_review_1 = findViewById(R.id.review_1);
        write_review_2 = findViewById(R.id.review_2);
        write_review_3 = findViewById(R.id.review_3);
        write_review_4 = findViewById(R.id.review_4);

        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        btn_return.setOnClickListener(onclick);
        btn_back.setOnClickListener(onclick);
        btn_next.setOnClickListener(onclick);
        view_1.setOnClickListener(onclick);
        write_review_1.setOnClickListener(onclick);
        write_review_2.setOnClickListener(onclick);
        write_review_3.setOnClickListener(onclick);
        write_review_4.setOnClickListener(onclick);
    }

    public void setOrderDate(String date){
        book_date_1.setText(date);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.btn_return:
                    intent = new Intent(Order.this, Profile.class);
                    startActivity(intent);
                    break;
                case R.id.btn_view_1:
                    intent = new Intent(Order.this, DetailsActivity.class);
                    startActivity(intent);
                    break;
                case R.id.review_1:
                    intent = new Intent(Order.this, Write_Review_Activity.class);
                    startActivity(intent);
                    break;
            }

        }
    }
}