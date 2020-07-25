package com.example.mileagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculate extends AppCompatActivity {
    EditText before;
    EditText after;
    EditText fuel;
    TextView result;
    Button mileage,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        before = (EditText)findViewById(R.id.before);
        after = (EditText)findViewById(R.id.after);
        fuel = (EditText)findViewById(R.id.fuel);
        result = (TextView) findViewById(R.id.result);
        mileage  = (Button) findViewById(R.id.mileage);
        back  = (Button) findViewById(R.id.back);

        mileage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(before.getText().toString());
                int num2 = Integer.parseInt(fuel.getText().toString());
                int num3 = Integer.parseInt(after.getText().toString());
                int cal =  (num3-num1)/num2;
                result.setText(String.valueOf(cal));
                Toast.makeText(calculate.this, "Mileage Calculated Successfully and Displayed", Toast.LENGTH_SHORT).show();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(calculate.this,MainActivity.class);
                startActivity(back);
                finish();
            }
        });

    }
}