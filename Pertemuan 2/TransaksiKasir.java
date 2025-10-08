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
public class TransaksiKasir {
    int jumlahBeli;

    void hitungTotal(int hargaBarang) {
        int total = hargaBarang * jumlahBeli;
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("Total Bayar : Rp" + total);
    }
}
