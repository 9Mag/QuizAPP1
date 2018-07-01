package com.example.admin.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    int correctAnswers = 0;
    int currentValueOfCorrectAnswers;
    String answer1 = "xml";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // This method is called when the submitAnswer button is clicked
    public void submitAnswers(View view) {

        //To capture the name written by user
        EditText nameInput = (EditText) findViewById(R.id.name_field);
        String name = nameInput.getText().toString();

        // To capture answer entered to question 1
        EditText quesOneAnswer = (EditText) findViewById(R.id.ques1_ans);
        String ansEntered = quesOneAnswer.getText().toString();

        Boolean truth = ansEntered.equals(answer1);

        if (truth)
            correctAnswers++;
        Toast.makeText(this, "Name: " + name + "\n\nTotal Score: " + correctAnswers + " correct answers out of Five possible Answers ", Toast.LENGTH_SHORT).show();
    }

    //Method for Handling radio buttons for question2
    public void onRB2Click(View view) {
        // Is the button now checked?
        boolean checked2 = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio1_button:
                if (checked2)
                    break;

            case R.id.radio2_button:
                if (checked2)
                    correctAnswers++;
                //Toast.makeText(this,"Question 2 Answered Correctly!",Toast.LENGTH_SHORT).show();
                break;

            case R.id.radio3_button:
                if (checked2)
                    break;

            case R.id.radio4_button:
                if (checked2)
                    break;
        }

    }


    // Method for validating Question 3 checkbox answers
    public void onCB3Click(View view) {

        // Is the checkbox now checked?
        boolean checked3 = ((CheckBox) view).isChecked();

        // Check which CHECKBOX  button was clicked
        switch (view.getId()) {
            case R.id.checkB1_q3:
                if (checked3)
                    break;

            case R.id.checkB2_q3:
                if (checked3)
                    break;

            case R.id.checkB3_q3:
                if (checked3)
                    correctAnswers++;
                //Toast.makeText(this,"Question 3 Answered Correctly!",Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkB4_q3:
                if (checked3)
                    correctAnswers++;
                //Toast.makeText(this,"Question 3 Answered Correctly!",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    //Method for Handling question4 radio buttons
    public void onRB4Click(View view) {
        // Is the button now checked?
        boolean checked4 = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q4radio_button1:
                if (checked4)
                    break;

            case R.id.q4radio_button2:
                if (checked4)
                    break;

            case R.id.q4radio_button3:
                if (checked4)
                    break;

            case R.id.q4radio_button4:
                if (checked4)
                    correctAnswers++;
                //Toast.makeText(this,"Question 4 Answered Correctly!",Toast.LENGTH_SHORT).show();
                break;
        }


    }


}
