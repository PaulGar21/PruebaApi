package com.example.pruebaapi3;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class Retrofit {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://digimon-api.vercel.app/api/";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
