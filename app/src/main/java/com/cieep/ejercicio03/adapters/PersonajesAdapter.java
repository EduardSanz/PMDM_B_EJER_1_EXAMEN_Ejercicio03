package com.cieep.ejercicio03.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cieep.ejercicio03.R;
import com.cieep.ejercicio03.VerPersonajeActivity;
import com.cieep.ejercicio03.modelos.Personaje;

import java.util.List;

public class PersonajesAdapter extends RecyclerView.Adapter<PersonajesAdapter.PersonajeVH> {

    private List<Personaje> objects;
    private int resource;
    private Context context;

    public PersonajesAdapter(List<Personaje> objects, int resource, Context context) {
        this.objects = objects;
        this.resource = resource;
        this.context = context;
    }

    @NonNull
    @Override
    public PersonajeVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(context).inflate(resource, null);
        cardView.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return new PersonajeVH(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajeVH holder, int position) {
        Personaje p = objects.get(position);
        holder.imgPersonaje.setImageResource(p.getImagen());
        holder.lblNombre.setText(p.getNombre());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("PER", p);
                Intent intent = new Intent(context, VerPersonajeActivity.class);
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }


    public class PersonajeVH extends RecyclerView.ViewHolder {
        TextView lblNombre;
        ImageView imgPersonaje;
        public PersonajeVH(@NonNull View itemView) {
            super(itemView);
            lblNombre = itemView.findViewById(R.id.lblPersonajeCard);
            imgPersonaje = itemView.findViewById(R.id.imgPersonajeCard);
        }
    }
}
