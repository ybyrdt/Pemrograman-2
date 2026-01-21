/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_4_modifier;
/**
 *
 * @author radit
 */
public class mahasiswa {
    public String nim = "";
    public String nama = "";
    public double ipk = 0;
    public String predikat = "";
    
    //konstruktor
    public mahasiswa(String nim , String nama , double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
    
    public void tampilData() {
            System.out.println("Nim  : "+nim);
            System.out.println("Nama : "+nama);
            System.out.println("IPK  : "+ipk);
    }
    
    //Tipe data dengan parameter fungsi
    public String predikat (double ipk){
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
    public void tambahNilai (double ipkBaru){
        ipk += ipkBaru;
        System.out.println("IPK setelah ditambahkan menjadi: "+ ipk);
    }
}
