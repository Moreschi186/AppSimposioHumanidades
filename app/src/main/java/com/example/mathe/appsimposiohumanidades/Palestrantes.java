package com.example.mathe.appsimposiohumanidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Palestrantes extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palestrantes);
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Palestrantes");
    }

    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, MainActivity.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity();  //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }
        return true;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Prof. Dr. Vilson Cesar Schenato");
        listDataHeader.add("Profa. Dra. Karina Klinke");

        // Adding child data
        List<String> vilsoncesar = new ArrayList<String>();
        vilsoncesar.add("Doutor em Ciências Sociais pela Universidade Federal de Campina Grande - UFCG, possui Mestrado em Ciências Sociais pela mesma instituição (2010). É graduado em Ciências Sociais pela Universidade Estadual do Oeste do Paraná (2003) e especialista em História e Região também pela UNIOESTE (2005). Professor efetivo de Sociologia no Instituto Federal de Santa Catarina. Tem experiência docente em Sociologia e Antropologia. Enquanto pesquisador se concentra nos seguintes temas: Teoria Sociológica; Campesinato, Grupos Sociais Rurais; Oeste Paranaense; Agreste Paraibano; Construções Identitárias e Relações Sócio-culturais; Direitos Humanos; Educação, Trabalho e Realidade Brasileira. Líder do Grupo de Pesquisa: Identidades, Desenvolvimento e Democracia (Certificado pelo CNPq).");

        List<String> karinaklinke = new ArrayList<String>();
        karinaklinke.add("Licenciada em Pedagogia pela Universidade Federal de Goiás (1995), Mestre em Educação pela Universidade Federal de Minas Gerais (1998), Doutora em Educação pela Universidade Federal de Minas Gerais (2003), Pós-Doutora em História Moderna e Contemporânea pelo IFCH-UNICAMP (2009). Credenciada no Programa de Pós-Graduação em Educação da Universidade Federal de Uberlândia, na Linha de Pesquisa ESTADO, POLÍTICAS E GESTÃO EM EDUCAÇÃO. Professor Associado III da Universidade Federal de Uberlândia, FACIP. Líder do Grupo de Estudos em Políticas de Leitura, Escrita, Livros e Linguagens (GEPLELL). Editora da Revista Educação e Políticas em Debate (PPGED/FACED/UFU). Coordenadora da Linha de Pesquisa Estado, Políticas e Gestão da Educação (PPGED/FACED/UFU). Experiência nas áreas de História e Políticas Públicas com ênfase nos seguintes temas: história da leitura, avaliação de políticas educacionais, gênero, educação de pessoas jovens e adultas, educação popular.");

        listDataChild.put(listDataHeader.get(0), vilsoncesar); // Header, Child data
        listDataChild.put(listDataHeader.get(1), karinaklinke);
    }
}
