package com.example.rental_centre_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.rental_centre_app.utils.JdbcUtil;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register extends AppCompatActivity {

    private Button register;
    private Button return_button;
    private EditText email;
    private EditText password;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register = (Button) findViewById(R.id.register_button);
        return_button = (Button)findViewById(R.id.return_button);
        email = findViewById(R.id.editText_email);
        password = findViewById(R.id.editText_password);
        auth = FirebaseAuth.getInstance();
        setListeners();
    }
    private void setListeners(){
        Onclick onclick = new Onclick();
        register.setOnClickListener(onclick);
        return_button.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.register_button:
                    String txt_email = email.getText().toString();
                    String txt_password = password.getText().toString();
                    if (TextUtils.isEmpty(txt_email) || TextUtils.isEmpty(txt_password)){
                        Toast.makeText(Register.this,"Empty credentials!", Toast.LENGTH_SHORT).show();
                    }else if (txt_password.length() < 6) {
                        Toast.makeText(Register.this,"Password too short!", Toast.LENGTH_SHORT).show();
                    } else {
                        registerUser(txt_email, txt_password);
                        intent = new Intent(Register.this, Register_successful.class);
                    }
                    break;
                case R.id.return_button:
                    intent = new Intent(Register.this, MainPageActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }

    private void registerUser(String email, String password) {
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(Register.this,"Register successful", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Register.this,"Register failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}