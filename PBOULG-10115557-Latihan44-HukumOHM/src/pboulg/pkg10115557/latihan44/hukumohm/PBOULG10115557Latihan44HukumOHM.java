/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan44.hukumohm;

/**
 *
 * @author RyanJuan
 * NAMA              : RAYAN
 * KELAS             : PBOULG
 * NIM               : 10115557
 * Deskripsi Program : Menampilkan Program hasil Perhitungan tegangan
 * alur listrik dengan menggunakan Hukum OHM
 */
public class PBOULG10115557Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Baterai Bt = new Baterai();
        System.out.println("");
        System.out.println("Kuat Arus : "+Bt.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+Bt.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+Bt.hitungTegangan()+" volt");
        
    }
}
