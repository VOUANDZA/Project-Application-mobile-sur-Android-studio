package com.example.sncf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Fin extends AppCompatActivity implements View.OnClickListener{
private Button btFin;
private ImageView imgSmyle;
private TextView tvResultat;
private ListView lvListe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin);
        this.btFin=(Button) findViewById(R.id.Fin);
        this.tvResultat=(TextView) findViewById(R.id.idResultat);
        this.imgSmyle=(ImageView) findViewById(R.id.idSmyle);
        this.lvListe=(ListView) findViewById(R.id.idListe);
        this.btFin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
if(v.getId()==R.id.Fin){
    Intent unIntent=new Intent(this,MainActivity.class);
    Toast.makeText(this,"Merci",Toast.LENGTH_LONG).show();

    this.startActivity(unIntent);
}
    }
}