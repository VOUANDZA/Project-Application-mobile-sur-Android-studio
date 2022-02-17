package com.example.sncf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btrerA, btrerB, btrerC, btrerD, btrerE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btrerA = (ImageButton) findViewById(R.id.rera);
        btrerB = (ImageButton) findViewById(R.id.rerB);
        btrerC = (ImageButton) findViewById(R.id.rerc);
        btrerD = (ImageButton) findViewById(R.id.rerd);
        btrerE = (ImageButton) findViewById(R.id.rerE);


        this.btrerB.setOnClickListener(this);
        this.btrerC.setOnClickListener(this);
        this.btrerD.setOnClickListener(this);
        this.btrerA.setOnClickListener(this);
        this.btrerE.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String rer = "";
        switch (v.getId()) {
            case R.id.rera:
                rer = "btrerA";
                break;//test des button: si on clik sur le button rera il sera egal au button rer
            case R.id.rerB:
                rer = "btrerB";
                break;
            case R.id.rerc:
                rer = "btrerC";
                break;
            case R.id.rerd:
                rer = "btrerD";
                break;
            case R.id.rerE:
                rer = "btrerE";
                break;
        }

                //choix de la satisfaction d'un rer sur la page inscription
             Intent unIntent=new Intent(this,Inscription.class);//si on click sur un rer,il va nous renoyer à la page suivante
        unIntent.putExtra("rer", rer);
        this.startActivity(unIntent);//demarre une activité après avoir cliker sur un button



        }
        }

