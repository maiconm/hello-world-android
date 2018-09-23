package com.example.mandraski.helloworldandroid;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Exercicio3P2Tela2Activity extends AppCompatActivity {

    /**
     * Variaveis:
     */
    private ListView listView;
    private ListView listNumeros;
    private ArrayList<String> lista = new ArrayList<String>();
    private ArrayList<String> valoresIndexLista = new ArrayList<String>();
    private String contatoSelecionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3_p2_tela2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent i = getIntent();

        // recebe os nomes:
        lista = i.getStringArrayListExtra("telefones");

        // recebe os telefones:
        valoresIndexLista = i.getStringArrayListExtra("telefones");

        // link das variaveis com os componentes do xml:
        listView = (ListView) findViewById(R.id.lvPratica2Exe3);

        // Adiciona os nomes na ListView:
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);

        listView.setAdapter(ad);

        // Adiciona os telefones em uma ListView separada:
//        ArrayAdapter<String> adNumeros = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, valoresIndexLista);

//        listNumeros.setAdapter(adNumeros);

        // pega posicao do contato selecionado:
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                contatoSelecionado = listNumeros.getItemAtPosition(position).toString();
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:" + contatoSelecionado));
                if (ActivityCompat.checkSelfPermission(Exercicio3P2Tela2Activity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(i);
            }
        });

    }

}
