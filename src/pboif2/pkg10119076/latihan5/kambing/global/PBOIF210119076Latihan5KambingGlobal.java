/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan5.kambing.global;

/**
 *
 * @author ACER
 * NAMA     : Sulthon Naufal Akmal
 * KELAS    : IF2
 * NIM      : 10119076
 * Deskripsi Program : Kambing Global
 */
public class PBOIF210119076Latihan5KambingGlobal {

    int jumlahKambing = 88;
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
           System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
           jumlahKambing = jumlahKambing + 5;
           System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
           
    }
    public static void main(String[] args) {
       PBOIF210119076Latihan5KambingGlobal kambingSusu = new PBOIF210119076Latihan5KambingGlobal();
       //menampilkan jumlah kambing yang ada saat program pertama x berjalan 
       kambingSusu.getJumlahKambing();
       
       //menambah satu kambing
       kambingSusu.tambahKambing();
       
       //menampilkan jumlah kambing yang ada
       kambingSusu.getJumlahKambing();
    }
    
}
