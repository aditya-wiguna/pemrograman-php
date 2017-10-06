package com.adityawiguna.pemrogramanphp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Situasi extends AppCompatActivity {

    private TextView vMateri;
    private TextView vJudul;
    private Button sebelum;
    private Button lanjut;
    private Button selesai;

    private int number = 0;

    private String mJudul[] = {"if, else if, else statements", "Perulangan While", "Perulangan for"};

    private String mMateri[] = {
            "\t Pada materi ini fungsi if dan else if adalah sebagai situasinya dan else baru akan di eksekusi bila situasi di if dan else if tidak ada pas/tepat, untuk lebih jelasnya lihat penrnyataan di bawah ini: \n\n" +
                    "\tif(kondisi){\n" +
                    "\t\t kode yang ada di sini akan di eksekusi bila kondisinya terpenuhi/tepat\n" +
                    "\t}else if(kondisi){\n" +
                    "\t\t kode yang ada disini akan di eksekusi bila kondisi di atas tidak terpenuhi dan cocok dengan kondisi di sini\n" +
                    "\t}else{\n" +
                    "\t\t kode ini akan di eksekusi bila kondisi yang di atas semua tidak terpenuhi\n" +
                    "\t}\n\n" +
                    "\tContoh Program:\n\n" +
                    "\t<?php\n" +
                    "\t\t$num = 10;\n" +
                    "\t\tif($num < 10){\n" +
                    "\t\t\techo 'Dibawah 10';\n" +
                    "\t\t}else if($num >= 10){\n" +
                    "\t\t\techo 'Pass';\n" +
                    "\t\t}else{\n" +
                    "\t\t\techo 'Not Valid'\n" +
                    "\t\t}\n\n" +
                    "\t\t//Output: Pass\n" +
                    "\t?>\n\n" +
                    "\tDari kode program di atas kita bisa lihat bawah situasi yang ke 2 lah yang terpenuhin makan dari itu kode yang di eksekusi pun ada pada else if atau situasi ke 2, disini juga lah kita akan menggunakan operator logika yang ada di materi operator\n\n",
            "\t Sekarang ada ada perulangan while, maksud dari perulangan di sini adalah kode yang ada di dalam while akan di ulang sampai beberapa kali tergantntung dari kondisinya nanti, untuk lebih jelasnya bisa dilihat kode di bawah ini:\n\n" +
                    "\t<?php\n" +
                    "\t\t$i = 0;\n" +
                    "\t\twhile($i < 8){\n" +
                    "\t\t\t echo 'Angka $i <br>';\n" +
                    "\t\t\t $i++;\n" +
                    "\t\t}\n\n" +
                    "\t//Output:\n" +
                    "\t//Angka 0\n" +
                    "\t//Angka 1\n" +
                    "\t//Angka 2\n" +
                    "\t//Angka 3\n" +
                    "\t//Angka 4\n" +
                    "\t//Angka 5\n" +
                    "\t//Angka 6\n" +
                    "\t//Angka 7\n" +
                    "\t?>\n\n" +
                    "\tvariable $i yang paling atas merupaka angka awalnya dan perulangan while akan mengulang kodenya di dalamnya sebanyak 7 kali sesuai dengan situasinya, kemudian variable $i akan otomatis di tambah 1 dengan menggunakan operator increment atau &i++, sedangkan tag <br> di dalam echo berfungsi untuk membuat enter\n\n",
            "\t Yang terakhir ada perulangan for, dari fungsi umumnya hampir sama dengan perulangan while cuma berbeda di cara penulisan, langsung saja ke penulisanya: \n\n" +
                    "\t<?php\n" +
                    "\t\tfor($a = 0;$a < 5;$a++){\n" +
                    "\t\t\techo 'Angka $i <br>';\n" +
                    "\t\t}\n\n" +
                    "\t//Output:\n" +
                    "\t//Angka 0\n" +
                    "\t//Angka 1\n" +
                    "\t//Angka 2\n" +
                    "\t//Angka 3\n" +
                    "\t//Angka 4\n\n" +
                    "\t?>\n\n" +
                    "\t$a = 0 merupaka angka awal yang akan di tampilakan\n" +
                    "\t$a < 5 perulangan berarti kurang dari 5 atau perulangan hanya sampai angka 4 saja\n" +
                    "\t$a++ berarti $a akan ditambah 1 di setiap barisnya sampai 4 atau batas perulanganya\n\n"
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
        setContentView(R.layout.activity_situasi);

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
