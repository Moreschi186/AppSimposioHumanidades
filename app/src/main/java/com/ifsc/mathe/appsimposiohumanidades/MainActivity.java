package com.ifsc.mathe.appsimposiohumanidades;

import java.sql.Timestamp;
import java.util.Timer;
import java.util.TimerTask;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
                                                                InscricoesFragment.OnFragmentInteractionListener,
                                                                InicioFragment.OnFragmentInteractionListener,
                                                                AvalieEventoFragment.OnFragmentInteractionListener,
                                                                SobreSimposioFragment.OnFragmentInteractionListener,
                                                                SobreAplicativoFragment.OnFragmentInteractionListener{

    private Timer timerAtual = new Timer();
    private TimerTask task;
    private final Handler handler = new Handler();



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        Fragment fragment = new InicioFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_pai, fragment).commit();
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
        Fragment fragment = null;
        FragmentActivity fragmentActivity = null;
        FragmentTransaction transaction = getFragmentManager().beginTransaction();


        Boolean fragmentoSelecionado = true;

        if (id == R.id.nav_inicio) {
            fragment = new InicioFragment();
            fragmentoSelecionado = true;
        }
        else if (id == R.id.nav_palestrantes) {
            Intent intent = new Intent(this, Palestrantes.class);
            startActivity(intent);
            fragmentoSelecionado = false;
        }
        else if (id == R.id.nav_inscricoes) {
            fragment = new InscricoesFragment();

            fragmentoSelecionado = true;

        }
        else if (id == R.id.nav_avalie_evento) {
            fragment = new AvalieEventoFragment();
            fragmentoSelecionado = true;

        }

        else if (id == R.id.nav_dia28) {
           Intent intent = new Intent(this,Programacao.class);
            startActivity(intent);
            fragmentoSelecionado = false;
        }
        else if(id == R.id.nav_dia29){
            Intent intent = new Intent(this, Programacao29.class);
            startActivity(intent);
            fragmentoSelecionado = false;
        }
        else if(id == R.id.nav_dia30){
            Intent intent = new Intent(this, Programacao30.class);
            startActivity(intent);
            fragmentoSelecionado = false;
        }
        else if (id == R.id.nav_sobre_simposio) {
            fragment = new SobreSimposioFragment();
            fragmentoSelecionado = true;


        } else if (id == R.id.nav_sobre_aplicativo) {
            fragment = new SobreAplicativoFragment();
            fragmentoSelecionado = true;

        } else if (id == R.id.nav_local){
            Intent intent = new Intent(this, Maps.class);
            startActivity(intent);
            fragmentoSelecionado = false;
        }

        if(fragmentoSelecionado){
            if (id == R.id.nav_inicio) {


            }

            getSupportFragmentManager().beginTransaction().replace(R.id.content_pai, fragment).addToBackStack(null).commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void onFragmentInteraction(Uri uri){

    }


}