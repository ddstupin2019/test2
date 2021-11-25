package com.example.progecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    CheckBox box1, box2, box3, box4;
    Button button1;
    public static int bal=0;
    public static int s1=0;
    public static int s2=0;
    public static int s3=0;
    public static int s4=0;
    public static int s5=0;
    public static boolean m1=false;
    public static boolean m2=false;
    public static boolean m3=false;
    public static boolean m4=false;
    public static boolean m5=false;
    public static boolean m6=false;
    public static boolean m7=false;
    public static boolean m8=false;
    int c=0,b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        box1=findViewById(R.id.checkbox1);
        box2=findViewById(R.id.checkbox2);
        box3=findViewById(R.id.checkbox3);
        box4=findViewById(R.id.checkbox4);
        box1.setChecked(MainActivity.m1);
        box2.setChecked(MainActivity.m2);
        box3.setChecked(MainActivity.m3);
        box4.setChecked(MainActivity.m4);
        button1=findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                if (box1.isChecked()){
                    MainActivity.m1=true;
                    s1=1;
                }
                else{
                    MainActivity.m1=false;
                    s1=0;
                }
                if (box2.isChecked()){
                    MainActivity.m2=true;
                    s2=1;
                }
                else{
                    MainActivity.m2=false;
                    s2=0;
                }
                if (box3.isChecked()){
                    MainActivity.m3=true;
                    s3=1;
                }
                else{
                    MainActivity.m3=false;
                    s3=0;
                }
                if (box4.isChecked()){
                    MainActivity.m4=true;
                    s4=1;
                }
                else{
                    MainActivity.m4=false;
                    s4=0;
                }
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
        }
    }
}