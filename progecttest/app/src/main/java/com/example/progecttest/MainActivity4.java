package com.example.progecttest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView rez1, rez2, rez3, rez4, rez;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        rez1 = findViewById(R.id.rez1);
        rez2 = findViewById(R.id.rez2);
        rez3 = findViewById(R.id.rez3);
        rez4 = findViewById(R.id.rez4);
        rez = findViewById(R.id.rez);
        MainActivity.bal+=MainActivity.s1-MainActivity.s2+MainActivity.s3-MainActivity.s4+MainActivity.s5;
        switch (MainActivity.bal) {
            case 1:
                rez1.setVisibility(View.VISIBLE);
                break;
            case 2:
                rez2.setVisibility(View.VISIBLE);
                break;
            case 3:
                rez3.setVisibility(View.VISIBLE);
                break;
            case 4:
                rez4.setVisibility(View.VISIBLE);
                break;
            case 0:
                rez.setVisibility(View.VISIBLE);
                break;
        }
    }
}