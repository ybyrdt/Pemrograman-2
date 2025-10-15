/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_3;

/**
 *
 * @author radit
 */
public class utama {
    public static void main(String[] args) {
      
        // Membuat objek mahasiswa
        mahasiswa m1 = new mahasiswa("24162461451", "Kelvin Abadi", 3.5);

        // Memanggil prosedur tanpa parameter
        m1.tampilData();

        // Memanggil fungsi dengan parameter
        String hasil = m1.predikat(m1.ipk);
        System.out.println("Predikat : " + hasil);

        // Memanggil prosedur dengan parameter
        m1.tambahNilai(0.12);
        System.out.println("Predikat Baru : " + m1.predikat(m1.ipk));
    }
}
