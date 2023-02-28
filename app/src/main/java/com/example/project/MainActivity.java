package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Integer Berat, Panjang, Lebar, Tinggi;
    Float Volumetrik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.println("Masukkan Berat Barang : ");
        System.out.println("Masukkan Panjang Barang : ");
        System.out.println("Masukkan Lebar Barang : ");
        System.out.println("Masukkan Tinggi Barang : ");

        Berat = Integer.valueOf(input.nextLine());
        Panjang = Integer.valueOf(input1.nextLine());
        Lebar = Integer.valueOf(input2.nextLine());
        Tinggi = Integer.valueOf(input3.nextLine());

        System.out.println("Berat " + Berat.toString() + "kg \n" + "Panjang : " + Panjang.toString() + "Cm \n" + "Lebar : " + Lebar.toString() + "Cm \n" + "Tinggi : " + Tinggi.toString());
        Volumetrik = Float.valueOf((Panjang * Lebar * Tinggi) / 4000);

        System.out.println("Berat Volumetrik: " + Volumetrik.toString());

        System.out.println("Berat Aktual (" + Berat + ") : Berat Volumetrik (" + Volumetrik + ") \n");

        if (Berat > Volumetrik) {
            System.out.println("Yang dipilih Berat Aktual = " + Berat);
        } else if (Berat < Volumetrik) {
            System.out.println("Yang dipilih Berat Volumetrik: " + Volumetrik);
        } else {
            System.out.println("Keduanya memiliki berat yang sama");
        }

    }
}