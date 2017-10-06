package com.adityawiguna.pemrogramanphp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListMateri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_materi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button sintaksdasar = (Button)findViewById(R.id.sintaksdasar);
        Button variable = (Button)findViewById(R.id.variable);
        Button operator = (Button)findViewById(R.id.operator);
        Button array = (Button)findViewById(R.id.array);
        Button situasi = (Button)findViewById(R.id.situasi);

        sintaksdasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ListMateri.this, SintaksDasar.class);
                startActivity(a);
            }
        });

        variable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ListMateri.this, Variable.class);
                startActivity(a);
            }
        });

        operator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ListMateri.this, Operator.class);
                startActivity(a);
            }
        });

        array.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ListMateri.this, Array.class);
                startActivity(a);
            }
        });

        situasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ListMateri.this, Situasi.class);
                startActivity(a);
            }
        });

    }
}
