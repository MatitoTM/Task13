package com.example.task13;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    RadioButton rB1, rB2, rB3;
    LinearLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main);
        sw = findViewById(R.id.sw);
        rB1 = findViewById(R.id.rB1);
        rB2 = findViewById(R.id.rB2);
        rB3 = findViewById(R.id.rB3);
    }

    public void clicked(View view) {
    }
}