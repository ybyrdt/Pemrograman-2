/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_2;

/**
 *
 * @author radit
 */
public class KasirMini {
    public static void main(String[] args) {

        Kasir kasir = new Kasir();
        Barang barang = new Barang();
        TransaksiKasir transaksi = new TransaksiKasir();

        kasir.namaKasir = "Radit";
        barang.namaBarang = "Mie Instan Goreng";
        barang.hargaBarang = 3500;
        transaksi.jumlahBeli = 3;

        System.out.println("=== Radit Mart ===");
        kasir.tampilkanKasir();
        barang.tampilkanBarang();
        transaksi.hitungTotal(barang.hargaBarang);
    }
}


