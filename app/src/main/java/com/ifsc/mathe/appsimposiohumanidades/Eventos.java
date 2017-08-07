package com.ifsc.mathe.appsimposiohumanidades;

import android.app.Activity;

import java.sql.Timestamp;

/**
 * Created by mathe on 07/07/2017.
 */

public class Eventos extends Activity {
    /*protected MainActivity context;
    public Eventos(Context context) {
        this.context = (MainActivity) context;
    }

    public void updateTV(final String str1) {
        context.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                context.ocorrendoAgora.setText(str1);
            }
        });
    }
*/
    // Definição horários em variáveis finais dia 28/08/2017
    final Timestamp aberturaEvento = Timestamp.valueOf("2017-08-28 18:30:00");
    final Timestamp inicioPrimeiroDia = Timestamp.valueOf("2017-08-28 19:30:00");
    final Timestamp fimPrimeiroDia = Timestamp.valueOf("2017-08-28 22:00:00");

    // Definição horários em variáveis finais dia 29/08/2017
    final Timestamp inicioSegundoDia = Timestamp.valueOf("2017-08-29 08:30:00");
    final Timestamp fimManhaSegundoDia = Timestamp.valueOf("2017-08-29 11:30:00");
    final Timestamp inicioTardeSegundoDia = Timestamp.valueOf("2017-08-29 13:30:00");
    final Timestamp fimTardeSegundoDia = Timestamp.valueOf("2017-08-29 16:30:00");
    final Timestamp inicioNoiteSegundoDia = Timestamp.valueOf("2017-08-29 19:00:00");
    final Timestamp fimNoiteSegundoDia = Timestamp.valueOf("2017-08-29 22:00:00");

    // Definição horários em variáveis finais dia 30/08/2017
    final Timestamp inicioTerceiroDia = Timestamp.valueOf("2017-08-30 08:30:00");
    final Timestamp fimManhaTerceiroDia = Timestamp.valueOf("2017-08-30 11:30:00");
    final Timestamp inicioTardeTerceiroDia = Timestamp.valueOf("2017-08-30 13:30:00");
    final Timestamp fimTardeTerceiroDia = Timestamp.valueOf("2017-08-30 16:30:00");
    final Timestamp inicioNoiteTerceiroDia = Timestamp.valueOf("2017-08-30 19:00:00");
    final Timestamp fimNoiteTerceiroDia = Timestamp.valueOf("2017-08-30 22:00:00");

    public String[] retornaEvento(Timestamp horaAtual) {
        String[] evento = new String[5];
        if(horaAtual.before(aberturaEvento) == true){
            evento[0] = "Local: Teste";
            evento[1] = "Evento: Palestra";
            evento[2] = "Tema: XXXX";
            evento[3] = "Palestrante: Prof. Ms. XXXX";
            evento[4] = "Próximo evento: XXXXXXXXXXXXX";
            return evento; // Evento ainda não começou
        } /*
        else if (horaAtual.after(aberturaEvento) == true && horaAtual.before(inicioPrimeiroDia) == true) {
            return 2; // Cerimônia de abertura
        }
        else if (horaAtual.after(inicioPrimeiroDia) == true && horaAtual.before(fimPrimeiroDia) == true) {
            return 3; // Palestra do primeiro dia após a cerimônia de abertura.
        }
        else if (horaAtual.after(fimPrimeiroDia) == true && horaAtual.before(inicioSegundoDia) == true) {
            return 4; // Termino do primeiro dia e esperando inicio do segundo dia.
        }
        else if (horaAtual.after(inicioSegundoDia) == true && horaAtual.before(fimManhaSegundoDia) == true) {
            return 5; // Eventos da manha do segundo dia
        }
        else if (horaAtual.after(fimManhaSegundoDia) == true && horaAtual.before(inicioTardeSegundoDia) == true) {
            return 6; // Intervalo entre manha e tarde segundo dia -- Atividades Culturais
        }
        else if (horaAtual.after(inicioTardeSegundoDia) == true && horaAtual.before(fimTardeSegundoDia) == true) {
            return 7; // Eventos da tarde do segundo dia
        }
        else if (horaAtual.after(fimTardeSegundoDia) == true && horaAtual.before(inicioNoiteSegundoDia) == true){
            return 8; // Intervalo entre tarde e noite do segundo dia
        }
        else if (horaAtual.after(inicioNoiteSegundoDia) == true && horaAtual.before(fimNoiteSegundoDia) == true) {
            return 9; // Eventos da noite do segundo dia
        }
        else if (horaAtual.after(fimNoiteSegundoDia) == true && horaAtual.before(inicioTerceiroDia) == true) {
            return 10; // Termino do segundo dia esperando iniciar terceiro
        }
        else if (horaAtual.after(inicioTerceiroDia) == true && horaAtual.before(fimManhaTerceiroDia) == true){
            return 11; // Eventos da parte da manha terceiro dia
        }
        else if (horaAtual.after(fimManhaTerceiroDia) == true && horaAtual.before(inicioTardeTerceiroDia) == true){
            return 12; // Intervalo entre manha e tarde terceiro dia -- Atividades Culturais
        }
        else if (horaAtual.after(inicioTardeTerceiroDia) == true && horaAtual.before(fimTardeTerceiroDia) == true){
            return 13; // Eventos da tarde do terceiro dia
        }
        else if (horaAtual.after(fimTardeTerceiroDia) == true && horaAtual.before(inicioNoiteTerceiroDia) == true) {
            return 14; // Intervalo entre tarde e noite do segundo dia
        }
        else if (horaAtual.after(inicioNoiteTerceiroDia) == true && horaAtual.before(fimNoiteTerceiroDia) == true) {
            return 15; // Eventos da noite terceiro dia
        } */
        else {
            return null; // Retorna 0 após o evento já ter acabado.
        }

    }

}
