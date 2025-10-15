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
public class mahasiswa {
    String nim = "";
    String nama = "";
    double ipk = 0;
    String predikat = "";
    
    //konstruktor
    public mahasiswa(String nim , String nama , double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
    
    void tampilData() {
            System.out.println("Nim  : "+nim);
            System.out.println("Nama : "+nama);
            System.out.println("IPK  : "+ipk);
    }
    
    //Tipe data dengan parameter fungsi
    String predikat (double ipk){
        String hasilPredikat;
        
        if (ipk>= 3.5){
            predikat = "Cumlaude";
        }
        else if (ipk>= 3.25){
            predikat = "Sangat Memuaskan";
        }
        else if (ipk>= 3.00){
            predikat = "Memuaskan";
        }
        else {
            predikat = "Cukup";
        }
        return predikat ;
    }
    
    //Prosedur dengan parameter
    void tambahNilai (double ipkBaru){
        ipk += ipkBaru;
        System.out.println("IPK setelah ditambahkan menjadi: "+ ipk);
    }
}
