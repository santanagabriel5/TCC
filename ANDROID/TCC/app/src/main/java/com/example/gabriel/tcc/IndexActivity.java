package com.example.gabriel.tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static com.example.gabriel.tcc.R.id.cidade_spinner;

public class IndexActivity extends AppCompatActivity {

    public static String  especialidade;
    public static String  convenio;
    public static String  cidade;

    public static List<String> arrayespecialidades =  new ArrayList<String>();
    public static List<String> arraycidade =  new ArrayList<String>();
    public static List<String> arrayconvenio =  new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        //chamando o preenchedor de spinners
        preenchedordespinners process = new preenchedordespinners();
        process.execute();

        //populando array de especialidades
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayespecialidades);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.especialidade_spinner);
        sItems.setAdapter(adapter);

        //populando array de convenios
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayconvenio);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sItems = (Spinner) findViewById(R.id.convenio_spinner);
        sItems.setAdapter(adapter);

        //populando array de estados
        List<String> Arrayestados =  new ArrayList<String>();
        Arrayestados.add("AC"); Arrayestados.add("AL");Arrayestados.add("AM");Arrayestados.add("AP");
        Arrayestados.add("BA");Arrayestados.add("CE");Arrayestados.add("ES");Arrayestados.add("GO");
        Arrayestados.add("MA");Arrayestados.add("MG");Arrayestados.add("MS");Arrayestados.add("MT");
        Arrayestados.add("PA");Arrayestados.add("PB");Arrayestados.add("PE");Arrayestados.add("PI");
        Arrayestados.add("PR");Arrayestados.add("RJ");Arrayestados.add("RN"); Arrayestados.add("RR");
        Arrayestados.add("RS");Arrayestados.add("SC");Arrayestados.add("SE");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Arrayestados);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sItems = (Spinner) findViewById(R.id.estado_spinner);
        sItems.setAdapter(adapter);

//        //PREENCHIMENTO DOS SPINNERS DE ESPECIALIDADE
//        List<String> Array =  new ArrayList<String>();
//        Array.add("Especialidade");
//        Array.add("Cardiologista");
//        Array.add("Ortopedista");
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this, android.R.layout.simple_spinner_item, Array);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        Spinner sItems = (Spinner) findViewById(R.id.especialidade_spinner);
//        sItems.setAdapter(adapter);
//
//        //PREENCHIMENTO DOS SPINNERS DE CIDADE
//        Array = new ArrayList<String>();
//        Array.add("Cidade");
//        Array.add("Tres Lagoas");
//        Array.add("Pereira Barreto");
//
//        adapter = new ArrayAdapter<String>(
//                this, android.R.layout.simple_spinner_item, Array);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        sItems = (Spinner) findViewById(R.id.cidade_spinner);
//        sItems.setAdapter(adapter);
//
//        //PREENCHIMENTO DOS SPINNERS DE Estado
//        Array = new ArrayList<String>();
//        Array.add("Estado");
//        Array.add("MS");
//        Array.add("SP");
//
//        adapter = new ArrayAdapter<String>(
//                this, android.R.layout.simple_spinner_item, Array);
//
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        Spinner sItems2 = (Spinner) findViewById(R.id.estado_spinner);
//        sItems2.setAdapter(adapter);


        Button pesquisar = (Button) findViewById(R.id.pesquisar_button);
        pesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IndexActivity.this, ResultadoActivity.class);
                startActivity(intent);
            }
        });
    }
}
