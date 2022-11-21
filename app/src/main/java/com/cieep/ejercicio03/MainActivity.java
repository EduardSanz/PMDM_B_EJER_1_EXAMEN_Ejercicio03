package com.cieep.ejercicio03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cieep.ejercicio03.adapters.PersonajesAdapter;
import com.cieep.ejercicio03.modelos.Personaje;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Personaje> personajes;
    private RecyclerView recycler;
    private PersonajesAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personajes = new ArrayList<>();
        crearPersonajes();

        recycler = findViewById(R.id.contenedor);
        adapter = new PersonajesAdapter(personajes, R.layout.personajes_view_holder, this);
        layoutManager = new GridLayoutManager(this, 2);

        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }

    private void crearPersonajes() {
        personajes.add(new Personaje(R.string.Arya, R.drawable.arya_stark_desc, R.string.Arya_Desc));
        personajes.add(new Personaje(R.string.Cersei, R.drawable.cersei_lannister_desc, R.string.Cersei_desc));
        personajes.add(new Personaje(R.string.Daenerys, R.drawable.daenerys_targaryen_desc, R.string.Daenerys_desc));
        personajes.add(new Personaje(R.string.Jon, R.drawable.jonh_nieve_desc, R.string.Jon_desc));
        personajes.add(new Personaje(R.string.Samwell, R.drawable.samwell_tarly_desc, R.string.Samwell_desc));
        personajes.add(new Personaje(R.string.Sansa, R.drawable.sansa_stark_desc, R.string.Sansa_desc));
    }
}