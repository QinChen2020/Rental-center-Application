package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.rental_centre_app.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Register extends AppCompatActivity {

    private Button register;
    private Button return_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register = (Button) findViewById(R.id.register_button);
        return_button = (Button)findViewById(R.id.return_button);
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
            EditText usernameText = findViewById(R.id.editText_username);
            String username = usernameText.getText().toString();
            EditText passwordText = findViewById(R.id.editText_password);
            String password = passwordText.getText().toString();
            Intent intent = null;
            switch (view.getId()){
                case R.id.register_button:
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            int i = 0;
                            Connection conn = JdbcUtil.getConnection();
                            String sql = "insert into `user`(`username`,`password`)values(?,?)";
                            try {
                                PreparedStatement pst = conn.prepareStatement(sql);
                                pst.setString(1,username);
                                pst.setString(2,password);
                                i = pst.executeUpdate();
                                System.out.println(i);
                                pst.close();
                                conn.close();
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                        }
                    }).start();
                    intent = new Intent(Register.this, MainActivity.class);
                    break;
                case R.id.return_button:
                    intent = new Intent(Register.this, MainActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}