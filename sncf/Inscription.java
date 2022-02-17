package com.example.sncf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Inscription extends AppCompatActivity implements View.OnClickListener {

    private Button btParticiper;
    private EditText txtNom,txtPrenom,txtEmail;
    private Spinner spAge,spFrequence;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        this.txtNom = (EditText) findViewById(R.id.idNom);
        this.txtPrenom = (EditText) findViewById(R.id.idPrenom);
        this.txtEmail = (EditText) findViewById(R.id.idMail);
        this.btParticiper = (Button) findViewById(R.id.idParticiper);
        this.spAge = (Spinner) findViewById(R.id.idTranche);
        this.spFrequence = (Spinner) findViewById(R.id.idFrequence);


        this.btParticiper.setOnClickListener(this);
        //remplissage des spinner
        ArrayList<String> lesAges=new ArrayList<>();
        lesAges.add("0-18 ans");
        lesAges.add("19-35 ans");
        lesAges.add("63 ans et plus");
        //creation d'un adaptateur permettant d'afficher l'arraylist dans le spinner
        ArrayAdapter unAdapter=new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,lesAges);
        this.spAge.setAdapter(unAdapter);

        ArrayList<String> lesFrequences=new ArrayList<>();
        lesFrequences.add("Quotidienne");
        lesFrequences.add("Hebdomadaire");
        lesFrequences.add("Mensuelle");
        lesFrequences.add("Annuelle");
        unAdapter =new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,lesFrequences);
        this.spFrequence.setAdapter(unAdapter);

    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.idParticiper){//recuperation des information après le click sur le buutton participer
            String email=this.txtEmail.getText().toString();
            String nom=this.txtNom.getText().toString();
            String prenom=this.txtPrenom.getText().toString();
            String age=this.spAge.getSelectedItem().toString(); //le getSelectdItem donne l'item selectionner
            String frequence=this.spFrequence.getSelectedItem().toString();


            //instanciation de la classe candidat


            //passage à la premiere page de l'enquete
            Intent unIntent=new Intent(this,
                    Page1.class);
            /*recuperation du rer clicker(A,B,C,D,E) */
            String rer=this.getIntent().getStringExtra("rer").toString();
            unIntent.putExtra("rer", rer);
            unIntent.putExtra("mail", email);
            Toast.makeText(this,"Bienvenue"+" "+nom+" "+prenom,Toast.LENGTH_LONG).show();
            this.startActivity(unIntent);//demarrage de l'activité

        }

    }




}