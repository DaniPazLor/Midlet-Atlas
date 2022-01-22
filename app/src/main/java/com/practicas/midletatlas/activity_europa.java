package com.practicas.midletatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class activity_europa extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europa);
    }

    public void finalizarActivity(View view) {
        finish();
    }

    public void mostrarPaises(View view) {
        RadioButton btnEspana = findViewById(R.id.radioButtonEsp);
        if (btnEspana.isChecked()){

        }

        Intent intent = new Intent(activity_europa.this, activity_paises_europa.class);
        startActivity(intent);

    }


}