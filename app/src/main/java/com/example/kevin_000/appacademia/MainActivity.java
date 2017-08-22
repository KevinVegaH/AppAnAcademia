package com.example.kevin_000.appacademia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AcademiaSingleton acs = AcademiaSingleton.getInstance();
    EditText nombre;
    EditText id;
    ListView list;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    AcademiaFactoy acf = new AcademiaFactoy();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nom);
        id = (EditText) findViewById(R.id.textId);
        arrayList = new ArrayList<String>();
        list =(ListView) findViewById(R.id.lista);

        adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.custom,arrayList);
        list.setAdapter(adapter);

    }

    public void MosTextoEs(View v) {


        String tipo = "estudiante";

        String a = nombre.getText().toString();
        String b = id.getText().toString();

        String r = (tipo+"   |  "+a +"   |   "+ b);
        arrayList.add(r);
        adapter.notifyDataSetChanged();
        acs.obtener(r);
        acf.GetAcademia(tipo,a,b);

    }


  public void MosTextoPr(View v){


      String tipo = "profesor";

      String a = nombre.getText().toString();
      String b = id.getText().toString();

      String r = (tipo+"   |  "+a +"   |   "+ b);
      arrayList.add(r);
      adapter.notifyDataSetChanged();
      acs.obtener(r);
      acf.GetAcademia(tipo,a,b);




  }
    public void MosTextoAd(View v){

        String tipo = "Administrativo";


        String a = nombre.getText().toString();
        String b = id.getText().toString();

        String r = (tipo+"   |  "+a +"   |   "+ b);
        arrayList.add(r);
        adapter.notifyDataSetChanged();
        acs.obtener(r);
        acf.GetAcademia(tipo,a,b);



    }


}
