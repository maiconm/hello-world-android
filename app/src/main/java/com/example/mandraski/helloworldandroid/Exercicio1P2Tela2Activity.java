package com.example.mandraski.helloworldandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Exercicio1P2Tela2Activity extends AppCompatActivity {

    /**
     * Variaveis:
     */
    private TextView tvRecebe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1_p2_tela2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // link do componente com a variavel:
        tvRecebe = (TextView) findViewById(R.id.tvRecebeEx1P2);
        // pega conteudo do intent da outra tela, e seta na variavel
        // ligada ao componente:
        Intent i = getIntent();
        String dados = i.getStringExtra("tvTela1");
        tvRecebe.setText(dados);
    }

}
