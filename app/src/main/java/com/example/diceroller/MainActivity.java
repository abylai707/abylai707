package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button rollDice;
    private ImageView imageView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollDice = (Button) findViewById(R.id.rollDice1);
        imageView1 = (ImageView) findViewById(R.id.imageView1);



        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomDiceValue();

            }
        });
    }

    private void  randomDiceValue() {
        int randomNumber = RANDOM.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageView1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageView1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageView1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageView1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageView1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageView1.setImageResource(R.drawable.dice6);
                break;

        }
    }
}