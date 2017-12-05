package com.example.gabriel.tcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Gabriel on 10/28/2017.
 */

public class DadosActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        TextView Texto = (TextView)findViewById(R.id.texto);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");

        Texto.setText(message);


    }
}
