package com.example.myquizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MarketingQ3 extends AppCompatActivity {
    ImageView btnhome, btnnext, btnback;
    Button btn,btnTerminer;
    RadioButton rb1,rb2,rb4,rb3;
    TextView tvscore;

    public void afficherReponse(){
        if(Score.isM2q3()==true) {
            rb1.setEnabled(false);
            rb2.setEnabled(false);
            rb3.setEnabled(false);
            rb4.setEnabled(false);
            rb4.setTextColor(getResources().getColor(R.color.green));
            rb1.setTextColor(getResources().getColor(R.color.red));
            rb2.setTextColor(getResources().getColor(R.color.red));
            rb3.setTextColor(getResources().getColor(R.color.red));
            btn.setEnabled(false);
        }}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing_q3);
        btnhome = findViewById(R.id.homebtn);
        btnnext = findViewById(R.id.nextbtn);
        btnback = findViewById(R.id.backbtn);
        rb1 = findViewById(R.id.RadioButton1);
        rb2 = findViewById(R.id.RadioButton2);
        rb3 = findViewById(R.id.RadioButton3);
        rb4 = findViewById(R.id.RadioButton4);
        btn = findViewById(R.id.button);
        btnTerminer = findViewById(R.id.btnTerminer);
        tvscore = findViewById(R.id.tvScore);
        tvscore.setText(String.valueOf(Score.getScore()));
        afficherReponse();
        //Home button
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MarketingQ3.this,QuizActivity.class);
                startActivity(intent);
            }
        });
        //next button
        btnnext.setEnabled(false);
        // back button
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MarketingQ3.this,MarketingQ2.class);
                startActivity(intent);
            }
        });
        // bouton voir réponse

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb4.isChecked()) {
                    Score.setScore(Score.getScore() + 5);
                    tvscore.setText(String.valueOf(Score.getScore()));

                }
                Score.setM2q3(true);
                afficherReponse();
            }

        });
        // bouton terminer
        btnTerminer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MarketingQ3.this,ScoreFinal.class);
                startActivity(intent);
            }
        });
    }
}