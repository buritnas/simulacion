package com.insurplay.app.insurplay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

    }

    public void showDesafio(View view) {
        Intent intent = new Intent(this, Desafio.class);
        startActivity(intent);
    }
}
