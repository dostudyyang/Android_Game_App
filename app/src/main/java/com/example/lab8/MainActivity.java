package com.example.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Game game;
    private String question;
    private String answer;
    private int score;
    private int qNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.game = new Game();
        this.question = "";
        this.qNum = 1;
        this.answer = "";
        this.score = 0;
        ask();
    }

    private void ask(){
        game =new Game();
        String s = game.qa();
        this.question = s.substring(0,s.lastIndexOf("\n"));
        this.answer = s.substring(s.lastIndexOf("\n")+1);
        ((TextView) findViewById(R.id.question)).setText(question);
        ((TextView) findViewById(R.id.qNum)).setText("Q# "+qNum);
        ((TextView) findViewById(R.id.score)).setText("SCORE " + score);

    }

    public void onDone(View v) {

        if (qNum < 10) {

            String ques = ((TextView) findViewById(R.id.qNum)).getText().toString() + ":" + question;
            String inputAnswer = ((EditText) findViewById(R.id.answer)).getText().toString().toUpperCase();
            String yourAnswer = "Your answer: " + inputAnswer;
            String log = ques + "\n" + yourAnswer + "\n" + "Correct answer: " + answer;
            String oldlog = ((TextView) findViewById(R.id.log)).getText().toString();
            ((TextView) findViewById(R.id.log)).setText(log + "\n\n" + oldlog);

            if (this.answer.toUpperCase().equals(inputAnswer)) {
                this.score++;
            }
            ((EditText) findViewById(R.id.answer)).setText("");
            if (qNum == 9) {
                ((TextView) findViewById(R.id.score)).setText("SCORE " + score);
                Button button = (Button) findViewById(R.id.done);
                button.setEnabled(false);
                ((TextView) findViewById(R.id.qNum)).setText("Game Over!");
                finish();
            } else {
                qNum++;
                ask();
            }
        }

    }
}