package com.codewithmomin.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.myImg);
        imageView.setImageResource(R.drawable.m);
        Button myBtn1=findViewById(R.id.Signbtn);
        Button myBtn2=findViewById(R.id.Login);



    }
}