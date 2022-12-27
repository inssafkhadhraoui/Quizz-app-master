package com.example.myquizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {
Button btnSI, btnTIC, btnBD,btnAP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //SI
        btnSI = findViewById(R.id.si);
        btnSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuizActivity.this,SystemesInformations.class );
                startActivity(intent);
            }
        });
        //BD
        btnBD = findViewById(R.id.bd);
        btnBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBD=new Intent(QuizActivity.this,BD.class );
                startActivity(intentBD);
            }
        });
        //TIC
        btnTIC = findViewById(R.id.tic);
        btnTIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSI=new Intent(QuizActivity.this,TIC.class );
                startActivity(intentSI);
            }
        });
        //Algorithmes et programmation
        btnAP = findViewById(R.id.ap);
        btnAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAP=new Intent(QuizActivity.this,AlgoProgrammation.class );
                startActivity(intentAP);
            }
        });

    }
}