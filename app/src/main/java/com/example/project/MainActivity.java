package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText berat, panjang, lebar, tinggi;
    Button upload;
    TextView hasil,hasilv, hasilb;
    Float volumetrik;

    Integer b,p,l,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        berat = findViewById(R.id.ed);
        panjang = findViewById(R.id.ed2);
        lebar = findViewById(R.id.ed3);
        tinggi = findViewById(R.id.ed4);
        upload = findViewById(R.id.button);
        hasil = findViewById(R.id.textView);
        hasilv = findViewById(R.id.textView1);
        hasilb = findViewById(R.id.textView2);

//        System.out.println("Masukkan Berat Barang : ");
//        System.out.println("Masukkan Panjang Barang : ");
//        System.out.println("Masukkan Lebar Barang : ");
//        System.out.println("Masukkan Tinggi Barang : ");

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b = Integer.valueOf(String.valueOf(berat.getText()));
                p = Integer.valueOf(String.valueOf(panjang.getText()));
                l = Integer.valueOf(String.valueOf(lebar.getText()));
                t = Integer.valueOf(String.valueOf(tinggi.getText()));

                hasil.setText("Berat " + b.toString() + "kg \n" + "Panjang : " + p.toString() + "Cm \n" + "Lebar : " + l.toString() + "Cm \n" + "Tinggi : " + t.toString() + "Cm");
                volumetrik = Float.valueOf((p * l * t) / 4000);

                hasilv.setText("Berat Volumetrik: " + volumetrik.toString() +"\n Berat Aktual (" + b.toString() + ") : Berat Volumetrik (" + volumetrik.toString() + ") \n");

                if (b > volumetrik) {
                    hasilb.setText("Yang dipilih Berat Aktual = " + b.toString());
                } else if (b < volumetrik) {
                    hasilb.setText("Yang dipilih Berat Volumetrik: " + volumetrik.toString());
                } else {
                    hasilb.setText("Keduanya memiliki berat yang sama");
                }
            }
        });

    }
}