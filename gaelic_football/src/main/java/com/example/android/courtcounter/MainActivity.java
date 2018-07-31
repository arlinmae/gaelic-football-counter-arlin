package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointA = 0;
    int pointB = 0;
    int goalA = 0;
    int goalB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given points/goals for Team A.
     */
    public void displayForTeamA(int pointA, int goalA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(pointA) + "-" +String.valueOf(goalA));

    }

    public void displayScoreA(int pointA, int goalA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_total_score);
        int score = pointA + (goalA * 3);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given points/ goals for Team B.
     */
    public void displayForTeamB(int pointB, int goalB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(pointB) + "-" + String.valueOf(goalB));
    }

    public void displayScoreB(int pointB, int goalB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_total_score);
        int score = pointB + (goalB * 3);
        scoreView.setText(String.valueOf(score));
    }

    public void pointA(View view) {
        pointA += 1;
        displayForTeamA(pointA, goalA);
        displayScoreA(pointA, goalA);
    }

    public void goalA(View view) {
        goalA += 1;
        displayForTeamA(pointA, goalA);
        displayScoreA(pointA, goalA);
    }


    public void pointB(View view) {
        pointB += 1;
        displayForTeamB(pointB, goalB);
        displayScoreB(pointB, goalB);
    }

    public void goalB(View view) {
        goalB += 1;
        displayForTeamB(pointB, goalB);
        displayScoreB(pointB, goalB);
    }


    public void reset(View view) {
        pointA = 0;
        goalA = 0;
        pointB = 0;
        goalB = 0;
        displayForTeamA(pointA, goalA);
        displayForTeamB(pointB, goalB);
        displayScoreA(pointA, goalA);
        displayScoreB(pointB, goalB);
    }

}
