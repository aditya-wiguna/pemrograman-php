package com.adityawiguna.pemrogramanphp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SintaksDasar extends AppCompatActivity {

    private TextView vMateri;
    private TextView vJudul;
    private Button sebelum;
    private Button lanjut;
    private Button selesai;

    private int number = 0;

    private String mJudul[] = {"PHP Sintaks", "Echo", "Komentar"};

    private String mMateri[] = {
            "Script PHP diawali dengan tag <?php dan diakhiri dengan tag ?>\n" +
                    "Contoh: \n" +
                    "\t<?php \n" +
                    "\t\t //Kode php\n" +
                    "\t?>\n\n" +
                    "Sekarang ada contoh program PHP yang simple dengan menggunkana fungsi echo untuk menghasilkan program yang akan menampilkan 'Hello World'\n\n" +
                    "\t<?php\n" +
                    "\t\t echo 'Hello World';\n" +
                    "\t?>\n\n" +
                    "\t//Output: Hello World\n\n" +
                    "Di setiap akhir baris dari sintaks PHP selalu berisi ; sebagai akhiran\n",

            "\tKali ini ada fungsi 'echo', fungsi ini seperti yang kita gunakan tadi di contoh program php yang simple, fungsi dari echo ini adalah untuk menampilkan" +
                    " data dari tipe data String, contoh penggunaanya seperti di bawah ini:\n" +
                    "Contoh 1: \n" +
                    "\t<?php\n" +
                    "\t\t echo 'Aku sayang kamu';\n" +
                    "\t?>\n\n" +
                    "\t //Output: Aku sayang kamu\n" +
                    "\n\n" +
                    "Contoh 2:\n" +
                    "\t<?php\n" +
                    "\t\t echo '1';\n" +
                    "\t\t echo '2';\n" +
                    "\t\t echo '3';\n" +
                    "\t?>\n\n" +
                    "\t //Output: \n\t 1\n" +
                    "\t 2\n" +
                    "\t 3\n",

            "\tSekarang ada komentar, komentar ini biasanya hanya berfungsi untuk memberi penjelasan apa yang kita buat, karena" +
                    " komentar tidak akan tereksekusi oleh program, jadi komentar ini hanya bisa dilihat ketika kita membuka kode programnya saja, dan ada 3 jenis komentar yang ada di PHP," +
                    " untuk lebih jelasnya langsung saja kita lihat kode program di bawah ini \n\n" +
                    "Contoh 1 (Komentar 1 baris atau Single-line): \n" +
                    "\t<?php\n" +
                    "\t\t #Ini Komentar\n" +
                    "\t?>\n\n" +
                    "\tOutput: \n" +
                    "\n\n" +
                    "Contoh 2 (Komentar 1 baris atau Single-line): \n" +
                    "\t<?php\n" +
                    "\t\t //Ini Komentar\n" +
                    "\t?>\n\n" +
                    "\tOutput: \n" +
                    "\n\n" +
                    "Contoh 3 (Komentar lebih dari 1 baris atau Multiple-line): \n" +
                    "\t<?php\n" +
                    "\t\t /* Ini Komentar\n" +
                    "\t\t Multiple-line */\n" +
                    "\t?>\n\n" +
                    "\tOutput: \n" +
                    "\n\n" +
                    "Tambahan: Dalam penulisan komentar anda tidak perlu menambahkan ; di akhir baris\n\n"
    };

    private String getJudul(int a){
        String judul = mJudul[a];
        return judul;
    }

    private String getMateri(int a){
        String materi = mMateri[a];
        return materi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintaks_dasar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        vMateri = (TextView)findViewById(R.id.bagianmateri);
        vJudul = (TextView)findViewById(R.id.judul);
        sebelum = (Button)findViewById(R.id.sebelum);
        lanjut = (Button)findViewById(R.id.lanjut);
        selesai = (Button)findViewById(R.id.selesai);
        selesai.setVisibility(View.INVISIBLE);
        sebelum.setVisibility(View.INVISIBLE);

        updateMateri(number);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number + 1;
                if (number > 0 && number < 2){
                    sebelum.setVisibility(View.VISIBLE);
                    updateMateri(number);
                }else if (number == 2){
                    selesai.setVisibility(View.VISIBLE);
                    lanjut.setVisibility(View.INVISIBLE);
                    updateMateri(number);
                }

            }
        });

        sebelum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number - 1;
                if (number > 0 && number < 2){
                    sebelum.setVisibility(View.VISIBLE);
                    selesai.setVisibility(View.INVISIBLE);
                    lanjut.setVisibility(View.VISIBLE);
                    updateMateri(number);
                }else if (number == 2){
                    selesai.setVisibility(View.VISIBLE);
                    lanjut.setVisibility(View.INVISIBLE);
                    updateMateri(number);
                }

            }
        });

        selesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void updateMateri(int a){
        vMateri.setText(getMateri(a));
        vJudul.setText(getJudul(a));
    }

}
