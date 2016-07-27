package com.dion.higherorlowerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText inputGuess = (EditText) findViewById(R.id.guessInput);
        Log.i("This is the guess :", inputGuess.getText().toString());
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(11);
        int finalGuess = Integer.parseInt(inputGuess.getText().toString());

        if(finalGuess > randomNumber ) {
            Toast.makeText(getApplicationContext(), "Your guess is too high", Toast.LENGTH_LONG).show();
        }else if(finalGuess < randomNumber) {
            Toast.makeText(getApplicationContext(), "Your guess is too low", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getApplicationContext(), "You guessed the correct number!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
