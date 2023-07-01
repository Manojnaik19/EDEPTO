package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sixth extends AppCompatActivity {

    Button a10,a9,a18,a7,a6,a5,a4,a3,a2,a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        a9 = (Button) findViewById(R.id.a9);
        a10 = (Button) findViewById(R.id.a10);
        a1 = (Button) findViewById(R.id.a1);
        a2 = (Button) findViewById(R.id.a2);
        a3 = (Button) findViewById(R.id.a3);
        a4 = (Button) findViewById(R.id.a4);
        a5 = (Button) findViewById(R.id.a5);
        a6 = (Button) findViewById(R.id.a6);
        a7 = (Button) findViewById(R.id.a7);
        a18 = (Button) findViewById(R.id.a18);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1j9dpHuDNLL5E3h_GiBvaBJoBzObOa1BT?usp=sharing");
            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1ajyCeqQKqaIldLnGrGQ1trLbLcu8-6VI?usp=sharing");
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1SimhbUexIYLAWcoBakMwJfZ2fC6t3K93?usp=sharing");
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1cX9n4b8Vjrzfx0TiRXQ2m511l_t3lNl9?usp=sharing");
            }
        });

        a10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sixth.this, syllabus.class);
                startActivity(intent);
            }
        });
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1MbYtz_xTcoT1Lq8C931MWALTodVmS2KZ?usp=sharing");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri ));
    }
}