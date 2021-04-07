package com.moringa.covidtracker.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.covidtracker.Adapter.CovidCasesAdapter;
import com.moringa.covidtracker.R;
import com.moringa.covidtracker.models.All;
import com.moringa.covidtracker.models.Cases;
import com.moringa.covidtracker.network.CovidApi;
import com.moringa.covidtracker.network.CovidClient;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CountryActivity extends AppCompatActivity {
    @BindView(R.id.casesRecyclerView)
    RecyclerView mCasesRecyclerView;
    @BindView(R.id.errorTextView)
    TextView mErrorTextView;

    private Cases mCases;
    private List<Cases> mCasesList = new ArrayList<Cases>();
    private CovidCasesAdapter mCasesAdapter;

    String country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        ButterKnife.bind(this);

        //Set title of the activity on the menu bar
        getSupportActionBar().setTitle("Covid Stats");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String country = intent.getStringExtra("country");
        String welcomeText= "Welcome to TrackCovid " + country;
        Toast.makeText(CountryActivity.this, welcomeText, Toast.LENGTH_LONG).show();

        //Create call object to use on the api and getting response from the api
        CovidApi client = CovidClient.getCases();
        Call<Cases> call = client.getCases(country);

        call.enqueue(new Callback<Cases>(){

            @Override
            public void onResponse(Call<Cases> call, Response<Cases> response) {
                if (response.isSuccessful()){
                    All all = response.body().getAll();
                    mCases = new Cases(all);
                    mCasesList.add(mCases);
                    mCasesAdapter = new CovidCasesAdapter(CountryActivity.this, mCasesList);
                    mCasesRecyclerView.setAdapter(mCasesAdapter);
                    RecyclerView.LayoutManager layoutManager =
                            new LinearLayoutManager(CountryActivity.this);
                    mCasesRecyclerView.setLayoutManager(layoutManager);
                    mCasesRecyclerView.setHasFixedSize(true);

                    showCases();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<Cases> call, Throwable t) {
                showUnsuccessfulMessage();
            }
        });
    }

    //creating the additional menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_bar, menu);
        return true;
    }

    //setting functions for the menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent intent = new Intent( CountryActivity.this, FAQActivity.class);
                intent.putExtra("country", country);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //function for showing the recycler view
    private void showCases() {
        mCasesRecyclerView.setVisibility(View.VISIBLE);
    }

    //unsuccessful message for when the response fails
    private void showUnsuccessfulMessage() {
        mErrorTextView.setVisibility(View.VISIBLE);
    }
}
