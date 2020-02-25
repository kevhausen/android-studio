package com.desafiolatam.desafioone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView home = findViewById(R.id.imagenhome);
        Picasso.get().load("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/2c4eef92-29d2-48de-ba26-89f8c539dd9d/dthbwn-c41f38d5-deee-4e46-af9b-d5c804f6dada.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzJjNGVlZjkyLTI5ZDItNDhkZS1iYTI2LTg5ZjhjNTM5ZGQ5ZFwvZHRoYnduLWM0MWYzOGQ1LWRlZWUtNGU0Ni1hZjliLWQ1YzgwNGY2ZGFkYS5wbmcifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6ZmlsZS5kb3dubG9hZCJdfQ.FXqYTAkiS0obPbmuPBTawpep6Dqc9kUEjkI-RG1fU8o").into(home);



    }
}
