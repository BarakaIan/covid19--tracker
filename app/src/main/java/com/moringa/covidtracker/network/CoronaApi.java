package com.moringa.covidtracker.network;

import com.moringa.covidtracker.models.AllCountriesResponse;
import com.moringa.covidtracker.models.CountriesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CoronaApi {

    public static final String FIREBASE_CHILD_Email = "email";
    public static final String FIREBASE_CHILD_Password = "password";

    @GET("countries/?sort=country")
    static retrofit2.Call<List<CountriesResponse>> getCountries() {
        return null;
    }


    @GET("countries/{country}")
    public static retrofit2.Call<CountriesResponse> getCountryInfo(

            @Path("country") String country
    ) {
        return null;
    }

    @GET("all")
    static Call<AllCountriesResponse> getAllCountries() {
        return null;
    }
}






