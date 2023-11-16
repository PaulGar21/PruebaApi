package com.example.pruebaapi3;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class DigimonViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageViewDigimon;
    public TextView textViewName;
    public TextView textViewLevel;

    public DigimonViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewDigimon = itemView.findViewById(R.id.img1);
        textViewName = itemView.findViewById(R.id.textView1);
        textViewLevel = itemView.findViewById(R.id.textView2);
    }


}
