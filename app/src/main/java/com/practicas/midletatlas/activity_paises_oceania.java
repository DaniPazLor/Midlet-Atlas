package com.practicas.midletatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

public class activity_paises_oceania extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises_oceania);

        Bundle datos = getIntent().getExtras();
        TableRow tr1 = findViewById(R.id.tableRowP1);
        TableRow tr2 = findViewById(R.id.tableRowP2);
        TableRow tr3 = findViewById(R.id.tableRowP3);

        if (datos.getBoolean("pais1")){
            tr1.setVisibility(View.VISIBLE);
        }
        if (datos.getBoolean("pais2")){
            tr2.setVisibility(View.VISIBLE);
        }
        if (datos.getBoolean("pais3")){
            tr3.setVisibility(View.VISIBLE);
        }
    }

    public void finalizarActivity(View view) {
        finish();
    }

}