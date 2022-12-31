package com.vishalag53.tiptime;

import static com.vishalag53.tiptime.R.layout.main_activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(main_activity);
        RadioButton amazing_radio_btn,good_radio_btn,okay_radio_btn;
        Button calculate_btn;
        TextView result;

        EditText cost_entry = findViewById(R.id.cost_entry);
        amazing_radio_btn = findViewById(R.id.amazing_radio_btn);
        good_radio_btn = findViewById(R.id.good_radio_btn);
        okay_radio_btn = findViewById(R.id.okay_radio_btn);
        calculate_btn = findViewById(R.id.calculate_btn);
        result = findViewById(R.id.result);

        calculate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cost = Integer.parseInt(cost_entry.getText().toString());
                if(amazing_radio_btn.isChecked()){
                    double amount;
                    amount = cost*1.2;
                    String amountDouble = Double.toString(amount);
                    result.setText(amountDouble);
                }
                else if(good_radio_btn.isChecked()){
                    double amount;
                    amount = cost*1.15;
                    String amountDouble = Double.toString(amount);
                    result.setText(amountDouble);
                }
                else if(okay_radio_btn.isChecked()){
                    double amount;
                    amount = cost*1.1;
                    String amountDouble = Double.toString(amount);
                    result.setText(amountDouble);
                }
            }
        });
    }
}
