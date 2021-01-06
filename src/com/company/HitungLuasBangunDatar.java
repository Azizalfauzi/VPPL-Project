package com.company;

public class HitungLuasBangunDatar {
    //kelas untuk semua method
    public double luasPersegi(double sisiA, double sisiB) {
        return sisiA * sisiB;
    }

    public double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public double luasJajarGenjang(double alas, double tinggi) {
        return alas * tinggi;
    }

    public double luasSegitiga(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    public double luasLingkaran(double phi, double jari) {
        return phi * jari * jari;
    }
}
