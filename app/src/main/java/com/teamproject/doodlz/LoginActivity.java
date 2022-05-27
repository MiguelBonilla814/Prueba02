package com.teamproject.doodlz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText edit_text_nombre;
    private EditText edit_text_contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edit_text_nombre = findViewById(R.id.editText_nombre);
        edit_text_contraseña = findViewById(R.id.editText_password);

    }

    public void InciarSesion(View view){
        String nombreEditText, passwordEditText;

        nombreEditText = edit_text_nombre.getText().toString();
        passwordEditText = edit_text_contraseña.getText().toString();

        if(nombreEditText.equals("miguel") && passwordEditText.equals("miguel")){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Bienvenido, Miguel!" , Toast.LENGTH_SHORT).show();
        }

        if(nombreEditText.equals("enrique") && passwordEditText.equals("enrique")){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Bienvenido, Enrique!" , Toast.LENGTH_SHORT).show();
        }
    }


}