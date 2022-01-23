package com.practicas.midletatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

public class activity_paises_europa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises_europa);

        Bundle datos = getIntent().getExtras();
        TableRow tr1 = findViewById(R.id.tableRowP1);

        if (datos.getBoolean("pais1")){
            tr1.setVisibility(View.VISIBLE);
        }

    }
}