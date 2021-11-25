package com.example.progecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements  View.OnClickListener{
TextView inp1;
Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        inp1=findViewById(R.id.inp1);
        String string =inp1.getText().toString().trim();
        String string1="two";
        if (string1.equals(string)) {
            MainActivity.bal++;
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                Intent i = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(i);
                break;
            case R.id.button1:
                String string =inp1.getText().toString().trim();
                String string1="sleep";
                if (string1.equals(string)) {
                    MainActivity.bal++;
                }
                Intent o = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(o);
                break;
        }
    }
}