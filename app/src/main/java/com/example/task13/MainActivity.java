package com.example.task13;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/**
 * @author Matan Taito
 * @version 1.0
 * יישום זה מאפשר למשתמש לשנות את צבע הרקע של המסך באמצעות בחירת כפתורי רדיו (RadioButton),
 *בתנאי שהמתג (Switch) נמצא במצב פעיל.
 */
public class MainActivity extends AppCompatActivity {

    Switch sw;
    RadioButton rB1, rB2, rB3, rB4;
    RadioGroup rG;
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
        rB4 = findViewById(R.id.rB4);
        rG = findViewById(R.id.rG);
    }

    /**
     * מתודת טיפול באירוע לחיצה (OnClick).
     * <p>
     * אם המתג (sw) דלוק, המתודה בודקת איזה כפתור רדיו נבחר ומשנה את צבע הרקע
     * של ה-LinearLayout בהתאם. בסיום הפעולה, בחירת כפתורי הרדיו מתנקה.
     * </p>
     *
     * @param view הרכיב עליו נלחץ (בדרך כלל כפתור ה-Button המפעיל).
     */
    public void clicked(View view) {
        if (sw.isChecked())
        {
            if(rB1.isChecked()) main.setBackgroundColor(Color.BLUE);
            else if(rB2.isChecked()) main.setBackgroundColor(Color.YELLOW);
            else if(rB3.isChecked()) main.setBackgroundColor(Color.GRAY);
            else if(rB4.isChecked()) main.setBackgroundColor(Color.GREEN);
            else main.setBackgroundColor(Color.WHITE);
        }
        rG.clearCheck();
    }
}