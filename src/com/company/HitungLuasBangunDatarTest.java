package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HitungLuasBangunDatarTest {
    HitungLuasBangunDatar hitungLuasBangunDatar;

    @Before
    public void init() {
        hitungLuasBangunDatar = new HitungLuasBangunDatar();
    }

    @Test
    public void luasPersegi() {
        assertEquals(16,hitungLuasBangunDatar.luasPersegi(4,4),0);
    }

    @Test
    public void luasPersegiPanjang() {
        assertEquals(20,hitungLuasBangunDatar.luasPersegiPanjang(4,5),0);
    }

    @Test
    public void luasJajarGenjang() {
    assertEquals(25,hitungLuasBangunDatar.luasJajarGenjang(5,5),0);
    }

    @Test
    public void luasSegitiga() {
    assertEquals(12,hitungLuasBangunDatar.luasSegitiga(4,6),0);
    }

    @Test
    public void luasLingkaran() {
    assertEquals(153.86,hitungLuasBangunDatar.luasLingkaran(3.14,7),0);
    }
}