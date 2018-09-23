package com.example.mandraski.helloworldandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Pratica2Activity extends AppCompatActivity {

    /**
     * Variaveis:
     */
    private Button btExercicio1, btExercicio2, btExercicio3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratica2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * Ligacao das variaveis com os botoes do xml:
         */
        btExercicio1 = (Button) findViewById(R.id.btExercicio1Pratica2);
        btExercicio2 = (Button) findViewById(R.id.btExercicio2Pratica2);
        btExercicio3 = (Button) findViewById(R.id.btExercicio3Pratica2);

    }

}
