package com.dion.higherorlowerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random randomGenerator;
    int randomNumber;
    public void clickFunction(View view) {
        EditText inputGuess = (EditText) findViewById(R.id.guessInput);
        Log.i("This is the guess :", inputGuess.getText().toString());
        if(inputGuess.getText().toString().trim().equals("")) {
            Toast.makeText(getApplicationContext(), "Please enter a valid number", Toast.LENGTH_LONG).show();
        }else{
            int finalGuess = Integer.parseInt(inputGuess.getText().toString());
            System.out.println("This is randomNumber: " +  randomNumber);

            if(finalGuess > randomNumber ) {
                Toast.makeText(getApplicationContext(), "Your guess is too high", Toast.LENGTH_LONG).show();
            }else if(finalGuess < randomNumber) {
                Toast.makeText(getApplicationContext(), "Your guess is too low", Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(getApplicationContext(), "You guessed the correct number!", Toast.LENGTH_LONG).show();
                randomNumber = randomGenerator.nextInt(21);
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);
    }
}
