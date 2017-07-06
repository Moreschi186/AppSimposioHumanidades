package com.example.mathe.appsimposiohumanidades;

import java.sql.Time;
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


    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ativaTimer();
    }

    public void ativaTimer() {
        task = new TimerTask() {
            public void run() {
                handler.post(new Runnable() {
                    public void run() {
                        verificaEvento();
                    }
                });
            }
        };

        timerAtual.schedule(task, 100 * 60, 10000);
    }

    public void verificaEvento() {
        TextView ocorrendoAgora = (TextView) findViewById(R.id.label_evento);
        SimpleDateFormat dateFormat_hora = new SimpleDateFormat("HH:mm");
        SimpleDateFormat dateFormat_dia = new SimpleDateFormat("dd:MM");
        Date data = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        Date data_atual = cal.getTime();
        String hora_atual = dateFormat_hora.format(data_atual);
        String dia_atual = dateFormat_dia.format(data_atual);
        String horacerta = hora_atual;
        horacerta = horacerta.replace(":", "");
        String diacerto = dia_atual;
        diacerto = dia_atual.replace(":", "");
        int dia = Integer.parseInt(diacerto);
        int hora = Integer.parseInt(horacerta);
        System.out.println("Dia:" + dia + " " + "Hora: " + hora);
         if (dia == 2808) {
            if (hora >= 1830 && hora < 1930) {
                ocorrendoAgora.setText("Solenidade de Abertura");
            }
            else if (hora >= 1930 && hora < 2200) {
                ocorrendoAgora.setText("Educação no Brasil desafios para a formação de sujeitos críticos");
            }
            else {
                ocorrendoAgora.setText("Não está ocorrendo nenhum evento neste momento");
            }
        }
        else if (dia == 2908) { // Popular com eventos do dia 29

        }
        else if (dia == 3008) { // Popular com eventos do dia 30

        }

    }

}