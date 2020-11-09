package com.moronlu18.inventory.iu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.moronlu18.inventory.R;

public class SplashActivity extends AppCompatActivity {
    private static final long WAIT_TIME=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    /**
     * En este método se debe ejecutar todas las operaciones de inicio de la aplicación
     * como conectarse a una base de datos, a un servidor... Simulamos el tiempo de espera
     * con un hilo que duerme 2 segundos y cuando despierta ejecuta el método initLogin
     */
    @Override
    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                initLogin();
            }
        },WAIT_TIME);
    }

    private void initLogin() {
        startActivity(new Intent(SplashActivity.this,LoginActivity.class));
        //Vamos a llamar de forma explícita al método finish() que destruye la Activity
        //y no se muestra cuando se pulse el botón back
        finish();
    }
}