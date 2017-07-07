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
import android.view.View;
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
        SimpleDateFormat dateFormat_dia = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        Date data_atual = cal.getTime();
        String hora_atual = dateFormat_hora.format(data_atual);
        String dia_atual = dateFormat_dia.format(data_atual);
        System.out.println("Dia:" + dia_atual + " " + "Hora: " + hora_atual);
        
    }
    public void chamaMenu(View view){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}