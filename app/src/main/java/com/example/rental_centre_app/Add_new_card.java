package com.example.rental_centre_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Add_new_card extends AppCompatActivity {

    private Button back,add,question_mark;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_card);
        back = findViewById(R.id.back);
        add = findViewById(R.id.add);
        question_mark = findViewById(R.id.question_mark);
        setListeners();
    }

    // set listeners for components
    private void setListeners(){
        Onclick onclick = new Onclick();
        back.setOnClickListener(onclick);
        add.setOnClickListener(onclick);
        question_mark.setOnClickListener(onclick);
    }

    //set click events
    private class Onclick implements View.OnClickListener{
        Intent intent = null;
        Toast toast;
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.back:
                    intent = new Intent(Add_new_card.this, Edit_card_info.class);
                    startActivity(intent);
                    break;
                case R.id.question_mark:
                        toast = Toast.makeText(Add_new_card.this,"The CVV code is a 3 digit code that we ask you to enter. It adds and extra level of security to your payment.", Toast.LENGTH_LONG);
                        toast.setGravity(Gravity.CENTER,0,0);
                        toast.show();
                    break;
            }

        }
    }
}