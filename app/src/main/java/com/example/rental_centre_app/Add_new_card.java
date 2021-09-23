package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Add_new_card extends AppCompatActivity {

    private Button back,add,question;
    private TextView cvv_explain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_card);
        back = findViewById(R.id.back);
        add = findViewById(R.id.add);
        question = findViewById(R.id.question);
        cvv_explain = findViewById(R.id.question_explain);
        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        back.setOnClickListener(onclick);
        add.setOnClickListener(onclick);
        question.setOnClickListener(onclick);
        cvv_explain.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{
        Intent intent = null;
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.back:
                    intent = new Intent(Add_new_card.this, Edit_card_info.class);
                    break;
                case R.id.add:
                    break;
                case R.id.question:
                    cvv_explain.setVisibility(View.VISIBLE);
                    break;
            }
            startActivity(intent);
        }
    }
}