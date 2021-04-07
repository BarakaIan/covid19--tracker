package com.moringa.covidtracker.network;

import com.moringa.covidtracker.models.CovidCases;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CovidApi {
    @GET("cases")
    Call<CovidCases> getCases(
//            @Query("continent") String continent,
            @Query("country") String country
    );

}
