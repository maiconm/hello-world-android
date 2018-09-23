package com.example.mandraski.helloworldandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio2P2 extends AppCompatActivity {

    /**
     * Variaveis:
     */
    private EditText etNome, etRu, etCurso;
    private Button btEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2_p2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * Ligacao das variaveis com os componentes do xml:
         */
        etNome = (EditText) findViewById(R.id.etPratica2Exe2Nome);
        etRu = (EditText) findViewById(R.id.etPratica2Exe2Ru);
        etCurso = (EditText) findViewById(R.id.etPratica2Exe2Curso);
        btEnviar = (Button) findViewById(R.id.btPratica2Exe2Enviar);

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Exercicio2P2.this, Exercicio2P2Tela2Activity.class);
                // pega o valor das variaveis e coloca junto ao intent:
                i.putExtra("nome", etNome.getText().toString());
                i.putExtra("ru", etRu.getText().toString());
                i.putExtra("curso", etCurso.getText().toString());
                // chama a nova tela:
                startActivity(i);
            }
        });

    }

}
