package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Scheme extends AppCompatActivity {

    Button button10;
    Button buttonsc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme);

        button10=(Button)findViewById(R.id.button10);
        buttonsc=(Button)findViewById(R.id.buttonsc);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Scheme.this, Semcse.class);
                startActivity(intent);
            }
        });



        buttonsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Scheme.this, Semcse.class);
                startActivity(intent);
            }
        });







    }
}