package com.example.dashboardbottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculator3 extends AppCompatActivity {

    TextView shapeText3, resultView3;
    EditText inputParam3_1, inputParam3_2, inputParam3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator3);

        shapeText3 = findViewById(R.id.shapeName3);
        inputParam3_1 = findViewById(R.id.inputParam3_1);
        inputParam3_2 = findViewById(R.id.inputParam3_2);
        inputParam3_3 = findViewById(R.id.inputParam3_3);
        resultView3 = findViewById(R.id.resultView3);

        Intent intent = getIntent();
        String shape = intent.getStringExtra("shape3");

        shapeText3.setText(shape);

        Button button1 = findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea3(shape);
            }
        });
    }

    private void calculateArea3(String shape) {
        String inputUser1 = inputParam3_1.getText().toString();
        String inputUser2 = inputParam3_2.getText().toString();
        String inputUser3 = inputParam3_3.getText().toString();
        if (!inputUser1.isEmpty() && !inputUser2.isEmpty()) {
            double number1 = Double.parseDouble(inputUser1);
            double number2 = Double.parseDouble(inputUser2);
            double number3 = Double.parseDouble(inputUser3);
            double area = 0;
            switch (shape) {
                case "Rectangle":
                    area = number1 * number2 * number3;
                    break;
            }
            String resultArea = String.format("%.2f", area);
            resultView3.setText("Area: " + resultArea);

        } else {
            resultView3.setText("Masukkan Angka");
        }
    }

}