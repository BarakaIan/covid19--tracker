package com.moringa.covidtracker.network;

import com.moringa.covidtracker.Constants;
import com.moringa.covidtracker.models.AllCountriesResponse;
import com.moringa.covidtracker.models.CountriesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public abstract class CoronaService {
    @GET("countries/?sort=country")
    abstract Call<List<CountriesResponse>> getCountries();


    @GET("countries/{country}")
    abstract Call<CountriesResponse> getCountryInfo(

            @Path("country") String country
    );

    @GET("all")
    abstract Call<AllCountriesResponse> getAllCountries();
}
