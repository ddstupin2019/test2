package com.example.progecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity implements  View.OnClickListener {
    RadioButton radio1, radio2, radio3, radio4;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        radio4 = findViewById(R.id.radio4);
        radio1.setChecked(MainActivity.m5);
        radio2.setChecked(MainActivity.m6);
        radio3.setChecked(MainActivity.m7);
        radio4.setChecked(MainActivity.m8);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.button1:
                if (radio1.isChecked()) {
                    MainActivity.s5=1;
                    MainActivity.m5=true;
                }
                else{
                    MainActivity.m5=false;
                }

                if (radio2.isChecked()) {
                    MainActivity.m6=true;
                }
                else{
                    MainActivity.m6=false;
                }

                if (radio3.isChecked()) {
                    MainActivity.m7=true;
                }
                else{
                    MainActivity.m7=false;
                }

                if (radio4.isChecked()) {
                    MainActivity.m8=true;
                }
                else{
                    MainActivity.m8=false;
                }
                Intent o = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(o);
                break;
        }
    }
}