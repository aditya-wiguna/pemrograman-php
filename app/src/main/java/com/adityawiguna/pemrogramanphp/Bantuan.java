package com.adityawiguna.pemrogramanphp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bantuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView tentang = (TextView)findViewById(R.id.score);
        TextView simulasi = (TextView)findViewById(R.id.textView);
        TextView kuis = (TextView)findViewById(R.id.textView2);
        TextView materi = (TextView)findViewById(R.id.textView3);
        TextView about = (TextView)findViewById(R.id.textView4);
        TextView keluar = (TextView)findViewById(R.id.textView5);

        tentang.setText("Button ini berfungsi untuk mendapat bantuan cara menggunakan aplikasi ini");
        simulasi.setText("Button ini berfungsi untuk membuka halaman untuk simulasi koding");
        kuis.setText("Button ini berfungsi untuk membuka kuis");
        materi.setText("Button ini berfungsi untuk membuka halaman daftar materi");
        about.setText("Button ini berfungsi untuk melihat tentang aplikasi ini dan bahasa pemrograman PHP");
        keluar.setText("Button ini berfungsi untuk keluar dari aplikasi");

    }
}
