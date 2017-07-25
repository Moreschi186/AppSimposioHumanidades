package com.example.mathe.appsimposiohumanidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Programacao29 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("Programação 29/08");
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
        listDataHeader.add("08:30 - 11:30");
        listDataHeader.add("11:30 - 13:30");
        listDataHeader.add("13:30 - 16:30");
        listDataHeader.add("19:00 - 22:00");
        // Adding child data
        List<String> horario1 = new ArrayList<String>();
        horario1.add("Evento: Palestra\nTema: Diversidade étnico racial, de gênero e orientação\nPalestrante: Nei d' Ogum(Militante GLBT");
        horario1.add("Evento: Palestra\nTema: Educação e desenvolvimento terrorial\nPalestrante: Prof. Esp. Mauro Antônio do Nascimento(IFSC)");
        horario1.add("Evento: Roda de Conversa\nTema: GRAFFITI\nMediador: Dharla Raupp Kamers(Artista - CURA)\nMediador: Rafael Ferreira da Silva(Artista - CURA)");
        horario1.add("Evento: Palestra\nTema: Os desafios da escola crítica e a inoperância da neutralidade\nPalestrante: Prof. Ms. Paulo Henrique Schlickmann");
        List<String> horario2 = new ArrayList<String>();
        horario2.add("Evento: Mesa de Abertura\nTema: Educação no Brasil, desafios para a formação de sujeitos críticos.\nPalestrante: Prof. Dr. José Clovis de Azevedo Olinda Evangelista (UFSC)\nCoordenador: Prof. Dr. Joel José de Souza(IFSC)\n");
        List<String> horario3 = new ArrayList<String>();
        List<String> horario4 = new ArrayList<String>();
        listDataChild.put(listDataHeader.get(0), horario1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), horario2);
        listDataChild.put(listDataHeader.get(2), horario3); // Header, Child data
        listDataChild.put(listDataHeader.get(3), horario4);
    }
}
