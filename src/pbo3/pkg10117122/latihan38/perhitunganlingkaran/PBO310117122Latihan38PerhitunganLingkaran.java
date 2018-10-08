/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan38.perhitunganlingkaran;

/**
 *
 * @author lenovo
 * NAMA  : Bonaventura Aldino Senda Seni
 * KELAS : IF-3
 * NIM   : 10117122
 * Deskripsi Program : user memasukkan nilai diameter lingkaran sesuai dengan 
 *                     variabel angka, menampilakan jari-jari, luas, dan 
 *                     keliling lingkaran
 */
public class PBO310117122Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculateCircle enNum = new CalculateCircle();

        System.out.println("=======Perhitungan Lingkaran=======");
        enNum.validasiInput();
        enNum.hasilPerhitungan(enNum.diameter);
        
        System.out.println();
        System.out.println("(Developed by : Bonaventura Aldino Senda Seni)");
    }
    
}
