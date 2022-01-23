package com.practicas.midletatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class activity_africa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa);
    }


    public void finalizarActivity(View view) {
        finish();
    }

    public void mostrarPaises(View view) {
        CheckBox btnEspana = findViewById(R.id.checkButtonKen);
        CheckBox btnSuiza = findViewById(R.id.checkButtonSud);
        CheckBox btnHolanda = findViewById(R.id.checkButtonAng);

        Intent intent = new Intent(this, activity_paises_africa.class);
        intent.putExtra("pais1", btnEspana.isChecked());
        intent.putExtra("pais2", btnSuiza.isChecked());
        intent.putExtra("pais3", btnHolanda.isChecked());
        startActivity(intent);

    }
}