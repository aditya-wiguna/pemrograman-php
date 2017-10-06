package com.adityawiguna.pemrogramanphp;

/**
 * Created by Aditya_Wiguna on 6/14/2017.
 */
public class SoaldanJawaban {

    private String mSoal[] = {
            "Apa itu PHP ?",
            "Dalam Pemrograman PHP apakah simbol yang ada di akhir setiap baris kodenya ?",
            "Apakah syntax yang digunakan untuk menampil tulis/kalimat (String) ?",
            "Apa output dari kode program ini: \n\n" +
                    "<?php\n" +
                    "\t $a = 2;\n" +
                    "\t $b = 4;\n" +
                    "\n" +
                    "\t echo $a * $b;\n" +
                    "?>",
            "Apa output dari kode program ini: \n\n" +
                    "<?php\n" +
                    "\t $merk = array('Samsung', 'Oppo', 'Vivo', 'Sony');\n" +
                    "\t echo 'Merk Hpku adalah '.$merk[0].'.';\n" +
                    "?>",
            "Apa output dari kode program ini: \n\n" +
                    "<?php\n" +
                    "\t $a = 'seseorang';\n" +
                    "\t echo 'Aku suka kepada $a';\n" +
                    "?>",
            "Manakah yang tidak termasuk komentar di Pemrograman PHP ?",
            "Apa output dari kode program ini: \n\n" +
                    "<?php\n" +
                    "\t $warna = array('Biru', 'Merah', 'Hijau', 'Putih');\n" +
                    "\n" +
                    "\t foreach ($warna as $color){\n" +
                    "\t\t echo '$color ';\n" +
                    "\t}\n" +
                    "?>",
            "Apa output dari kode program ini: \n\n" +
                    "<?php\n" +
                    "\t $angka = 10;\n" +
                    "\n" +
                    "\t if ($angka < 5){\n" +
                    "\t\t echo 'Kosong';\n" +
                    "\t }else{\n" +
                    "\t\t echo 'Pas';\n" +
                    "\t }\n" +
                    "?>",
            "Apa output dari kode program ini:  \n\n" +
                    "<?php\n" +
                    "\t $a = 100;\n" +
                    "\n" +
                    "\t if ($a <= 100){\n" +
                    "\t\t echo 'Sangat Baik';\n" +
                    "\t }elseif ($a <= 85){\n" +
                    "\t\t echo 'Baik';\n" +
                    "\t }else{\n" +
                    "\t\t echo 'Cukup';\n" +
                    "\t } \n" +
                    "?>"
    };

    private String mPilihan[][] = {
            {"Pemberi Harapan Palsu", "Pemberi Harapan Pasti", "Bahasa Pemrograman", "Email Untuk Alien"},
            {",", ";", "$", "%"},
            {"printf('Kalimat');", "print('Kalimat');", "System.out.println('Kalimat');", "echo 'Kalimat';"},
            {"8", "10", "4", "6"},
            {"Merk Hpku adalah Samsung", "Merk Hpku adalah Oppo", "Merk Hpku adalah Vivo", "Merk Hpku adalah Sony"},
            {"Aku suka kepada a", "Aku suka kepada $a", "Aku suka kepada seseorang", "Error"},
            {"//komentar", "#komentar", "/*komentar*/", "<!-- komentar -->"},
            {"Biru Merah Hijau Putih", "Biru Merah Putih Hijau", "Hijau Merah Putih Biru", "Merah Putih Biru Hijau"},
            {"Noting", "Pas", "Kosong", "Program error"},
            {"Error", "Sangat Baik", "Baik", "Cukup"}
    };

    private String mJawabanBenar[] = {
            "Bahasa Pemrograman",
            ";",
            "echo 'Kalimat';",
            "8",
            "Merk Hpku adalah Samsung",
            "Aku suka kepada seseorang",
            "<!-- komentar -->",
            "Biru Merah Hijau Putih",
            "Pas",
            "Sangat Baik"
    };

    public String getSoal(int a){
        String soal = mSoal[a];
        return soal;
    }

    public String getPilihan1(int a){
        String pilihan1 = mPilihan[a][0];
        return pilihan1;
    }

    public String getPilihan2(int a){
        String pilihan2 = mPilihan[a][1];
        return pilihan2;
    }

    public String getPilihan3(int a){
        String pilihan3 = mPilihan[a][2];
        return pilihan3;
    }

    public String getPilihan4(int a){
        String pilihan4 = mPilihan[a][3];
        return pilihan4;
    }

    public String getJawaban(int a){
        String jawaban = mJawabanBenar[a];
        return jawaban;
    }

}
