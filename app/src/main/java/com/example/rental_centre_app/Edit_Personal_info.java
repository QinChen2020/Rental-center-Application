package com.example.rental_centre_app;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Edit_Personal_info extends AppCompatActivity {
    private Button birthday;
    private Button return_button;
    private Button save_button;
    private EditText edit_email;
    private EditText edit_phoneNo;
    private EditText edit_firstname;
    private EditText edit_surname;
    private RadioButton rd_male;
    private RadioButton rd_female;;
    private String date;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_personal_info);
        birthday = (Button) findViewById(R.id.edit_birthday);
        return_button = (Button) findViewById(R.id.return_button);
        save_button = (Button)findViewById(R.id.save_button);
        edit_email = (EditText)findViewById(R.id.edit_email);
        edit_phoneNo = (EditText)findViewById(R.id.edit_phone);
        edit_firstname = findViewById(R.id.edit_fn);
        edit_surname = findViewById(R.id.edit_sn);
        rd_male = findViewById(R.id.male);
        rd_female = findViewById(R.id.female);


        //connect to Firebase
        auth = FirebaseAuth.getInstance();
        FirebaseUser user = auth.getCurrentUser();

        switch (user.getEmail()) {
            case "754463323@qq.com":
                DatabaseReference P_reference = FirebaseDatabase.getInstance().getReference().child("754463323").child("Profile").child("PersonalInfo").child("FirstName");
                P_reference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_firstname.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference P_reference2 = FirebaseDatabase.getInstance().getReference().child("754463323").child("Profile").child("PersonalInfo").child("Surname");
                P_reference2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_surname.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference P_reference3 = FirebaseDatabase.getInstance().getReference().child("754463323").child("Profile").child("PersonalInfo").child("Email");
                P_reference3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_email.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference P_reference4 = FirebaseDatabase.getInstance().getReference().child("754463323").child("Profile").child("PersonalInfo").child("Phone");
                P_reference4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_phoneNo.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference P_reference5 = FirebaseDatabase.getInstance().getReference().child("754463323").child("Profile").child("PersonalInfo").child("Gender");
                P_reference5.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.getValue().toString().equals("Male")) {
                            rd_male.setChecked(true);
                        }
                        else if (snapshot.getValue().toString().equals("Female")) {
                            rd_female.setChecked(true);
                        }
                        //edit_firstname.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference P_reference6 = FirebaseDatabase.getInstance().getReference().child("754463323").child("Profile").child("PersonalInfo").child("Birthday");
                P_reference6.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        birthday.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                break;
            case "joychen299227@gmail.com":
                DatabaseReference J_reference = FirebaseDatabase.getInstance().getReference().child("299227").child("Profile").child("PersonalInfo").child("FirstName");
                J_reference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_firstname.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference J_reference2 = FirebaseDatabase.getInstance().getReference().child("299227").child("Profile").child("PersonalInfo").child("Surname");
                J_reference2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_surname.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference J_reference3 = FirebaseDatabase.getInstance().getReference().child("299227").child("Profile").child("PersonalInfo").child("Email");
                J_reference3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_email.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference J_reference4 = FirebaseDatabase.getInstance().getReference().child("299227").child("Profile").child("PersonalInfo").child("Phone");
                J_reference4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_phoneNo.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference J_reference5 = FirebaseDatabase.getInstance().getReference().child("299227").child("Profile").child("PersonalInfo").child("Gender");
                J_reference5.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.getValue().toString().equals("Male")) {
                            rd_male.setChecked(true);
                        }
                        else if (snapshot.getValue().toString().equals("Female")) {
                            rd_female.setChecked(true);
                        }
                        //edit_firstname.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference J_reference6 = FirebaseDatabase.getInstance().getReference().child("299227").child("Profile").child("PersonalInfo").child("Birthday");
                J_reference6.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        birthday.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                break;
            case "gyh8771@autuni.ac.nz":
                DatabaseReference Q_reference = FirebaseDatabase.getInstance().getReference().child("gyh8771").child("Profile").child("PersonalInfo").child("FirstName");
                Q_reference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_firstname.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference Q_reference2 = FirebaseDatabase.getInstance().getReference().child("gyh8771").child("Profile").child("PersonalInfo").child("Surname");
                Q_reference2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_surname.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference Q_reference3 = FirebaseDatabase.getInstance().getReference().child("gyh8771").child("Profile").child("PersonalInfo").child("Email");
                Q_reference3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_email.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference Q_reference4 = FirebaseDatabase.getInstance().getReference().child("gyh8771").child("Profile").child("PersonalInfo").child("Phone");
                Q_reference4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        edit_phoneNo.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference Q_reference5 = FirebaseDatabase.getInstance().getReference().child("gyh8771").child("Profile").child("PersonalInfo").child("Gender");
                Q_reference5.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.getValue().toString().equals("Male")) {
                            rd_male.setChecked(true);
                        }
                        else if (snapshot.getValue().toString().equals("Female")) {
                            rd_female.setChecked(true);
                        }
                        //edit_firstname.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                DatabaseReference Q_reference6 = FirebaseDatabase.getInstance().getReference().child("gyh8771").child("Profile").child("PersonalInfo").child("Birthday");
                Q_reference6.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        birthday.setText(snapshot.getValue().toString());
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                break;
        }

        setListeners();
    }

    //set listeners for components
    private void setListeners() {
        Onclick onclick = new Onclick();
        birthday.setOnClickListener(onclick);
        return_button.setOnClickListener(onclick);
        save_button.setOnClickListener(onclick);
    }

    //check if the email address user input is correct format
    private boolean isEmail(String email){
        String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    //check if the mobile number user input is correct format
    private boolean isMobile(String phoneNo){
        if(phoneNo.length()==10){
            return true;
        }else{
            return false;
        }
    }

    //set onclicklisteners
    private class Onclick implements View.OnClickListener {
        Intent intent = null;
        Calendar calendar = Calendar.getInstance();
        Toast toast = null;
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.edit_birthday) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(Edit_Personal_info.this, (datePicker, year, month, dayOfMonth) -> {
                    @SuppressLint("DefaultLocale")
                    String date = String.format("%d-%d-%d", year, month + 1, dayOfMonth);
                    birthday.setText(date);
                }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
                datePickerDialog.show();
            } else if (view.getId() == R.id.return_button) {
                intent = new Intent(Edit_Personal_info.this, Profile.class);
                startActivity(intent);
            }else if (view.getId() == R.id.save_button) {
                edit_email.setTextColor(Color.BLACK);
                edit_email.setHintTextColor(Color.BLACK);
                edit_phoneNo.setTextColor(Color.BLACK);
                edit_phoneNo.setHintTextColor(Color.BLACK);
                Boolean isEmail = isEmail(edit_email.getText().toString());
                Boolean isMobile = isMobile(edit_phoneNo.getText().toString());
                if (isEmail&&isMobile){
                    toast = Toast.makeText(Edit_Personal_info.this, "saved!", Toast.LENGTH_LONG);
                    toast.show();
                }else{
                    if (!isEmail){
                        edit_email.setTextColor(Color.RED);
                        edit_email.setHintTextColor(Color.RED);
                    }
                    if(!isMobile){
                        edit_phoneNo.setTextColor(Color.RED);
                        edit_phoneNo.setHintTextColor(Color.RED);
                    }
                    toast = Toast.makeText(Edit_Personal_info.this, "Please enter valid information!", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        }
    }
}