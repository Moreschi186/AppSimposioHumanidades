package com.ifsc.mathe.appsimposiohumanidades;

import android.content.Context;
import android.os.AsyncTask;
import android.view.Gravity;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by estagiario on 10/08/2017.
 */

public class MinhaTask extends AsyncTask<Object, Object, String> {

    private ProgressBar progressBar;

    private int total = 0;
    private static int PROGRESSO = 10;

    public MinhaTask(Context context, ProgressBar progressBar) {
        this.progressBar = progressBar;

    }



    @Override
    protected String doInBackground(Object... params) {
        try {

            Thread.sleep(300);

            for (int i=0; i<10; i++) {

                publishProgress();
                Thread.sleep(300);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Object... values) {
        total += PROGRESSO;
        progressBar.incrementProgressBy(PROGRESSO);


        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {
        progressBar.setVisibility(ProgressBar.INVISIBLE);


        super.onPostExecute(result);
    }
}