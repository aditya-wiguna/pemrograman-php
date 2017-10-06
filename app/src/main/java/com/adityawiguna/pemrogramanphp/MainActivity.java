package com.adityawiguna.pemrogramanphp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView btntentang = (ImageView)findViewById(R.id.tentang);
        ImageView btnkuis = (ImageView)findViewById(R.id.kuis);
        ImageView btnmateri = (ImageView)findViewById(R.id.materi);
        ImageView btnsimulasi = (ImageView)findViewById(R.id.simulasi);
        ImageView btnbantuan = (ImageView)findViewById(R.id.bantuan);
        ImageView btnkeluar = (ImageView)findViewById(R.id.keluar);

        btnkuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent("com.adityawiguna.pemrogramanphp.Kuis");
                startActivity(i);
            }
        });

        btnkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        btnbantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bantuan = new Intent(MainActivity.this, Bantuan.class);
                startActivity(bantuan);
            }
        });

        btnmateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent materi = new Intent(MainActivity.this, ListMateri.class);
                startActivity(materi);
            }
        });

        btntentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tentang = new Intent(MainActivity.this, Tentang.class);
                startActivity(tentang);
            }
        });

        btnsimulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simulasi = new Intent(MainActivity.this, Simulasi.class);
                startActivity(simulasi);
            }
        });


    }
}
