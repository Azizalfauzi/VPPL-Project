package com.company;

import java.util.Scanner;

public class Main {
    // write your code here
    boolean menu = true;
    Scanner scanner = new Scanner(System.in);
    HitungLuasBangunDatar hitungLuasBangunDatar = new HitungLuasBangunDatar();

    public static void main(String[] args) {
        new Main().Menu();
    }

    private void Menu() {
        while (menu) {
            System.out.println("======Selamat Datang Di Hitung Luas Bangun Datar======");
            System.out.println("Silahkan memilih menu :");
            System.out.println("1.Hitung Luas Persegi");
            System.out.println("2.Hitung Luas Persegi Panjang");
            System.out.println("3.Hitung Luas Jajar Genjang");
            System.out.println("4.Hitung Luas Segitiga");
            System.out.println("5.Hitung Luas Lingkaran");
            System.out.println("6.Keluar");
            System.out.println("Silahkan Memilih Menu :");
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    luasPersegi();
                    break;
                case 2:
                    luasPersegiPanjang();
                    break;
                case 3:
                    luasJajarGenjang();
                    break;
                case 4:
                    luasSegitiga();
                    break;
                case 5:
                    luasLingkaran();
                    break;
                case 6:
                    menu = false;
                    System.out.println("Matursuwun Dulur\n");
                    break;
                default:
                    System.out.println("Anda salah memasukan input!\n");
                    break;
            }
        }
    }

    private void luasPersegi() {
        System.out.println("Masukan sisi ");
        double sisi_1 = scanner.nextDouble();
        System.out.println("Masukan sisi ");
        double sisi_2 = scanner.nextDouble();
        if (sisi_1 <= 0 && sisi_2 <= 0) {
            System.out.println("Inputan tidak boleh kurang dari 0 atau nol dulur");
        } else {
            double hasil = hitungLuasBangunDatar.luasPersegi(sisi_1, sisi_2);
            System.out.println("Hasilnya adalah :" + hasil);
        }
    }

    private void luasPersegiPanjang() {
        System.out.println("Masukan Panjang :");
        double panjang = scanner.nextDouble();
        System.out.println("Masukan Lebar :");
        double lebar = scanner.nextDouble();
        if (panjang <= 0 && lebar <= 0) {
            System.out.println("Inputan tidak boleh kurang dari 0 atau nol dulur");
        } else {
            double hasil = hitungLuasBangunDatar.luasPersegiPanjang(panjang, lebar);
            System.out.println("Hasilnya adalah :" + hasil);
        }
    }

    private void luasJajarGenjang() {
        System.out.println("Masukan Alas :");
        double alas = scanner.nextDouble();
        System.out.println("Masukan Tinggi :");
        double tinggi = scanner.nextDouble();
        if (alas <= 0 && tinggi <= 0) {
            System.out.println("Inputan tidak boleh kurang dari 0 atau nol dulur");
        } else {
            double hasil = hitungLuasBangunDatar.luasJajarGenjang(alas, tinggi);
            System.out.println("Hasilnya adalah :" + hasil);
        }
    }

    private void luasSegitiga() {
        System.out.println("Masukan Alas :");
        double alas = scanner.nextDouble();
        System.out.println("Masukan Tinggi :");
        double tinggi = scanner.nextDouble();
        if (alas <= 0 && tinggi <= 0) {
            System.out.println("Inputan tidak boleh kurang dari 0 atau nol dulur");
        } else {
            double hasil = hitungLuasBangunDatar.luasSegitiga(alas, tinggi);
            System.out.println("Hasilnya adalah :" + hasil);
        }
    }

    private void luasLingkaran() {
        System.out.println("Masukan Phi :");
        double phi = scanner.nextDouble();
        System.out.println("Masukan Jari-jari :");
        double jari = scanner.nextDouble();
        if (phi <= 0 && jari <= 0) {
            System.out.println("Inputan tidak boleh kurang dari 0 atau nol dulur");
        } else {
            double hasil = hitungLuasBangunDatar.luasLingkaran(phi, jari);
            System.out.println("Hasilnya adalah :" + hasil);
        }
    }
}
