package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainPageActivity extends AppCompatActivity {

    private Button register;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        register = (Button)findViewById(R.id.button_1);
        login = (Button)findViewById(R.id.button_2);
        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        register.setOnClickListener(onclick);
        login.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.button_1:
                    intent = new Intent(MainPageActivity.this, Register.class);
                    break;
                case R.id.button_2:
                    intent = new Intent(MainPageActivity.this, Login_Page.class);
                    break;
            }
            startActivity(intent);
        }
    }
}