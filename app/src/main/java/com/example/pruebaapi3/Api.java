package com.example.pruebaapi3;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api<Digimon> {
    @GET("digimon")
    Call<List<Digimon>> getDigimons();
}
