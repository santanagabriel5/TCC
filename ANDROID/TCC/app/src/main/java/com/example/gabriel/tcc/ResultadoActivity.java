package com.example.gabriel.tcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabriel on 10/28/2017.
 */

public class ResultadoActivity extends AppCompatActivity {

    ListView listaMedicos;
    //Funçoes são carregadas ao iniciar a tela
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        carregaTimes();

        listaMedicos = (ListView) findViewById(R.id.lista_medicos);
        registerForContextMenu(listaMedicos);


        listaMedicos.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> lista, View item, int position, long id) {
                String nome;
                nome = (String) listaMedicos.getItemAtPosition(position);
                Intent it = new Intent(ResultadoActivity.this, DadosActivity.class);
                it.putExtra("message", nome);
                startActivity(it);
            }

        });
    }

    public void carregaTimes() {

        List<String> Array =  new ArrayList<String>();
        Array.add("Rodolfo");
        Array.add("Mateus");
        Array.add("Gabriel");
        listaMedicos = (ListView) findViewById(R.id.lista_medicos);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, Array);

        listaMedicos.setAdapter(adapter);
    }
}
