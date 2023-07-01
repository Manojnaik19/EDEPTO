package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;




public class cgpa extends AppCompatActivity {

    private EditText editTextNumOfSemesters;
    private LinearLayout layoutSemesters;
    private Button buttonAddSemesters;
    private Button buttonCalculate;
    private TextView textViewResult;

    private ArrayList<EditText> editTextSGPAList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);

        editTextNumOfSemesters = findViewById(R.id.editTextNumOfSemesters);
        layoutSemesters = findViewById(R.id.layoutSemesters);
        buttonAddSemesters = findViewById(R.id.buttonAddSemesters);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonAddSemesters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSGPAEditTexts();
            }
        });

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCGPA();
            }
        });
    }

    private void addSGPAEditTexts() {
        int numOfSemesters = Integer.parseInt(editTextNumOfSemesters.getText().toString());

        editTextSGPAList = new ArrayList<>();

        for (int i = 0; i < numOfSemesters; i++) {
            EditText editTextSGPA = new EditText(this);
            editTextSGPA.setHint("Enter SGPA for Semester " + (i + 1));
            editTextSGPA.setInputType(android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL);
            layoutSemesters.addView(editTextSGPA);
            editTextSGPAList.add(editTextSGPA);
        }

        layoutSemesters.setVisibility(View.VISIBLE);
    }

    private void calculateCGPA() {
        int numOfSemesters = editTextSGPAList.size();
        double[] sgpaList = new double[numOfSemesters];

        for (int i = 0; i < numOfSemesters; i++) {
            EditText editTextSGPA = editTextSGPAList.get(i);
            String sgpaString = editTextSGPA.getText().toString();

            if (!sgpaString.isEmpty()) {
                double sgpa = Double.parseDouble(sgpaString);
                sgpaList[i] = sgpa;
            }
        }

        double totalSemesters = numOfSemesters;
        double totalGradePoints = 0;

        for (int i = 0; i < numOfSemesters; i++) {
            totalGradePoints += sgpaList[i];
        }

        double cgpa = totalGradePoints / totalSemesters;

        textViewResult.setText("Your CGPA is: " + cgpa);
    }
}