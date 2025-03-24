package com.example.nhap_mon_java_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button CalculateBMI_Btn = findViewById(R.id.CalculateBMI);
        CalculateBMI_Btn.setOnClickListener(v ->  calculateBMI());
    }
    private void calculateBMI(){
        try{
            EditText edtWeight = findViewById(R.id.WeightInputEdt);
            EditText edtHeight = findViewById(R.id.HeightInputEdt);
            String sWeight = edtWeight.getText().toString();
            String sHeight = edtHeight.getText().toString();
            float fWeight = Float.parseFloat(sWeight);
            float fHeight = Float.parseFloat(sHeight);
            float fBMI = fWeight / (fHeight * fHeight);
            TextView txtBMIEdt = findViewById(R.id.BMIEdt);
            txtBMIEdt.setText(String.valueOf(fBMI));
        }catch (Exception e){
            Toast.makeText(this, "Lỗi: Vui lòng nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
        }

    }
}