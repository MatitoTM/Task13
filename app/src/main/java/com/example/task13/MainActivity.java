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
 * @version 1.1
 * יישום זה מנהל את צבע הרקע של ממשק המשתמש באמצעות RadioGroup ו-Switch.
 * היישום פועל בשני מצבים: שינוי צבע מיידי בעת בחירת כפתור רדיו כאשר המתג כבוי,
 * או שינוי צבע רק לאחר לחיצה על כפתור ייעודי כאשר המתג פעיל.
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
     * מתודה המטפלת בלחיצה על כפתור האישור.
     * שינוי הצבע יתבצע רק אם המתג (Switch) נמצא במצב פעיל.
     * בסיום הפעולה, הבחירה ב-RadioGroup מתנקה.
     * * @param view הרכיב עליו התבצעה הלחיצה.
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
    
    /**
     * מתודה המטפלת בבחירה ישירה של כפתור רדיו בתוך ה-RadioGroup.
     * שינוי הצבע מתבצע באופן מיידי בהתאם לכפתור שנבחר, בתנאי שהמתג (Switch) כבוי.
     * * @param view כפתור הרדיו הספציפי שנבחר על ידי המשתמש.
     */
    public void onRadioButtonClicked(View view) {
        if (!sw.isChecked())
        {
            if (view.getId() == R.id.rB1) main.setBackgroundColor(Color.BLUE);
            else if (view.getId() == R.id.rB2) main.setBackgroundColor(Color.YELLOW);
            else if (view.getId() == R.id.rB3) main.setBackgroundColor(Color.GRAY);
            else if (view.getId() == R.id.rB4) main.setBackgroundColor(Color.GREEN);
            else main.setBackgroundColor(Color.WHITE);
        }
    }
}