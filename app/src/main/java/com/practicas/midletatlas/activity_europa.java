package com.practicas.midletatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

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
        CheckBox btnEspana = findViewById(R.id.checkButtonCan);
        CheckBox btnSuiza = findViewById(R.id.checkButtonMej);
        CheckBox btnHolanda = findViewById(R.id.checkButtonArg);

        Intent intent = new Intent(this, activity_paises_europa.class);
        intent.putExtra("pais1", btnEspana.isChecked());
        intent.putExtra("pais2", btnSuiza.isChecked());
        intent.putExtra("pais3", btnHolanda.isChecked());
        startActivity(intent);

    }


}