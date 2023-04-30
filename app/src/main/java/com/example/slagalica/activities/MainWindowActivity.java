package com.example.slagalica.activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.slagalica.MainActivity;
import com.example.slagalica.fragments.FirstFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.slagalica.databinding.ActivityMainWindowBinding;

import com.example.slagalica.R;

public class MainWindowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_window);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        MenuItem itemHome = bottomNavigationView.getMenu().findItem(R.id.home);
        itemHome.setOnMenuItemClickListener((view -> {
            Intent intent = new Intent(MainWindowActivity.this, MainActivity.class);
            startActivity(intent);
            return true;
        }));

        MenuItem itemLogin = bottomNavigationView.getMenu().findItem(R.id.login);
        itemLogin.setOnMenuItemClickListener((view -> {
            Intent intent = new Intent(MainWindowActivity.this, LoginActivity.class);
            startActivity(intent);
            return true;
        }));

        MenuItem itemLogout = bottomNavigationView.getMenu().findItem(R.id.logout);
        itemLogout.setOnMenuItemClickListener((view -> {
            Intent intent = new Intent(MainWindowActivity.this, MainWindowActivity.class);
            startActivity(intent);
            return true;
        }));

        MenuItem itemProfile = bottomNavigationView.getMenu().findItem(R.id.profil);
        itemProfile.setOnMenuItemClickListener((view -> {
            Intent intent = new Intent(MainWindowActivity.this, Profil.class);
            startActivity(intent);
            return true;
        }));

        MenuItem itemRegister = bottomNavigationView.getMenu().findItem(R.id.register);
        itemRegister.setOnMenuItemClickListener((view -> {
            Intent intent = new Intent(MainWindowActivity.this, RegisterActivity.class);
            startActivity(intent);
            return true;
        }));

        Button button_cancel = (Button) findViewById(R.id.button_singleplayer);
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_cancel.setOnClickListener(view -> {
                    Intent secondActivityIntent = new Intent(
                            getApplicationContext(), SinglePlayerActivity.class
                    );
                    startActivity(secondActivityIntent);
                });
            }
        });

    }



}