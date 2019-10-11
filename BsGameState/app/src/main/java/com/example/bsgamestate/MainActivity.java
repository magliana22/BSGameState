package com.example.bsgamestate;


/**
 *
 * @author Kyle Sanchez
 * @author Gianni Magliana
 * @author Daniel Co
 * @author William Leung
 *
 */


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //implement onClick listener for run test button
        Button runTestButton = (Button) findViewById(R.id.runtest_button); //button not yet added
        runTestButton.setOnClickListener(runTestButton); //set onClick listener for run test button (not yet added)

    }

    @Override
    public void onClick(View view) {
        //what clicking the run test button will do
    }
}
