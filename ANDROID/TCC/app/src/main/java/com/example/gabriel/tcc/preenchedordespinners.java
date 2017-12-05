package com.example.gabriel.tcc;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabriel on 11/7/2017.
 */

public class preenchedordespinners extends AsyncTask<Void,Void,Void> {
    String data = "";
    @Override
    protected Void doInBackground(Void... voids) {

        try {
            //pegando especialidades
            URL url = new URL("http://10.0.3.2:8080/rest/especialidade");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";

            while (line != null){
                line=bufferedReader.readLine();
                data = data + line;
            }
            IndexActivity.especialidade  = this.data;

            //pegando convenios
            url = new URL("http://10.0.3.2:8080/rest/convenio");
            httpURLConnection = (HttpURLConnection) url.openConnection();
            inputStream = httpURLConnection.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            line = "";
            data="";
            while (line != null){
                line=bufferedReader.readLine();
                data = data + line;
            }
            IndexActivity.convenio  = this.data;

            //pegando cidades
            url = new URL("http://10.0.3.2:8080/rest/cidades");
            httpURLConnection = (HttpURLConnection) url.openConnection();
            inputStream = httpURLConnection.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            line = "";
            data="";
            while (line != null){
                line=bufferedReader.readLine();
                data = data + line;
            }
            IndexActivity.cidade  = this.data;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
      //  IndexActivity.dataespecialidades.setText(data);
        //IndexActivity.especialidade  = this.data;
        JSONArray jsonarray = null;
        try {
            jsonarray = new JSONArray(IndexActivity.especialidade);
            IndexActivity.arrayespecialidades.add("Especialidade");
            for (int i = 0; i < jsonarray.length(); i++) {
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                String name = jsonobject.getString("nome");
                Log.d("NOME : ",name);
                IndexActivity.arrayespecialidades.add(jsonobject.getString("nome"));
            }

            jsonarray = new JSONArray(IndexActivity.convenio);
            IndexActivity.arrayconvenio.add("Convenio");
            for (int i = 0; i < jsonarray.length(); i++) {
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                String name = jsonobject.getString("nome");
                Log.d("NOME : ",name);
                IndexActivity.arrayconvenio.add(jsonobject.getString("nome"));
            }



        } catch (JSONException e) {
            e.printStackTrace();
        }



    }
}
