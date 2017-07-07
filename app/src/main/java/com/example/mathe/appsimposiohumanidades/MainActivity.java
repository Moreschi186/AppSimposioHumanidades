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
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private Timer timerAtual = new Timer();
    private TimerTask task;
    private final Handler handler = new Handler();
    TextView ocorrendoAgora;
    Eventos evento = new Eventos();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ocorrendoAgora = (TextView) findViewById(R.id.label_evento);
        ativaTimer();
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
        timerAtual.schedule(task, 1, 1000);
    }

        public void verificaEvento() { // Verifica o horario do celular e mostra o evento que está ocorrendo no momento.
            int eventoAtual;
            Timestamp horaAtual = new Timestamp(System.currentTimeMillis());
            eventoAtual = evento.retornaEvento(horaAtual);
            System.out.println("\nHorário: " + horaAtual + " " + "Evento atual: " + eventoAtual);
            ocorrendoAgora.setText("Funfando");
    }
}