package com.example.rental_centre_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Edit_Personal_info extends AppCompatActivity {
    private Button birthday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_personal_info);
        birthday = (Button) findViewById(R.id.edit_birthday);
        setListeners();
    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        birthday.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{
        Calendar calendar = Calendar.getInstance();
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.edit_birthday:
                    DatePickerDialog datePickerDialog = new DatePickerDialog(Edit_Personal_info.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                            String date = String.format("%d-%d-%d", year, month+1, dayOfMonth);
                            birthday.setText(date);
                        }
                    },calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH));
                    datePickerDialog.show();
            }
        }
    }
}