package com.example.mandraski.helloworldandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Pratica1Activity extends AppCompatActivity {

    /**
     * Variaveis:
     */
    private Button btExercicio1, btExercicio2, btExercicio3, btExercicio4, btExercicio5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratica1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * Ligacao das variaveis com os botoes do xml:
         */
        btExercicio1 = (Button) findViewById(R.id.btExercicio1);
        btExercicio2 = (Button) findViewById(R.id.btExercicio2);
        btExercicio3 = (Button) findViewById(R.id.btExercicio3);
        btExercicio4 = (Button) findViewById(R.id.btExercicio4);
        btExercicio5 = (Button) findViewById(R.id.btExercicio5);

        /**
         * Botao exercicio 1 chama `Exercicio1Activity`:
         */
        btExercicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pratica1Activity.this, Exercicio1Activity.class);
                startActivity(intent);
            }
        });

        /**
         * Botao exercicio 2 chama `Exercicio2P1Activity`:
         */
        btExercicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pratica1Activity.this, Exercicio2P1Activity.class);
                startActivity(intent);
            }
        });

        /**
         * Botao exercicio 3 chama `Exercicio3P1Activity`:
         */
        btExercicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pratica1Activity.this, Exercicio3P1Activity.class);
                startActivity(intent);
            }
        });

        /**
         * Botao exercicio 4 chama `Exercicio4P1Activity`:
         */
        btExercicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pratica1Activity.this, Exercicio4P1Activity.class);
                startActivity(intent);
            }
        });

        /**
         * Botao exercicio 5 chama `Exercicio5P1Activity`:
         */
        btExercicio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pratica1Activity.this, Exercicio5P1Activity.class);
                startActivity(intent);
            }
        });
    }

}
