package com.example.nhap_mon_java_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        EditText edtHo = findViewById(R.id.edtHo);
        EditText edtTen = findViewById(R.id.edtTen);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ho = edtHo.getText().toString();
                String ten = edtTen.getText().toString();

                Intent intent = new Intent(MainActivity2.this, SecondActivity.class);
                intent.putExtra("HO", ho);
                intent.putExtra("TEN", ten);
                startActivity(intent);
            }
        });

    }
}