package com.example.calculatorfx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    Button angka1,angka2,angka3,angka4,angka5,angka6,angka7,angka8,angka9,angka0,kali,bagi,persen,plusmin,samadengan,desimal,tambah,kurang,clear,del;
    TextView display;
    double hasil,angka_1, angka_2,angka_3,sementara,sementara_2;
    int operasi;
    String angka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sementara = 0;
        sementara_2=1;
        angka = "";
        display=findViewById(R.id.display);
        angka1=findViewById(R.id.bttn1);
        angka2=findViewById(R.id.bttn2);
        angka3=findViewById(R.id.bttn3);
        angka4=findViewById(R.id.bttn4);
        angka5=findViewById(R.id.btttn5);
        angka6=findViewById(R.id.bttn6);
        angka7=findViewById(R.id.bttn7);
        angka8=findViewById(R.id.bttn8);
        angka9=findViewById(R.id.bttn9);
        angka0=findViewById(R.id.bttn0);
        clear=findViewById(R.id.bttnC);
        kali=findViewById(R.id.bttnkali);
        bagi=findViewById(R.id.bttnbagi);
        del=findViewById(R.id.bttndel);
        desimal=findViewById(R.id.bttndesimal);
        samadengan=findViewById(R.id.bttnsamadengan);
        plusmin=findViewById(R.id.bttnplusmin);
        persen=findViewById(R.id.bttnpersen);
        tambah=findViewById(R.id.bttntambah);
        kurang=findViewById(R.id.bttnkurang);

        //button angka
        angka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            angka+="1";
            display.setText(angka);
            }
        });
        angka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka+="2";
                display.setText(angka);
            }
        });
        angka3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka+="3";
                display.setText(angka);
            }
        });
        angka4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka+="4";
                display.setText(angka);
            }
        });
        angka5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka+="5";
                display.setText(angka);
            }
        });
        angka6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka+="6";
                display.setText(angka);
            }
        });
        angka7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka+="7";
                display.setText(angka);
            }
        });
        angka8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka+="8";
                display.setText(angka);
            }
        });
        angka9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka+="9";
                display.setText(angka);
            }
        });
        angka0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka+="0";
                display.setText(angka);
            }
        });

        // button operasi
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(" ");
                Log.d("angka1",Double.toString(angka_1));
                Log.d("angka2",Double.toString(angka_2));
                Log.d("hasil",Double.toString(hasil));
                angka_1=0;
                angka_2=0;
                hasil =0;
                sementara =0;
                angka = "";
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_1 = Double.parseDouble(angka);
                display.setText( "x" );
                sementara_2 =  sementara_2* angka_1;
                String cek = Double.toString(sementara_2);
                Log.d("hasilsementara_2",cek);
                angka="";
                operasi = 3;
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_1 = Double.parseDouble(angka);
                display.setText( ":" );
                sementara_2 = angka_1/sementara_2 ;
                String cek = Double.toString(sementara_2);
                Log.d("hasilsementara_2",cek);
                angka="";
                operasi = 4;
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(" ");
                angka_1=0;
                angka_2=0;
                hasil =0;
                angka = "";
            }
        });
        persen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_1 = Double.parseDouble(angka);
                display.setText( "%" );
                angka="";
                operasi = 5;

            }
        });
        plusmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_2 = Double.parseDouble(angka);
                hasil= 0 - angka_2;
                angka = Double.toString(hasil);
                display.setText(angka);
            }
        });
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_1= Double.parseDouble(angka);
                display.setText( "+" );
                sementara = sementara + angka_1;
                String cek = Double.toString(sementara_2);
                Log.d("hasilsementara_2",cek);
                angka="";
                operasi = 1;
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_1 = Double.parseDouble(angka);
                display.setText( "-" );
                System.out.println(sementara);
                sementara = sementara - angka_1;
                System.out.println(sementara);
                angka="";
                operasi = 2;
            }
        });
        samadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operasi){
                    case 1: //tambah
                        angka_2 = Double.parseDouble(angka);
                        hasil=sementara + angka_2;
                        System.out.println(hasil);
                        angka = Double.toString(hasil);
                        display.setText(angka);
                        break;
                    case 2: //kurang
                        angka_2 = Double.parseDouble(angka);
                        hasil=sementara- angka_2;
                        System.out.println(hasil);
                        angka = Double.toString(hasil);
                        display.setText(angka);
                        break;
                    case 3: //kali
                        angka_2 = Double.parseDouble(angka);
                        hasil=sementara_2 * angka_2;

                        angka = Double.toString(hasil);
                        display.setText(angka);
                        break;
                    case 4: //bagi
                        angka_2 = Double.parseDouble(angka);
                        hasil= angka_2/ sementara_2 ;
                        System.out.println(sementara_2);
                        angka = Double.toString(hasil);
                        display.setText(angka);
                        break;
                    case 5: //persen
                        angka_1 = Double.parseDouble(angka);
                        hasil=angka_1 /100 ;
                        angka = Double.toString(hasil);
                        display.setText(angka);
                        break;

                }
            }
        });










    }
}