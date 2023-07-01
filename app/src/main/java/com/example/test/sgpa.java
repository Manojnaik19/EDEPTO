package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class sgpa extends AppCompatActivity {

    private EditText editTextNumOfSubjects;
    LinearLayout layoutSubjects;
    private Button buttonAddSubjects;
    private Button buttonCalculate;
    private TextView textViewResult;

    private ArrayList<EditText> editTextSubjectMarksList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpa);

        editTextNumOfSubjects = findViewById(R.id.editTextNumOfSubjects);
        layoutSubjects = findViewById(R.id.layoutSubjects);
        buttonAddSubjects = findViewById(R.id.buttonAddSubjects);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonAddSubjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSubjectMarksEditTexts();
            }
        });

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSGPA();
            }
        });
    }

    private void addSubjectMarksEditTexts() {
        int numOfSubjects = Integer.parseInt(editTextNumOfSubjects.getText().toString());

        editTextSubjectMarksList = new ArrayList<>();

        for (int i = 0; i < numOfSubjects; i++) {
            EditText editTextSubjectMarks = new EditText(this);
            editTextSubjectMarks.setHint("Enter marks for subject " + (i + 1));
            editTextSubjectMarks.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
            layoutSubjects.addView(editTextSubjectMarks);
            editTextSubjectMarksList.add(editTextSubjectMarks);
        }

        layoutSubjects.setVisibility(View.VISIBLE);
    }

    private void calculateSGPA() {
        int numOfSubjects = editTextSubjectMarksList.size();
        int[] grades = new int[numOfSubjects];

        for (int i = 0; i < numOfSubjects; i++) {
            EditText editTextSubjectMarks = editTextSubjectMarksList.get(i);
            String marksString = editTextSubjectMarks.getText().toString();

            if (!marksString.isEmpty()) {
                int marks = Integer.parseInt(marksString);
                grades[i] = marks;
            }
        }

        // Calculate the SGPA
        double totalSubjects = numOfSubjects;
        double totalGradePoints = 0;

        for (int i = 0; i < numOfSubjects; i++) {
            totalGradePoints += getGradePoint(grades[i]);
        }

        double sgpa = totalGradePoints / totalSubjects;

        textViewResult.setText("Your SGPA is: " + sgpa);
    }

    private double getGradePoint(int grade) {
        if (grade >= 90 && grade <= 100) {
            return 10.0;
        } else if (grade >= 80 && grade < 90) {
            return 9.0;
        } else if (grade >= 70 && grade < 80) {
            return 8.0;
        } else if (grade >= 60 && grade < 70) {
            return 7.0;
        } else if (grade >= 50 && grade < 60) {
            return 6.0;
        } else if (grade >= 45 && grade < 50) {
            return 5.0;
        } else if (grade >= 40 && grade < 45) {
            return 4.0;
        } else {
            return 0.0;
        }
    }
}

