package com.moringa.covidtracker.network;

import com.moringa.covidtracker.models.CountriesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CoronaApi {
    //declare call function of the cases with country as the parameter to pass
    @GET("cases")
    Call<CountriesResponse> getCases(
            @Query("country") String country
    );
}






