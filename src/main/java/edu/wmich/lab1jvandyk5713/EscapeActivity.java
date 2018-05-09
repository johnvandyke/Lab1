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
*This Java file was created for the activity when you click "escape joke" (btnEscape) on the MainActivity.
* This particular file does not have any code that processes anything that is an addition to what the activity
* contains when it is created.
*************************************
*/


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class EscapeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escape);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_escape, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
