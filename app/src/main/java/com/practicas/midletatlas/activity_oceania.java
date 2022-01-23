package com.practicas.midletatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class activity_oceania extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceania);
    }

    public void finalizarActivity(View view) {
        finish();
    }

    public void mostrarPaises(View view) {
        CheckBox btnZelanda = findViewById(R.id.checkButtonZel);
        CheckBox btnAustralia = findViewById(R.id.checkButtonAus);
        CheckBox btnFilipinas = findViewById(R.id.checkButtonFil);

        Intent intent = new Intent(this, activity_paises_oceania.class);
        intent.putExtra("pais1", btnZelanda.isChecked());
        intent.putExtra("pais2", btnAustralia.isChecked());
        intent.putExtra("pais3", btnFilipinas.isChecked());
        startActivity(intent);

    }
}