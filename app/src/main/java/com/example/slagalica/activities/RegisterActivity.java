package com.example.slagalica.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.slagalica.MainActivity;
import com.example.slagalica.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button button = (Button) findViewById(R.id.button_register2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setOnClickListener(view -> {
                    Intent secondActivityIntent = new Intent(
                            getApplicationContext(), MainWindowActivity.class
                    );
                    startActivity(secondActivityIntent);
                });
            }
        });

        Button button_cancel = (Button) findViewById(R.id.button_cancel3);
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_cancel.setOnClickListener(view -> {
                    Intent secondActivityIntent = new Intent(
                            getApplicationContext(), MainActivity.class
                    );
                    startActivity(secondActivityIntent);
                });
            }
        });
    }
}