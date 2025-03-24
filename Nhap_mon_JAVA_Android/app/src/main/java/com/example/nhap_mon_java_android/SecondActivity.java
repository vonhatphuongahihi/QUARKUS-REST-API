package com.example.nhap_mon_java_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        TextView txtResult = findViewById(R.id.txtResult);
        Button btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        String ho = intent.getStringExtra("HO");
        String ten = intent.getStringExtra("TEN");

        txtResult.setText("Họ tên: " + ho + " " + ten);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}