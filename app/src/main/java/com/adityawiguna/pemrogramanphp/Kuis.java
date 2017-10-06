package com.adityawiguna.pemrogramanphp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Kuis extends AppCompatActivity {

    private SoaldanJawaban mSoaldanJawaban = new SoaldanJawaban();

    private TextView mViewSoal;
    private TextView mViewSkor;
    private TextView mViewNoSoal;

    private Button mPilihan1;
    private Button mPilihan2;
    private Button mPilihan3;
    private Button mPilihan4;

    private String mJawaban;
    private int mSkor = 0;
    private int number = 0;
    private int mNoSoal = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewSoal = (TextView)findViewById(R.id.soal);
        mViewNoSoal = (TextView)findViewById(R.id.nosoal);
        mPilihan1 = (Button)findViewById(R.id.jawaban1);
        mPilihan2 = (Button)findViewById(R.id.jawaban2);
        mPilihan3 = (Button)findViewById(R.id.jawaban3);
        mPilihan4 = (Button)findViewById(R.id.jawaban4);

        updateSoal();
        updateNosoal(mNoSoal);

        mPilihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mPilihan1.getText() == mJawaban){
                    mSkor = mSkor + 1;
                    mNoSoal = mNoSoal + 1;
                    if (mNoSoal > 10){
                        selesai();
                    }else{
                        Toast.makeText(Kuis.this, "Benar", Toast.LENGTH_SHORT).show();
                        updateSoal();
                    }
                    updateNosoal(mNoSoal);
                }

                else{
                    mNoSoal = mNoSoal + 1;
                    if (mNoSoal > 10){
                        selesai();
                    }else {
                        Toast.makeText(Kuis.this, "Salah", Toast.LENGTH_SHORT).show();
                        updateSoal();
                    }
                    updateNosoal(mNoSoal);
                }

            }
        });

        mPilihan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mPilihan2.getText() == mJawaban){
                    mSkor = mSkor + 1;
                    mNoSoal = mNoSoal + 1;
                    if (mNoSoal > 10){
                        selesai();
                    }

                    else{
                        Toast.makeText(Kuis.this, "Benar", Toast.LENGTH_SHORT).show();
                        updateSoal();
                    }
                    updateNosoal(mNoSoal);
                }

                else{
                    mNoSoal = mNoSoal + 1;
                    if (mNoSoal > 10){
                        selesai();
                    }else {
                        Toast.makeText(Kuis.this, "Salah", Toast.LENGTH_SHORT).show();
                        updateSoal();
                    }
                    updateNosoal(mNoSoal);
                }

            }
        });

        mPilihan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mPilihan3.getText() == mJawaban){
                    mSkor = mSkor + 1;
                    mNoSoal = mNoSoal + 1;
                    if (mNoSoal > 10){
                        selesai();
                    }else {
                        Toast.makeText(Kuis.this, "Benar", Toast.LENGTH_SHORT).show();
                        updateSoal();
                    }
                    updateNosoal(mNoSoal);
                }

                else{
                    mNoSoal = mNoSoal + 1;
                    if (mNoSoal > 10){
                        selesai();
                    }else {
                        Toast.makeText(Kuis.this, "Salah", Toast.LENGTH_SHORT).show();
                        updateSoal();
                    }
                    updateNosoal(mNoSoal);
                }

            }
        });

        mPilihan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mPilihan4.getText() == mJawaban){
                    mSkor = mSkor + 1;
                    mNoSoal = mNoSoal + 1;
                    if (mNoSoal > 10){
                        selesai();
                    }else{
                        Toast.makeText(Kuis.this, "Benar", Toast.LENGTH_SHORT).show();
                        updateSoal();
                    }
                    updateNosoal(mNoSoal);
                }

                else{
                    mNoSoal = mNoSoal + 1;
                    if (mNoSoal > 10){
                        selesai();
                    }else {
                        Toast.makeText(Kuis.this, "Salah", Toast.LENGTH_SHORT).show();
                        updateSoal();
                    }
                    updateNosoal(mNoSoal);
                }

            }
        });

    }

    private void updateSoal(){
        mViewSoal.setText(mSoaldanJawaban.getSoal(number));
        mPilihan1.setText(mSoaldanJawaban.getPilihan1(number));
        mPilihan2.setText(mSoaldanJawaban.getPilihan2(number));
        mPilihan3.setText(mSoaldanJawaban.getPilihan3(number));
        mPilihan4.setText(mSoaldanJawaban.getPilihan4(number));

        mJawaban = mSoaldanJawaban.getJawaban(number);
        number++;
    }

    private void updateNosoal(int no){
        mViewNoSoal.setText(mNoSoal + "/10");
    }

    private void selesai(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Kuis.this);
        alertDialogBuilder
                .setMessage("Selesai \nSkor : " +mSkor)
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
