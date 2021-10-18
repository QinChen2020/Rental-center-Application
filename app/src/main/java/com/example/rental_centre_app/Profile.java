package com.example.rental_centre_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Profile extends AppCompatActivity {

    private Button returnBtn;
    private Button personal_info;
    private Button payment;
    private Button order;
    private TextView name;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        returnBtn = (Button)findViewById(R.id.btn_return);
        personal_info = (Button)findViewById(R.id.btn_PI);
        payment = (Button)findViewById(R.id.btn_PP);
        order = (Button)findViewById(R.id.btn_order);
        name = findViewById(R.id.p_username);

        auth = FirebaseAuth.getInstance();
        FirebaseUser user = auth.getCurrentUser();

        //extract data from firebase
        switch (user.getEmail()) {
            case "754463323@qq.com":
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("754463323").child("Profile").child("PersonalInfo").child("FirstName");
                reference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        name.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                break;
            case "joychen299227@gmail.com":
                DatabaseReference reference2 = FirebaseDatabase.getInstance().getReference().child("299227").child("Profile").child("PersonalInfo").child("FirstName");
                reference2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        name.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                break;
            case "gyh8771@autuni.ac.nz":
                DatabaseReference reference3 = FirebaseDatabase.getInstance().getReference().child("gyh8771").child("Profile").child("PersonalInfo").child("FirstName");
                reference3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        name.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                break;
        }



        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        returnBtn.setOnClickListener(onclick);
        personal_info.setOnClickListener(onclick);
        order.setOnClickListener(onclick);
        payment.setOnClickListener(onclick);
    }
    private class Onclick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()) {
                case R.id.btn_return:
                    intent = new Intent(Profile.this, MainActivity.class);
                    break;
                case R.id.btn_PI:
                    intent = new Intent(Profile.this, Edit_Personal_info.class);
                    break;
                case R.id.btn_order:
                    intent = new Intent(Profile.this, Order.class);
                    break;
                case R.id.btn_PP:
                    intent = new Intent(Profile.this, Edit_card_info.class);
            }
            startActivity(intent);
        }
    }
}