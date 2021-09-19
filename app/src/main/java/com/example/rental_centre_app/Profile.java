package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        returnBtn = (Button)findViewById(R.id.btn_return);
        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        returnBtn.setOnClickListener(onclick);
    }
    private class Onclick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.btn_return:
                    intent = new Intent(Profile.this, MainActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}