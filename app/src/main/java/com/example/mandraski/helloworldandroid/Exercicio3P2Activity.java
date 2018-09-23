package com.example.mandraski.helloworldandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Exercicio3P2Activity extends AppCompatActivity {

    /**
     * Variaveis:
     */
    private ArrayList<String> nomes = new ArrayList<String>();
    private ArrayList<String> telefones = new ArrayList<String>();
    private TextView tvNome, tvTelefone;
    private Button btMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3_p2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // link das variaveis com os componentes do xml:
        tvNome = (TextView) findViewById(R.id.etPratica2Exe3Nome);
        tvTelefone = (TextView) findViewById(R.id.etPratica2Exe3Telefone);
        btMostrar = (Button) findViewById(R.id.btExercicio3Pratica2);

        btMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome  = tvNome.getText().toString();
                String telefone = tvTelefone.getText().toString();
                Intent i = new Intent(Exercicio3P2Activity.this, Exercicio3P2Tela2Activity.class);
                nomes.add(nome);
                telefones.add(telefone);
                i.putExtra("nomes", nomes);
                i.putExtra("telefones", telefones);
                startActivity(i);
            }
        });

    }

}
