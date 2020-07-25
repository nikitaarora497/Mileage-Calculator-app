package com.example.mileagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class search extends AppCompatActivity {
    EditText search_Value;
    Button search;
    TextView result;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        search_Value = findViewById(R.id.search_value);
        search = findViewById(R.id.search);
        result = findViewById(R.id.result);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = search_Value.getText().toString();
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, value);
                startActivity(intent);
                result.setText("Search in progress");
            }
        });

    }
}