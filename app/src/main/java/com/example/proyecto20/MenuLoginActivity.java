package com.example.proyecto20;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuLoginActivity extends AppCompatActivity {

    private Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menulogin);

        // Inicializar vistas
        loginButton = findViewById(R.id.button);
        registerButton = findViewById(R.id.registerButton);

        // Configurar botón de login
        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuLoginActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        // Configurar botón de registro
        registerButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuLoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}
