package com.adityawiguna.pemrogramanphp;

import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Simulasi extends AppCompatActivity {

    private EditText kode;
    private Button cek;

    private String aJawaban;

    private int number = 0;

    private String mSoal[] = {
            "<?php\n" +
                    "\techo 'Hello World'\n" +
                    "?>",
            "<?php\n" +
                    "\t$nama = 'Mark';\n" +
                    "\techo nama;\n" +
                    "?>",
            "<?php\n" +
                    "\t$a = 10;\n" +
                    "\t$b = 2;\n" +
                    "\techo $a : $b;\n" +
                    "?>",
            "<?php\n" +
                    "\t$warna = array('Orange', 'Kuning', 'Biru');\n\n" +
                    "\t//Tampilkan Warna biru\n\n" +
                    "\techo $warna;\n" +
                    "\t?>",
            "<?php\n" +
                    "\t$i = 5;\n\n" +
                    "\t/*Buat agat output berurutan dari angka 5 sampai 9*/" +
                    "\twhile($i < 10){\n" +
                    "\t\techo 'Angka $i';\n" +
                    "\t\t$i--;\n" +
                    "\t}\n" +
                    "?>"
    };

    private String mJawaban[] = {
            "<?php\n" +
                    "\techo 'Hello World';\n" +
                    "?>",
            "<?php\n" +
                    "\t$nama = 'Mark';\n" +
                    "\techo $nama;\n" +
                    "?>",
            "<?php\n" +
                    "\t$a = 10;\n" +
                    "\t$b = 2;\n" +
                    "\techo $a / $b;\n" +
                    "?>",
            "<?php\n" +
                    "\t$warna = array('Orange', 'Kuning', 'Biru');\n\n" +
                    "\t//Tampilkan Warna biru\n\n" +
                    "\techo $warna[2];\n" +
                    "\t?>",
            "<?php\n" +
                    "\t$i = 5;\n\n" +
                    "\t/*Buat agat output berurutan dari angka 5 sampai 9*/" +
                    "\twhile($i < 10){\n" +
                    "\t\techo 'Angka $i';\n" +
                    "\t\t$i++;\n" +
                    "\t}\n" +
                    "?>"
    };

    private String getKode(int a){
        String kode = mSoal[a];
        return kode;
    }

    private String getJawaban(int a){
        String jawaban = mJawaban[a];
        return jawaban;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulasi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        kode = (EditText)findViewById(R.id.kode);
        cek = (Button)findViewById(R.id.cek);

//        kode.getBackground().setColorFilter(getResources().getColor(R.color.colorAccent), PorterDuff.Mode.SRC_IN);


        updateSoal();

        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kode.getText().toString().equals(aJawaban)){
                    if (number > 3){
                        alertSelesai();
                    }else{
                        alertBenar();
                    }
                }else {
                    alertSalah();
                }
            }
        });


    }

    private void updateSoal(){
        kode.setText(getKode(number));
        aJawaban = getJawaban(number);
        number++;
    }

    private void alertBenar(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Simulasi.this);
        alertDialogBuilder
                .setMessage("Tepat Sekali")
                .setCancelable(false)
                .setPositiveButton("Lanjut",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                updateSoal();
                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void alertSalah(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Simulasi.this);
        alertDialogBuilder
                .setMessage("Salah, coba di periksa lagi")
                .setCancelable(false)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    private void alertSelesai(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Simulasi.this);
        alertDialogBuilder
                .setMessage("Selamat anda telah menyelesaikan test simulasi ini")
                .setCancelable(false)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
