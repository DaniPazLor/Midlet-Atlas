package com.practicas.midletatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class activity_asia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);
    }

    public void finalizarActivity(View view) {
        finish();
    }

    public void mostrarPaises(View view) {
        CheckBox btnIndia = findViewById(R.id.checkButtonInd);
        CheckBox btnMongolia = findViewById(R.id.checkButtonMon);
        CheckBox btnTailandia = findViewById(R.id.checkButtonTai);

        Intent intent = new Intent(this, activity_paises_asia.class);
        intent.putExtra("pais1", btnIndia.isChecked());
        intent.putExtra("pais2", btnMongolia.isChecked());
        intent.putExtra("pais3", btnTailandia.isChecked());
        startActivity(intent);

    }
}