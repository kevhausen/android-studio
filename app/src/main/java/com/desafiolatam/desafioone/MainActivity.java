package com.desafiolatam.desafioone;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView caterpie = findViewById(R.id.caterpie);


        Picasso.get().load("https://blog.desafiolatam.com/wp-content/uploads/2019/02/logo.png").into(caterpie);

        //Picasso.get().load("https://tecmoviles.com/wp-content/uploads/2016/09/evolucion-de-caterpie-todos-los-trucos-oruga-600x606.png").into(caterpie);
        //Picasso.get().load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/011.png".into(asd); metapod

        Button ingresar = findViewById(R.id.botoninicio);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,getString(R.string.toast),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
