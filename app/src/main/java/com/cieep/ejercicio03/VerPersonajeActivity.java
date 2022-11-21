package com.cieep.ejercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.cieep.ejercicio03.modelos.Personaje;

public class VerPersonajeActivity extends AppCompatActivity {

    private TextView lblNombre, lblDesc;
    private ImageView imgDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_personaje);

        lblDesc = findViewById(R.id.lblDescDesc);
        lblNombre = findViewById(R.id.lblNombreDesc);
        imgDesc = findViewById(R.id.imgDesc);

        if (getIntent().getExtras() != null) {
            Personaje p = (Personaje) getIntent().getExtras().getSerializable("PER");
            imgDesc.setImageResource(p.getImagen());
            lblNombre.setText(p.getNombre());
            lblDesc.setText(p.getDescripcion());
        }
    }
}