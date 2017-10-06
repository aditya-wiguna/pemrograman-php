package com.adityawiguna.pemrogramanphp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView vtentang = (TextView)findViewById(R.id.tentang);

        String value = "\t Bahasa pemrograman PHP adalah bahasa yang digunakan untuk pembuatan dan pengembangan website yang tugasnya adalah untuk menangani server dari website, PHP diciptakan oleh Rasmus Lerdorf pertama kali tahun 1994\n\n";

        vtentang.setText(value);
    }
}
