package com.example.pruebaapi3;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import java.util.List;
public class DigimonApiManager {

        public interface DigimonCallback {
         void onSuccess(List<Digimon> digimons);
         void onFailure(String errorMessage);
        }

        public static void getDigimons(DigimonCallback callback) {
            DigimonApiService service = Retrofit.getRetrofitInstance().create(DigimonApiService.class);
            Call<List<Digimon>> call = service.getDigimons;

            call.enqueue(new Callback<List<Digimon>>() {
                @Override
                public void onResponse(Call<List<Digimon>> call, Response<List<Digimon>> response) {
                    if (response.isSuccessful()) {
                        callback.onSuccess(response.body());
                    } else {
                        callback.onFailure("Error en la respuesta de la API");
                    }
                }

                @Override
                public void onFailure(Call<List<Digimon>> call, Throwable t) {
                    callback.onFailure("Error en la solicitud: " + t.getMessage());
                }
            });
        }

}
