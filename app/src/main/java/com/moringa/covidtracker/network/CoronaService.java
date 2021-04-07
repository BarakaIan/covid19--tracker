package com.moringa.covidtracker.network;

import com.moringa.covidtracker.Constants;
import com.moringa.covidtracker.models.AllCountriesResponse;
import com.moringa.covidtracker.models.CountriesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class CoronaService {
    @GET("countries/?sort=country")
    Call<List<CountriesResponse>> getCountries() {
        return null;
    }


    @GET("countries/{country}")
    public Call<CountriesResponse> getCountryInfo(

            @Path("country") String country
    ) {
        return null;
    }

    @GET("all")
    Call<AllCountriesResponse> getAllCountries() {
        return null;
    }
}
