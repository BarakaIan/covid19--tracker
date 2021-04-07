package com.moringa.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class CountryActivity extends AppCompatActivity {

    //This activity is to be implemented in the future

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        getSupportActionBar().setTitle("Covid Stats");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //getting the user input from previous activities
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        String welcomeText= "Welcome to TrackCovid " + userName;
        Toast.makeText(CountryActivity.this, welcomeText, Toast.LENGTH_LONG).show();
    }
}