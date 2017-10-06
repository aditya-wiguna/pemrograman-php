package com.adityawiguna.pemrogramanphp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Operator extends AppCompatActivity {

    private TextView vJudul;
    private TextView vMateri;
    private Button sebelum;
    private Button lanjut;
    private Button selesai;

    private int number = 0;

    private String mMateri[] = {
            "\tOperator Aritmatika adalah operator yang sering dignakan dalam operasi matematika, seperti misalnya bagi, kali, kurang, tambah. Langsung saja ini adalah contoh penggunaan dari masing-masing operator aritmatika\n" +
                    "Penggunaan: \n\n" +
                    "\t<?php\n" +
                    "\t\t //Penjumlahan\n" +
                    "\t\t echo 20 + 3; //23\n" +
                    "\t\t //Pengurangan\n" +
                    "\t\t echo 10 - 5; //5\n" +
                    "\t\t //Pembagian\n" +
                    "\t\t echo 10 / 2; //5\n" +
                    "\t\t //Perkalian\n" +
                    "\t\t echo 10 * 10; //100\n" +
                    "\t\t //Modulus atau Sisa hasil bagi\n" +
                    "\t\t echo 10 % 6; //4\n" +
                    "\t?>\n",
            "\tSekarang ada increment dan decrement, increment digunakan untuk menambah nilai suatu variable sebanyak 1, sedangkan decrement digunakan untuk mengurangi nilai dari suatu variable\n" +
                    "\tAda 2 jenis operator increment dan 2 jenis operator decrement, berikut adalah contoh penggunaan dan penulisanya\n" +
                    "Contoh: \n\n" +
                    "\t<?php\n" +
                    "\t\t $a = 10;\n" +
                    "\t\t //Pre-increment (menambah nilai sebelum variable)\n" +
                    "\t\t echo ++$a; //Output: 11\n" +
                    "\t\t //Post-increment (menambah nilai setelah variable)\n" +
                    "\t\t echo $a++; //Output: 10\n" +
                    "\t\t //Pre-decrement (mengurangi nilai sebelum variable)\n" +
                    "\t\t echo --$a; //Output: 9\n" +
                    "\t\t //Post-increment (mengurangi nilai setelah variable)\n" +
                    "\t\t echo $a--; //Output: 10\n" +
                    "\t?>\n\n" +
                    "Penjelasan: untuk Post-increment, kenapa nilainya tetap?, itu karena bilangan ditampilkan terlebih dahulu setelah itu baru di tambah 1, begitu juga sama dengan" +
                    "Post-decrement, bilangan akan di tampilkan terlebih dahulu baru di kurangi 1\n\n",
            "\tSelanjutnya ada operator perbandingan, untuk operator perbandingan akan sering di gunakan di materi Situasi Kontrol/Situasi, disini akan ada penjelasan singkat saja tentang simbol dan fungsinya saja, sebagai berikut: \n\n" +
                    "| == | Berfungsi sebagai perbandingan sama dengan\n" +
                    "| != | Berfungsi sebagai perbandingan tidak sama dengan\n" +
                    "| >  | Berfungsi sebagai perbandingan lebih dari\n" +
                    "| <  | Berfungsi sebagai perbandingan kurang dari\n" +
                    "| >= | Berfungsi sebegai perbandingan lebih dari atau sama dengan\n" +
                    "| <= | Berfungsi sebagai perbandingan kurang dari atau sama dengan\n\n" +
                    "Untuk penggunaanya bisa dilihat nanti di materi Situasi kontrol/Situasi\n"
    };

    private String mJudul[] = {
            "Operator Aritmatika", "Increment dan Decrement", "Operator Perbandingan"
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
        setContentView(R.layout.activity_operator);

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
