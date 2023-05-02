package com.example.slagalica.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.example.slagalica.MainActivity;
import com.example.slagalica.R;
import com.example.slagalica.databinding.ActivityMainBinding;
import com.example.slagalica.databinding.ActivitySinglePlayerBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SinglePlayerActivity extends AppCompatActivity {

    private ActivitySinglePlayerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        MenuItem itemHome = bottomNavigationView.getMenu().findItem(R.id.home);
        itemHome.setOnMenuItemClickListener((view -> {
            Intent intent = new Intent(SinglePlayerActivity.this, MainWindowActivity.class);
            startActivity(intent);
            return true;
        }));

        MenuItem itemLogin = bottomNavigationView.getMenu().findItem(R.id.login);
        itemLogin.setOnMenuItemClickListener((view -> {
            Intent intent = new Intent(SinglePlayerActivity.this, LoginActivity.class);
            startActivity(intent);
            return true;
        }));

        MenuItem itemLogout = bottomNavigationView.getMenu().findItem(R.id.logout);
        itemLogout.setOnMenuItemClickListener((view -> {
            Intent intent = new Intent(SinglePlayerActivity.this, MainActivity.class);
            startActivity(intent);
            return true;
        }));

        MenuItem itemProfile = bottomNavigationView.getMenu().findItem(R.id.profil);
        itemProfile.setOnMenuItemClickListener((view -> {
            Intent intent = new Intent(SinglePlayerActivity.this, Profil.class);
            startActivity(intent);
            return true;
        }));

        MenuItem itemRegister = bottomNavigationView.getMenu().findItem(R.id.register);
        itemRegister.setOnMenuItemClickListener((view -> {
            Intent intent = new Intent(SinglePlayerActivity.this, RegisterActivity.class);
            startActivity(intent);
            return true;
        }));

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