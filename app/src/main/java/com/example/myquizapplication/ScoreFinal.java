package com.example.myquizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ScoreFinal extends AppCompatActivity {
TextView tvScoreFinal,tvPseudoName;
String pseudo;
ImageView btnhome;
EditText editTextTo;
Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_final);
        tvScoreFinal = findViewById(R.id.tvScore);
        btnhome = findViewById(R.id.homebtn);
        tvPseudoName = findViewById(R.id.tvPseudoName);
        tvPseudoName.setText(Score.getPseudo());
        editTextTo = findViewById(R.id.tvmail);
        btnSend = findViewById(R.id.btnSend);
        if (Score.getScore()>=8){
            tvScoreFinal.setTextColor(getResources().getColor(R.color.green));
        }
        else{
            tvScoreFinal.setTextColor(getResources().getColor(R.color.red));
        }
        tvScoreFinal.setText(String.valueOf(Score.getScore()));

        //Home button
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreFinal.this,QuizActivity.class);
                startActivity(intent);
                Score.setScore(0);
            }
        });
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to=editTextTo.getText().toString();
                String subject="Mon score";
                String message=String.valueOf(Score.getScore());


                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));
            }
        });
    }
}