/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan44.hukumohm;

/**
 *
 * @author RyanJuan
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai() {
    System.out.println("====Hukum Ohm=====");
    System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
    System.out.println("akan berbanding lurus dengan beda ptensial");
    System.out.println("pada ujung-ujung kawat penghantar tersebut");
    System.out.println("asalkan suhu kawat dijaga konstan");
    }
    public Baterai(float kuatArus,float hambatan){
        
    }

    public float getKuatArus() {
        kuatArus = 3;
        return kuatArus;
    }
    public float getHambatan() {
        hambatan = 12;
        return hambatan;
    }
    public float hitungTegangan(){
        float Tegangan = kuatArus*hambatan;
    return Tegangan;
    } 
}
