package com.adityawiguna.pemrogramanphp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Array extends AppCompatActivity {

    private TextView vMateri;
    private TextView vJudul;
    private Button sebelum;
    private Button lanjut;
    private Button selesai;

    private int number = 0;

    private String mJudul[] = {"Dasar Array", "Asosiatif Array"};

    private String mMateri[] = {
            "\tArray merupakan variable yang spesial karena bisa memiliki lebih dari 1 nilai, penomeran di array berawal dari 0, untuk lebih jelasnya bisa di lihat di kode program di bawah ini: \n\n" +
                    "\t<?php\n" +
                    "\t\t$warna = array('Biru', 'Ungu', 'Merah');\n\n" +
                    "\t\techo $warna[0]; //Output: Biru\n" +
                    "\t\techo $warna[2]; //Output: Merah\n" +
                    "\t\techo $warna[1]; //Output: Ungu\n" +
                    "\t?>\n",
            "\tAsosiatif Array merupakan array yang tidak menggunakan angka sebagai kunci di setiap nilainya, berbeda dengan array sebelumnya yang menggunakan angka sebagai kunci di setiap nilainya," +
                    " berikut ini adalah cara penulisan asosiatif array: \n\n" +
                    "\t<?php\n" +
                    "\t\t$asosiatif = array('warna' => 'Biru', 'mobil' => 'Toyota');\n" +
                    "\t\techo $asosiatif['warna']; //Output: Biru\n" +
                    "\t\techo $asosiatif['mobil']; //Output: Toyota\n" +
                    "\t?>\n"
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
        setContentView(R.layout.activity_array);

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
                if (number == 0){
                    sebelum.setVisibility(View.INVISIBLE);
                    lanjut.setVisibility(View.VISIBLE);
                    selesai.setVisibility(View.INVISIBLE);
                    updateMateri(number);
                }else if (number == 1){
                    selesai.setVisibility(View.VISIBLE);
                    lanjut.setVisibility(View.INVISIBLE);
                    sebelum.setVisibility(View.VISIBLE);
                    updateMateri(number);
                }

            }
        });

        sebelum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = number - 1;
                if (number == 0){
                    sebelum.setVisibility(View.INVISIBLE);
                    lanjut.setVisibility(View.VISIBLE);
                    selesai.setVisibility(View.INVISIBLE);
                    updateMateri(number);
                }else if (number == 1){
                    selesai.setVisibility(View.VISIBLE);
                    lanjut.setVisibility(View.INVISIBLE);
                    sebelum.setVisibility(View.VISIBLE);
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
