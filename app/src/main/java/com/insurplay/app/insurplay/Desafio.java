package com.insurplay.app.insurplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Desafio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desafio);
    }

    public void showModoJuegoSalud(View view) {
        Intent intent = new Intent(this, SaludModoJuego.class);
        startActivity(intent);
    }
}
