package com.example.sncf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Page2 extends AppCompatActivity implements View.OnClickListener {
private Button btTerminer;
private RadioGroup rdInformation,rdProprete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        this.btTerminer=(Button)findViewById(R.id.idTerminer);
        this.rdInformation=(RadioGroup)findViewById(R.id.idInformation);//gere toute les infos
        this.rdProprete=(RadioGroup) findViewById(R.id.idProprete);


        this.btTerminer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.idTerminer);
        //on recupère  l'email et le rer
        String email=this.getIntent().getStringExtra("email").toString();
        String rer=this.getIntent().getStringExtra("rer").toString();

        //On calcule le score des reponses aux question


        //on ajoute la reponse du candidat

        //on passe à la page Fin
        Intent unIntent=new Intent(this,Fin.class);

        unIntent.putExtra("rer",rer);
        unIntent.putExtra("email",email);
        this.startActivity(unIntent);

    }
}