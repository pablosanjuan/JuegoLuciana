package com.games.pablosanjuan.juego1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class O_Activity extends ActionBarActivity implements View.OnClickListener {

    Button letra;
    ImageButton imagen_btn;
    int bandera = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o);
        letra = (Button) findViewById(R.id.letra);
        imagen_btn = (ImageButton) findViewById(R.id.imagen);
        letra.setOnClickListener(this);
        imagen_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.letra:
                Intent intent = new Intent(this, U_Activity.class);
                startActivity(intent);
                finish();
                break;

            case R.id.imagen:
                switch (bandera){
                    case 0:
                        imagen_btn.setImageResource(R.drawable.ojo);
                        bandera = 1;
                        break;

                    case 1:
                        imagen_btn.setImageResource(R.drawable.oveja);
                        bandera = 2;
                        break;

                    case 2:
                        imagen_btn.setImageResource(R.drawable.oreja);
                        bandera = 3;
                        break;

                    case 3:
                        imagen_btn.setImageResource(R.drawable.oruga);
                        bandera = 4;
                        break;

                    case 4:
                        imagen_btn.setImageResource(R.drawable.oso);
                        bandera = 0;
                        break;
                }
                break;
        }
    }
}