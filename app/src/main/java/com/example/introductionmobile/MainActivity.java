package com.example.introductionmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    int bairogScore = 0;
    int edScore = 0;
    int bisonScore = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Drawable background = getDrawable(R.drawable.background);
        background.setAlpha(80);

    }

    private void bairogScore(){
        Button bairogWon = findViewById(R.id.BalrogWon);
        Button bairogLose = findViewById(R.id.BalrogLose);

        bairogWon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bairogScore++;
            }
        });

        bairogLose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bairogScore--;
            }
        });
    }

    private void edScore(){
        Button edWon = findViewById(R.id.edWon);
        Button edLose = findViewById(R.id.edLose);

        edWon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edScore++;
            }
        });

        edLose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edScore--;
            }
        });
    }

    private void bisonScore(){
        Button bisonWon = findViewById(R.id.bisonWon);
        Button bisonLose = findViewById(R.id.bisonLose);

        bisonWon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bisonScore++;
            }
        });

        bisonLose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bisonScore--;
            }
        });
    }

}