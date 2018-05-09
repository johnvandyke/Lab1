package edu.wmich.lab1jvandyk5713;

/*
*************************************
* Programmer: John VanDyke
* Class ID: jvandyk5713
* Lab #1
* CIS 2610: Business Mobile Programming
* Fall 2015
* Due date: 10/1/2015
* Date completed: 10/2/2015
*************************************
*This Java file contains the code for the buttons that are used to go from the MainActivity to
* JokeActivity and EscapeActivity.  The code contains an onClickListener, which "arms" the button
* so it's actually able to be clicked.  startActivity is what actually creates the instance of
* the new activity, whether it be JokeActivity (btnReveal) or EscapeActivity (btnEscape).
*************************************
*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Line 34 defines btnReveal as a button
        Button btnReveal = (Button) findViewById(R.id.btnReveal);

        //Lines 37 to 42 arm the button and make it clickable to go to JokeActivity.Java
        btnReveal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, JokeActivity.class));
            }
        });

        Button btnEscape = (Button) findViewById(R.id.btnEscape);
        btnEscape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EscapeActivity.class));
            }
        });
    }

}

