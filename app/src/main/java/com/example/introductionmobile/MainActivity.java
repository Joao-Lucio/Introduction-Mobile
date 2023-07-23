package com.example.introductionmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 1;
    TextView quantityText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementQuantity();
        decremenQuantity();

        quantityText = findViewById(R.id.quantity);
    }

    private void incrementQuantity(){
        Button incrementButton = findViewById(R.id.increment);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity < 10){
                quantity++;
                }

                quantityText.setText(String.valueOf(quantity));
            }
        });
    }

    private void decremenQuantity(){
        Button decrementButton = findViewById(R.id.decrement);

        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(quantity > 1){
                quantity--;
                }

                quantityText.setText(String.valueOf(quantity));
            }
        });
    }
}