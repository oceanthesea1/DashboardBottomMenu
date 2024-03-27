package com.example.dashboardbottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculator2 extends AppCompatActivity {

    TextView shapeText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);

        shapeText2 = findViewById(R.id.shapeName2);

        Intent intent = getIntent();
        String shape = intent.getStringExtra("shape2");

        shapeText2.setText(shape);
    }
}