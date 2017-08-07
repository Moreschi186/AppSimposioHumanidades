package com.ifsc.mathe.appsimposiohumanidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Programacao extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programacao);
        setContentView(R.layout.activity_palestrantes);
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Programação 28/08");
    }

    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home://ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, MainActivity.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity();//Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }
        return true;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        // Adding child data
        listDataHeader.add("18:30 - 19:30");
        listDataHeader.add("19:30 - 22:30");
        // Adding child data
        List<String> horario1 = new ArrayList<String>();
        horario1.add("Solenidade de Abertura");
        List<String> horario2 = new ArrayList<String>();
        horario2.add("Evento: Mesa de debate - ABERTURA\nTema: Educação no Brasil, desafios para a formação de sujeitos críticos.\nPalestrante: Profa.  Dra. Olinda Evangelista (UFSC)\nPalestrante: Profa. Dra. Mônica Ribeiro da Silva (UFPR)\nCoordenador: Prof. Dr. Joel José de Souza(IFSC)\n");
        listDataChild.put(listDataHeader.get(0), horario1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), horario2);
    }
}
