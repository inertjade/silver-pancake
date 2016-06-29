package com.amazon.indrajek.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;

        final Button buildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                displayToast(buildItBiggerButton.getText().toString().toLowerCase(), context, duration);
            }
        });

        final Button popularMoviesButton = (Button) findViewById(R.id.popularMoviesButton);
        popularMoviesButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                displayToast(popularMoviesButton.getText().toString().toLowerCase(), context, duration);
            }
        });

        final Button capstoneButton = (Button) findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                displayToast(capstoneButton.getText().toString().toLowerCase(), context, duration);
            }
        });

        final Button goUbitquitousButton = (Button) findViewById(R.id.goUbitquitousButton);
        goUbitquitousButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                displayToast(goUbitquitousButton.getText().toString().toLowerCase(), context, duration);
            }
        });

        final Button makeYourAppMaterialButton = (Button) findViewById(R.id.makeYourAppMaterialButton);
        makeYourAppMaterialButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                displayToast(makeYourAppMaterialButton.getText().toString().toLowerCase(), context, duration);
            }
        });

        final Button StockHawkButton = (Button) findViewById(R.id.StockHawkButton);
        StockHawkButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                displayToast(StockHawkButton.getText().toString().toLowerCase(), context, duration);
            }
        });


    }

    public void displayToast(CharSequence text, Context context, int duration) {
        Toast toast = Toast.makeText(context, "This button will launch my " + text + " app!", duration);
        toast.show();
    }

}
