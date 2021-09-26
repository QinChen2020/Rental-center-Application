package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login_Page extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button login;
    private Button return_button;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        login = findViewById(R.id.login_button);
        return_button = (Button)findViewById(R.id.return_button);
        email = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);

        auth = FirebaseAuth.getInstance();

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
                    String txt_email = email.getText().toString();
                    String txt_password = password.getText().toString();
                    loginUser(txt_email,txt_password);
                    intent = new Intent(Login_Page.this,MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.return_button:
                    intent = new Intent(Login_Page.this, MainPageActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }

    private void loginUser(String email, String password) {
        auth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(Login_Page.this, "login successful",Toast.LENGTH_SHORT).show();
            }
        });
    }
}