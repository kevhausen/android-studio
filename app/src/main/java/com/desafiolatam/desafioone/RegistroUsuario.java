package com.desafiolatam.desafioone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class RegistroUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        ImageView imagenRegistro = findViewById(R.id.imagenregistro);
        Picasso.get()
                .load("https://vignette.wikia.nocookie.net/es.pokemon/images/1/11/Ekans.png/revision/latest/scale-to-width-down/350?cb=20170617012619")
                .resize(500, 500)
                .into(imagenRegistro);


    }
}
