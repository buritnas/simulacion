package com.insurplay.app.insurplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SaludModoJuego extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud_modo_juego);
    }

    public void showCompetenciaSaludPersonal(View view) {
        Intent intent = new Intent(this, CompetenciaSaludPersonal.class);
        startActivity(intent);
    }

}
