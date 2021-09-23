package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_Page extends AppCompatActivity {
    private Button login;
    private Button return_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        login = findViewById(R.id.login_button);
        return_button = (Button)findViewById(R.id.return_button);
        setListeners();
    }
    private void setListeners(){
        Onclick onclick = new Onclick();
        login.setOnClickListener(onclick);
        return_button.setOnClickListener(onclick);
    }
    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.login_button:
                    intent = new Intent(Login_Page.this,MainActivity.class);
                    break;
                case R.id.return_button:
                    intent = new Intent(Login_Page.this, MainPageActivity.class);
                    break;


            }
            startActivity(intent);
        }
    }
}