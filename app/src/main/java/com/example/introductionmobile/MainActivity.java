package com.example.introductionmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 1;
    TextView quantityText, totalMessage;
    Button order, incrementButton, decrementButton;
    String message;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementQuantity();
        decrementQuantity();
        orderButton();

        quantityText = findViewById(R.id.quantity);
        message = "Your total is $ ";
        totalMessage = findViewById(R.id.totalMessage);
    }

    private void incrementQuantity(){
        incrementButton = findViewById(R.id.increment);

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

    private void decrementQuantity(){
        decrementButton = findViewById(R.id.decrement);

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
    private void orderButton(){
        order = findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalNumber = quantity * 15;

                totalMessage.setText(message + totalNumber + "!" + "\n" + " Thanks for buying with us.");
            }
        });
    }
}