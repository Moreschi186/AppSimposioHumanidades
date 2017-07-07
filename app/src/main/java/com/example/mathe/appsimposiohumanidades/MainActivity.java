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
import android.view.View;
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

    public void chamaMenu(View view){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}