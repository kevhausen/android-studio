package com.desafiolatam.desafioone;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView caterpie = findViewById(R.id.caterpie);





        //Picasso.get().load("https://blog.desafiolatam.com/wp-content/uploads/2019/02/logo.png").into(caterpie);

        Picasso.get().load("https://tecmoviles.com/wp-content/uploads/2016/09/evolucion-de-caterpie-todos-los-trucos-oruga-600x606.png").into(caterpie);
        //Picasso.get().load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/011.png".into(asd); metapod

        Button ingresar = findViewById(R.id.botoninicio);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText usuario = findViewById(R.id.usuario);
                EditText password = findViewById(R.id.password);
                String suser = usuario.getText().toString();
                String spass = password.getText().toString();

                if(suser.isEmpty() && spass.isEmpty() ){
                    Toast.makeText(MainActivity.this,getString(R.string.mainvacio),Toast.LENGTH_SHORT).show();
                }else if(suser.isEmpty() && !spass.isEmpty()){
                    Toast.makeText(MainActivity.this,getString(R.string.uservacia),Toast.LENGTH_SHORT).show();
                }else if(spass.isEmpty() && !suser.isEmpty()){
                    Toast.makeText(MainActivity.this,getString(R.string.passvacia),Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, getString(R.string.toast), Toast.LENGTH_SHORT).show();
                    Intent irhome = new Intent(MainActivity.this, Home.class);
                    startActivity(irhome);
                }

            }
        });
        Button registar = findViewById(R.id.registrar);
        registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistroUsuario.class);
                startActivity(intent);
            }
        });
    }
}
