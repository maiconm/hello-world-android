package com.example.mandraski.helloworldandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio1Activity extends AppCompatActivity {

    /**
     * Variaveis:
     */
    private EditText etTextoA, etTextoB;
    private Button btInverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * Ligando variaveis com componentes do xml:
         */
        etTextoA = (EditText) findViewById(R.id.etTextoA);
        etTextoB = (EditText) findViewById(R.id.etTextoB);
        btInverter = (Button) findViewById(R.id.btInverter);

        /**
         * Ao clicar em inverter, os textos dos inputs trocam de lugar:
         */
        btInverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aux = etTextoA.getText().toString();
                etTextoA.setText(etTextoB.getText());
                etTextoB.setText(aux);
            }
        });
    }

}
