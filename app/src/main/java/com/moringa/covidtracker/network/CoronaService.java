package com.moringa.covidtracker.network;

import com.moringa.covidtracker.models.AllCountriesResponse;
import com.moringa.covidtracker.models.CountriesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class CoronaService {

//
//    private static Retrofit retrofit = null;
//
//    public static CoronaApi getClient() {
//
//        if (retrofit == null) {
////            OkHttpClient okHttpClient = new OkHttpClient.Builder()
////                    .addInterceptor(new Interceptor() {
////                        @Override
////                        public Response intercept(Chain chain) throws IOException {
////                            Request newRequest  = chain.request().newBuilder()
////                                    .addHeader("Authorization" CORONA_BASE_URL)
////                                    .build();
////                            return chain.proceed(newRequest);
////                        }
////                    })
////                    .build();
//
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(CORONA_BASE_URL)
////                    .client(okHttpClient)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
////
//       return retrofit.create(CoronaApi.class);
//    }
//
//    public Call<CountriesResponse> getCountryInfo(String country) {
//        return null;
//    }


    @GET("countries/?sort=country")
    Call<List<CountriesResponse>> getCountries() {


    @GET("countries/{country}")
    Call<CountriesResponse> getCountryInfo(

            @Path("country") String country);


    @GET("all")
    Call<AllCountriesResponse> getAllCountries();
}
