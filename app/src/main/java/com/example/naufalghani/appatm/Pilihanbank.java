package com.example.naufalghani.appatm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Pilihanbank extends AppCompatActivity {

    Button btnceksaldo, btntarik, btnsetor, btntransfer, btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihanbank);

        btnceksaldo = (Button) findViewById(R.id.btnceksaldo);
        btnsetor = (Button) findViewById(R.id.btnsetor);
        btntarik = (Button) findViewById(R.id.btntarik);
        btntransfer = (Button) findViewById(R.id.btntransfer);
        btnexit = (Button) findViewById(R.id.btnexit);

        btntarik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilihanbank.this, Penarikan.class);
                startActivity(i);
            }
        });
        btnsetor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pilihanbank.this, Penyetoran.class);
                startActivity(i);
            }
        });
        btnceksaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pilihanbank.this, cek.class);
                startActivity(i);
            }
        });
        btntransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pilihanbank.this, Transfer.class);
                startActivity(i);
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                System.exit(0);
            }
        });
    }
}
