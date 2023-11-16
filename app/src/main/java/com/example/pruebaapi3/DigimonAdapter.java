package com.example.pruebaapi3;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;
public class DigimonAdapter extends RecyclerView.Adapter<DigimonViewHolder> {
    private List<Digimon> digimons;

    public DigimonAdapter(List<Digimon> digimons) {
        this.digimons = digimons;
    }
    @NonNull
    @Override
    public DigimonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_digimon, parent, false);
        return new DigimonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DigimonViewHolder holder, int position) {
        Digimon digimon = digimons.get(position);
        holder.textViewName.setText(digimon.getName());
        holder.textViewLevel.setText(digimon.getLevel());

        // Usando Picasso para cargar imágenes desde una URL
        Picasso.get().load(digimon.getImg()).into(holder.imageViewDigimon);
    }

    @Override
    public int getItemCount() {
        return digimons.size();
    }


}
