package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RockPaperScissorsActivity extends AppCompatActivity {
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView gameRulesText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);
        Log.d(getClass().toString(), "onCreate called");

        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton =(Button)findViewById(R.id.paper_button);
        scissorsButton =(Button)findViewById(R.id.scissors_button);
    }

    public void setRockButton(View button){
        Log.d(getClass().toString(), "Rock Button Clicked");

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", EnumThing.ROCK);

        startActivity(intent);

    }

    public void setPaperButton(View button){
        Log.d(getClass().toString(), "Paper Button Clicked");

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", EnumThing.PAPER);

        startActivity(intent);

    }

    public void setScissorsButton(View button){
        Log.d(getClass().toString(), "Scissors Button Clicked");

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", EnumThing.SCISSORS);

        startActivity(intent);


    }


}
