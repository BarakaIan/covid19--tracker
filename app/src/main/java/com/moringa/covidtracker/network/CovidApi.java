package com.moringa.covidtracker.network;

import com.moringa.covidtracker.models.CovidCases;

public interface CovidApi {
    @GET("cases")
    Call<CovidCases> getCases(
//            @Query("continent") String continent,
            @Query("country") String country
    );
}
