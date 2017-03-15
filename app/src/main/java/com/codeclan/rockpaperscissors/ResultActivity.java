package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static android.R.id.input;

public class ResultActivity extends AppCompatActivity {

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(getClass().toString(), "result onCreate called" );

        Intent intent = getIntent();


        Bundle extras = intent.getExtras();
        EnumThing choice = (EnumThing) extras.get("result");

        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        String resultString = rockPaperScissors.winOrLose(choice);

        resultText = (TextView)findViewById(R.id.result_text);
        resultText.setText(resultString);
    }
}
