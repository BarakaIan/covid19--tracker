package com.moringa.covidtracker.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.covidtracker.Adapter.CountryAdapter;
import com.moringa.covidtracker.R;

import com.squareup.picasso.Picasso;



public class CountryActivity extends AppCompatActivity {

    ImageView ivCountryPoster;
    TextView tvCountryName, tvTodayCases, tvTodayDeath, tvTotalTests, tvTotalCases, tvTotalDeaths, tvTotalRecovered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        tvCountryName = findViewById(R.id.tvCountryName);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTodayDeath = findViewById(R.id.tvTodayDeath);
        tvTotalTests = findViewById(R.id.tvTotalTests);
        tvTotalCases = findViewById(R.id.tvTotalCases);
        tvTotalDeaths = findViewById(R.id.tvTotalDeaths);
        tvTotalRecovered = findViewById(R.id.tvTotalRecovered);

        ivCountryPoster = findViewById(R.id.ivCountryPoster);


        String countryName = getIntent().getStringExtra("country");
        String todayCase = getIntent().getStringExtra("todayCase");
        String todayDeath = getIntent().getStringExtra("todayDeath");
        String totalCases = getIntent().getStringExtra("cases");
        String totalDeaths = getIntent().getStringExtra("deaths");
        String totalTests = getIntent().getStringExtra("tests");
        String totalRecovered = getIntent().getStringExtra("recovered");

        tvCountryName.setText(countryName);
        tvTodayCases.setText(todayCase);
        tvTodayDeath.setText(todayDeath);

        tvTotalTests.setText(totalTests);
        tvTotalCases.setText(totalCases);
        tvTotalDeaths.setText(totalDeaths);
        tvTotalRecovered.setText(totalRecovered);


        Picasso.with(getApplicationContext()).
                load(getIntent().getStringExtra("flag"))
                .into(ivCountryPoster);


    }
}
