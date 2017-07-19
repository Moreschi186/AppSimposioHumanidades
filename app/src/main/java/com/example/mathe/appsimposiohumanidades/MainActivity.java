package com.example.mathe.appsimposiohumanidades;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Timer timerAtual = new Timer();
    private TimerTask task;
    private final Handler handler = new Handler();
    TextView ocorrendoAgora;
    Eventos evento = new Eventos();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ocorrendoAgora = (TextView) findViewById(R.id.label_evento);
        ativaTimer();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void ativaTimer(){
        task = new TimerTask() {
            public void run() {
                handler.post(new Runnable() {
                    public void run() {
                        verificaEvento();
                    }
                });
            }};
        timerAtual.schedule(task, 1, 100000);
    }

    public void verificaEvento() { // Verifica o horario do celular e mostra o evento que está ocorrendo no momento.
        int eventoAtual;
        Timestamp horaAtual = new Timestamp(System.currentTimeMillis());
        eventoAtual = evento.retornaEvento(horaAtual);
        System.out.println("\nHorário: " + horaAtual + " " + "Evento atual: " + eventoAtual);
        switch (eventoAtual){
            case 0:
                ocorrendoAgora.setText("O evento acabou. Obrigado pela sua participação. Não esqueça de avaliar o quê você achou do evento na aba Avalie o Evento");
            case 1:
                ocorrendoAgora.setText("O evento ainda não iniciou. Acesse a aba Programação para ver a programação completa do evento");
            case 2:
                ocorrendoAgora.setText("Solenidade de abertura - Local: Auditório");
            case 3:
                ocorrendoAgora.setText("Educação no Brasil desafios para a formação de sujeitos críticos");
            case 4:
                ocorrendoAgora.setText("O primeiro dia do evento acabou. Fique atento a programação do segundo dia na aba Programação");
            case 5:
                ocorrendoAgora.setText("EVENTOS MANHÃ SEGUNDO DIA");
            case 6:
                ocorrendoAgora.setText("Atividades Culturais");
            case 7:
                ocorrendoAgora.setText("EVENTOS TARDE SEGUNDO DIA");
            case 8:
                ocorrendoAgora.setText("Nenhuma palestra acontecendo no momento. Acesse a aba Programação e confira a programação completa do evento");
            case 9:
                ocorrendoAgora.setText("Escola para quê(m)?");
            case 10:
                ocorrendoAgora.setText("O segundo dia do evento acabou. Fique atento a programação do segundo dia na aba Programação");
            case 11:
                ocorrendoAgora.setText("EVENTOS MANHÃ TERCEIRO DIA");
            case 12:
                ocorrendoAgora.setText("Atividades Culturais");
            case 13:
                ocorrendoAgora.setText("EVENTOS TARDE TERCEIRO DIA");
            case 14:
                ocorrendoAgora.setText("Nenhuma palestra acontecendo no momento. Acesse a aba Programação e confira a programação completa do evento");
            case 15:
                ocorrendoAgora.setText("Educação e diversidade");
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.nav_ocorrendo_agora) {

        } else if (id == R.id.nav_programacao) {


        } else if (id == R.id.nav_palestrantes) {
            Intent intent = new Intent(this, Palestrantes.class);
            startActivity(intent);

        } else if (id == R.id.nav_inscricoes) {


        } else if (id == R.id.nav_avalie_evento) {


        } else if (id == R.id.nav_sobre_simposio) {


        } else if (id == R.id.nav_sobre_aplicativo) {


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void onFragmentInteraction(Uri uri){

    }


}