package com.example.mathe.appsimposiohumanidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Programacao30 extends AppCompatActivity {

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
        getSupportActionBar().setTitle("Programação 30/08");
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
        horario1.add("Evento: Palestra\nTema: O capital financeiro e o Ensino Superior no Brasil.\nPalestrante: Prof. Ms. Allan Kenji Seki (Doutorando/Educação/UFSC)");
        horario1.add("Evento: Palestra\nTema: Trabalho docente na conjuntura atual.\nPalestrante: Profa. Msa. Renata Lucia Batista Flores (Doutorando/Geografia/UFSC).");
        horario1.add("Evento: Roda de Conversa II \nTema: GRAFFITI\nMediador: Dharla Raupp Kamers(Artista - CURA)\nMediador: Rafael Ferreira da Silva(Artista - CURA)");
        horario1.add("Evento: Palestra\nTema: História da [bi]ssexualidade: o que temos feito de nós?\nPalestrantes: Profa. Msa. Izabel Rizzi Mação (UFES) e Prof. Dr. Davis Moreira Alvim (IFES)");
        List<String> horario2 = new ArrayList<String>();
        horario2.add("Evento: Atividades Culturais\n");
        List<String> horario3 = new ArrayList<String>();
        horario3.add("Evento: Palestra\nTema: Retrato e representação II (Fotografia)\nPalestrante: Profa. Msa. Maria Lucila Hom (Doutoranda/PPGE/UDESC)");
        horario3.add("Evento: Palestra\nTema: Previdência Social brasileira no atual contexto.\nPalestrante: Profa. Msa. Angela Adelaide Lucena (UCS)");
        horario3.add("Evento: Palestra\nTema: Reflexões sobre pesquisa em política educacional.\nPalestrante: Profa. Dra. Olinda Evangelista (UFSC)");
        horario3.add("Evento: Palestra\nTema: Experiência das ocupações estudantis de 2016 no estado do Paraná: mobilizações possíveis e necessárias.\nPalestrante: Lucas Luan(DCE/UNIOESTE)");
        List<String> horario4 = new ArrayList<String>();
        horario4.add("Evento: Mesa de debate - ENCERRAMENTO\nTema: Educação e diversidades.\nPalestrantes: Profa. Dra. Karina Klinke (UFO) e Profa. Msa. Izabel Rizzi Mação (UFES)");
        listDataChild.put(listDataHeader.get(0), horario1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), horario2);
        listDataChild.put(listDataHeader.get(2), horario3); // Header, Child data
        listDataChild.put(listDataHeader.get(3), horario4);
    }
}
