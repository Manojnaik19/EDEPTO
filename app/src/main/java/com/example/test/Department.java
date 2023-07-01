package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Department extends AppCompatActivity {

    Button btncs;
    Button btnise;
    Button btnece;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        btncs =(Button)findViewById(R.id.btncs);
        btnise =(Button)findViewById(R.id.btnise);
        btnece=(Button)findViewById(R.id.btnece);

        btncs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Department.this,Scheme.class);
                startActivity(intent);
            }
        });



        btnise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Department.this,Scheme.class);
                startActivity(intent);
            }
        });
        btnece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Department.this,Scheme.class);
                startActivity(intent);
            }
        });







}
}