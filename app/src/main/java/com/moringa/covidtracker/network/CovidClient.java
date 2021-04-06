package com.moringa.covidtracker.network;

import com.moringa.covidtracker.Constants;

public class CovidClient {
    private static Retrofit retrofit = null;

    private static final String BASE_URL = Constants.COVID_BASE_URL;

    public static CovidApi getClient() {
        if (retrofit == null){
//            OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                    .addInterceptor(new Interceptor() {
//                        @Override
//                        public Response intercept(Chain chain) throws IOException {
//                            Request newRequest = chain.request().newBuilder()
//                                    .build();
//                            return chain.proceed(newRequest);
//                        }
//                    })
//                    .build();
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL )
//

//                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(CovidApi.class);
    }
}
