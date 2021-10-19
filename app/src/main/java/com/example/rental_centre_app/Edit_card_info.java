package com.example.rental_centre_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Edit_card_info extends AppCompatActivity {

    private Button existing,add,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_card_info);
        existing = findViewById(R.id.existing_card);
        add = findViewById(R.id.add_new_card);
        back = findViewById(R.id.back);
        setListeners();
    }

    //set listeners for components
    private void setListeners(){
        Onclick onclick = new Onclick();
        existing.setOnClickListener(onclick);
        add.setOnClickListener(onclick);
        back.setOnClickListener(onclick);
    }

    //set click events
    private class Onclick implements View.OnClickListener{

        Intent intent = null;
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.existing_card:
                    break;
                case R.id.add_new_card:
                    intent = new Intent(Edit_card_info.this, Add_new_card.class);
                    break;
                case R.id.back:
                    intent = new Intent(Edit_card_info.this, Profile.class);
            }
            startActivity(intent);
        }
    }
}