package com.adityawiguna.pemrogramanphp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Variable extends AppCompatActivity{

    private TextView vJudul;
    private TextView vMateri;
    private Button sebelum;
    private Button lanjut;
    private Button selesai;

    private int number = 0;


    private String mMateri[] = {
            "\t Sekarang ada variable, variable ini berfungsi untuk menyimpan data atau lebih tepatnya menyimpan nilai, langsung saja ini adalah contoh penulisan variable\n\n" +
                    "Penulisan: \n" +
                    "\t<?php\n" +
                    "\t\t $nama_variable = 'Nilai dari Variable';\n" +
                    "\t?>\n",
            "\t Ada beberapa jenis tipe data yang bisa digunakan di php, tapi untuk dasarnya kita hanya perlu mempelajari 4 saja ,langsung saja penjelasanya\n" +
                    "\tYang pertama ada tipe data Integer tipedata ini merupakan tipe data untuk bilangan bulat\n" +
                    "Penulisan: \n" +
                    "\t<?php\n" +
                    "\t\t $no = 90;\n" +
                    "\t?>\n\n" +
                    "\tSelanjutnya ada String, string merupakan tipe data untuk huruf atau karakter lainya penulisan string biasanya dawali dan di akhiri dengan '\n" +
                    "Penulisan: \n" +
                    "\t<?php\n" +
                    "\t\t $string = 'Hello World';\n" +
                    "\t?>\n\n" +
                    "\tSelanjutnya ada Float, float merupakan tipe data untuk bilangan decimal\n" +
                    "Penulisan: \n" +
                    "\t<?php\n" +
                    "\t\t $float = 12.456;\n" +
                    "\t?>\n\n" +
                    "\tYang terakhir ada Boolean, tipe data ini hanya bernilai true dan false saja\n" +
                    "Penulisan: \n" +
                    "\t<?php\n" +
                    "\t\t $x = true;\n" +
                    "\t\t $y = false;\n" +
                    "\t?>\n\n",
            "\t Sekarang ada contoh penggunaan variable secara umum\n" +
                    "Penggunaan: \n\n" +
                    "\t<?php\n" +
                    "\t\t $umur = 17;\n" +
                    "\t\t $kalimat = 'Umurku ';\n" +
                    "\t\t echo $kalimat.' '.$umur.' Tahun';\n" +
                    "\t\t //Output: Umurku 17 Tahun\n\n" +
                    "\t\t $float = 12.678;\n" +
                    "\t\t var_dump($float);\n" +
                    "\t\t //Ouput: 12.678;\n" +
                    "\t?>"
    };

    private String mJudul[] = {
            "Penulisan Variable", "Tipe Data", "Penggunaan"
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
        setContentView(R.layout.activity_variable);

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
                if (number > 1 && number < 2){
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
