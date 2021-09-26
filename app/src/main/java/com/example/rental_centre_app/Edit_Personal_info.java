package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class Edit_Personal_info extends AppCompatActivity {
    private Button birthday;
    private Button return_button;
    private Button save_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_personal_info);
        birthday = (Button) findViewById(R.id.edit_birthday);
        return_button = (Button) findViewById(R.id.return_button);
        save_button = (Button)findViewById(R.id.save_button);
        setListeners();
    }

    private void setListeners() {
        Onclick onclick = new Onclick();
        birthday.setOnClickListener(onclick);
        return_button.setOnClickListener(onclick);
        save_button.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener {
        Intent intent = null;
        Calendar calendar = Calendar.getInstance();

        @Override
        public void onClick(View view) {
            Toast toast;
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
                toast = Toast.makeText(Edit_Personal_info.this, "saved!", Toast.LENGTH_LONG);
                toast.show();
            }
        }
    }
}