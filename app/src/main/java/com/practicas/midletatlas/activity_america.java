package com.practicas.midletatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class activity_america extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_america);
    }

    public void finalizarActivity(View view) {
        finish();
    }

    public void mostrarPaises(View view) {
        CheckBox btnCanada = findViewById(R.id.checkButtonCan);
        CheckBox btnMejico = findViewById(R.id.checkButtonMej);
        CheckBox btnArgentina = findViewById(R.id.checkButtonArg);

        Intent intent = new Intent(this, activity_paises_america.class);
        intent.putExtra("pais1", btnCanada.isChecked());
        intent.putExtra("pais2", btnMejico.isChecked());
        intent.putExtra("pais3", btnArgentina.isChecked());
        startActivity(intent);

    }
}