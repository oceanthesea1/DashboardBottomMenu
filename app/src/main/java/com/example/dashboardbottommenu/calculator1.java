package com.example.dashboardbottommenu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class calculator1 extends AppCompatActivity {

    TextView shapeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator1);

        shapeText = findViewById(R.id.shapeName1);

        Intent intent = getIntent();
        String shape = intent.getStringExtra("shape1");

        shapeText.setText(shape);
    }
}