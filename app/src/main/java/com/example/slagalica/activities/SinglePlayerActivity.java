package com.example.slagalica.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.slagalica.R;

public class SinglePlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

        Button buttonKoZnaZnaActivity = findViewById(
                R.id.button_koznazna_singleplayer
        );
        buttonKoZnaZnaActivity.setOnClickListener(view -> {
            Intent secondActivityIntent = new Intent(
                    getApplicationContext(), KoZnaZna.class
            );
            startActivity(secondActivityIntent);
        });

        Button buttonMojBrojActivity = findViewById(
                R.id.button_mojbroj_singleplayer
        );
        buttonMojBrojActivity.setOnClickListener(view -> {
            Intent secondActivityIntent = new Intent(
                    getApplicationContext(), MojBrojActivity.class
            );
            startActivity(secondActivityIntent);
        });

        Button buttonSpojniceActivity = findViewById(
                R.id.button_spojnice_singleplayer
        );
        buttonSpojniceActivity.setOnClickListener(view -> {
            Intent secondActivityIntent = new Intent(
                    getApplicationContext(), SpojniceSinglePlayerActivity.class
            );
            startActivity(secondActivityIntent);
        });

        Button buttonSkockoActivity = findViewById(
                R.id.button_skocko_singleplayer
        );
        buttonSkockoActivity.setOnClickListener(view -> {
            Intent secondActivityIntent = new Intent(
                    getApplicationContext(), SkockoSinglePlayerActivity.class
            );
            startActivity(secondActivityIntent);
        });

        Button buttonKorakPoKorak = findViewById(
                R.id.button_korakpokorak_singleplayer
        );
        buttonKorakPoKorak.setOnClickListener(view -> {
            Intent secondActivityIntent = new Intent(
                    getApplicationContext(), KorakPoKorak.class
            );
            startActivity(secondActivityIntent);
        });

        Button buttonAsocijacije = findViewById(
                R.id.button_asocijacije_singleplayer
        );
        buttonAsocijacije.setOnClickListener(view -> {
            Intent secondActivityIntent = new Intent(
                    getApplicationContext(), AsocijacijeSinglePlayerActivity.class
            );
            startActivity(secondActivityIntent);
        });
    }
}