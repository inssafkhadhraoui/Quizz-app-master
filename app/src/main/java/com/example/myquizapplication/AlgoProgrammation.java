package com.example.myquizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class AlgoProgrammation extends AppCompatActivity {
    ImageView btnhome, btnnext, btnback;
    RadioButton rb1,rb2,rb3,rb4;
    TextView tvscore;
    Button btn;
    public void afficherReponse(){
        if(Score.isM3q1()==true) {
            rb1.setEnabled(false);
            rb2.setEnabled(false);
            rb3.setEnabled(false);
            rb4.setEnabled(false);
            rb4.setTextColor(getResources().getColor(R.color.green));
            rb2.setTextColor(getResources().getColor(R.color.red));
            rb1.setTextColor(getResources().getColor(R.color.red));
            rb3.setTextColor(getResources().getColor(R.color.red));
            btn.setEnabled(false);
        }}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algo_programmation);
        btnhome = findViewById(R.id.homebtn);
        btnnext = findViewById(R.id.nextbtn);
        btnback = findViewById(R.id.backbtn);
        rb1 = findViewById(R.id.RadioButton1);
        rb2 = findViewById(R.id.RadioButton2);
        rb3 = findViewById(R.id.RadioButton3);
        rb4 = findViewById(R.id.RadioButton4);
        btn = findViewById(R.id.button);
        tvscore = findViewById(R.id.tvScore);
        tvscore.setText(String.valueOf(Score.getScore()));
        afficherReponse();
        //Home button
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlgoProgrammation.this,QuizActivity.class);
                startActivity(intent);
            }
        });
        //next button
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlgoProgrammation.this,ProgrammationQ2.class);
                startActivity(intent);
            }
        });
        btnback.setEnabled(false);
        // bouton voir réponse
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb4.isChecked()) {
                    Score.setScore(Score.getScore() + 5);
                    tvscore.setText(String.valueOf(Score.getScore()));

                }
                Score.setM3q1(true);
                afficherReponse();
            }

        });
    }
}