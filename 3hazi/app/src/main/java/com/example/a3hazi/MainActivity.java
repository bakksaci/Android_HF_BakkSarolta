package com.example.a3hazi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private Button homeButton;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        homeButton = findViewById(R.id.homeButton);
        signUpButton = findViewById(R.id.signUpButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                Toast.makeText(MainActivity.this, "Bejelentkezés: E-mail: " + email + ", Jelszó: " + password, Toast.LENGTH_SHORT).show();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Home gombra kattintva", Toast.LENGTH_SHORT).show();
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Regisztráció gombra kattintva", Toast.LENGTH_SHORT).show();
            }
        });
    }
}