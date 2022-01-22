package com.practicas.midletatlas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMostrarContinentes (View view){
        Intent intent;

        switch (view.getId()){

            case R.id.btnEuropa:
                intent = new Intent(this,activity_europa.class);
                startActivity(intent);
                break;
            case R.id.btnAfrica:
                intent = new Intent(this,activity_europa.class);
                startActivity(intent);
                break;
            case R.id.btnAsia:
                intent = new Intent(this,activity_europa.class);
                startActivity(intent);
                break;
            case R.id.btnAmerica:
                intent = new Intent(this,activity_europa.class);
                startActivity(intent);
                break;
            case R.id.btnOceania:
                intent = new Intent(this,activity_europa.class);
                startActivity(intent);
                break;
        }


    }



}