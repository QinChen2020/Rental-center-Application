package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Edit_Personal_info extends AppCompatActivity {
    private Button birthday;
    private Button return_button;
    private Button save_button;
    private EditText edit_email;
    private EditText edit_phoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_personal_info);
        birthday = (Button) findViewById(R.id.edit_birthday);
        return_button = (Button) findViewById(R.id.return_button);
        save_button = (Button)findViewById(R.id.save_button);
        edit_email = (EditText)findViewById(R.id.edit_email);
        edit_phoneNo = (EditText)findViewById(R.id.edit_phone);
        setListeners();
    }

    private void setListeners() {
        Onclick onclick = new Onclick();
        birthday.setOnClickListener(onclick);
        return_button.setOnClickListener(onclick);
        save_button.setOnClickListener(onclick);
    }

    private boolean isEmail(String email){
        String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    private boolean isMobile(String phoneNo){
        if(phoneNo.length()==10){
            return true;
        }else{
            return false;
        }
    }

    private class Onclick implements View.OnClickListener {
        Intent intent = null;
        Calendar calendar = Calendar.getInstance();
        Toast toast = null;
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.edit_birthday) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(Edit_Personal_info.this, (datePicker, year, month, dayOfMonth) -> {
                    @SuppressLint("DefaultLocale") String date = String.format("%d-%d-%d", year, month + 1, dayOfMonth);
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