package com.example.rental_centre_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.paypal.android.sdk.payments.PayPalService;

public class Payment_method extends AppCompatActivity {
    private Button existing_card;
    private Button question;
    private SetPayPal setPayPal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);


        existing_card = findViewById(R.id.existing_card);
        question = findViewById(R.id.question_mark);
        setListeners();
    }

    public void loadPayPal(){
        Intent intent = new Intent(this, PayPalService.class);

    }

    private void setListeners(){
        Onclick onclick = new Onclick();
        existing_card.setOnClickListener(onclick);
        question.setOnClickListener(onclick);
    }


    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent = null;
            switch (view.getId()){
                case R.id.question_mark:
                    Toast toast = Toast.makeText(Payment_method.this,"The CVV code is a 3 digit code that we ask you to enter. It adds and extra level of security to your payment.", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    break;

            }
        }
    }
}