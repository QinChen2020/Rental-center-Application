package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register_successful extends AppCompatActivity {

    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_successful);
        login = (Button) findViewById(R.id.to_login);
        setListeners();
    }
    private void setListeners(){
        Onclick onclick = new Onclick();
        login.setOnClickListener(onclick);
    }
    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Register_successful.this, Login_Page.class);
            startActivity(intent);

        }
    }
}