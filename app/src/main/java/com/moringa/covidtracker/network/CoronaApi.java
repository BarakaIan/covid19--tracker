package com.moringa.covidtracker.network;

import com.moringa.covidtracker.models.AllCountriesResponse;
import com.moringa.covidtracker.models.CountriesResponse;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.Path;


public interface CoronaApi {


    String CORONA_BASE_URL = null;

    static void getRetrofitInstance() {
    }


    @GET("countries/?sort=country")
    Call<List<CountriesResponse>> getCountries();


    @GET("countries/{country}")
    Call<CountriesResponse> getCountryInfo(

            @Path("country") String country
    );

    @GET("all")
    Call<AllCountriesResponse> getAllCountries();

//    static Retrofit getRetrofitInstance() {
//
//        if (retrofit == null) {
//            retrofit = new retrofit2.Retrofit.Builder()
//                    .baseUrl(CORONA_BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//        return retrofit;
//    }
}
