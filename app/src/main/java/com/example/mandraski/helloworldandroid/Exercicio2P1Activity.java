package com.example.mandraski.helloworldandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exercicio2P1Activity extends AppCompatActivity {

    /**
     * Variaveis:
     */
    private EditText etNome, etEndereco, etTelefone;
    private Button btImprimir;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2_p1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /**
         * Ligacao das variaveis com os componentes do xml:
         */
        etNome = (EditText) findViewById(R.id.etPratica1Exe2Nome);
        etEndereco = (EditText) findViewById(R.id.etPratica1Exe2Endereco);
        etTelefone = (EditText) findViewById(R.id.etPratica1Exe2Telefone);
        btImprimir = (Button) findViewById(R.id.btPratica1Exe2Imprimir);
        tvResult = (TextView) findViewById(R.id.tvPratica1Exe2Result);

        /**
         * Ao clicar no botao, o TextView recebe o conteudo dos inputs:
         */
        btImprimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("Nome: " + etNome.getText() + "\n" + "Endereco: " + etEndereco.getText() + "\n" + "Telefone: " + etTelefone.getText());
            }
        });

    }

}
