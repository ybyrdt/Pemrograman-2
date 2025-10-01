/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicJava;

/**
 *
 * @author pc16
 */
public class Pertemuan_1 {
     public static void main(String[] args) {
        //data mahasiswa
        String[] nama= {"Susi", "Sahroni", "Fira", "Uus"};
        int[] nilai = {85, 62, 78, 95}; //nilai mahasiswa
        String matkul = "English";
        int kkm = 70; //kkm nilai
        
        for (int i = 0; i < nama.length; i++) {
            String status = (nilai[i] >= kkm) ? "Lulus" : "Tidak Lulus";
            System.out.println("Nama: " + nama[i]);
            System.out.println("Mata Kuliah: " + matkul);
            System.out.println("Nilai: " + nilai[i]);
            System.out.println("Status: " + status);
            System.out.println("----------------------------");
        }
    }
}
