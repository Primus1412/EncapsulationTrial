/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author xviil
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa obj = new Mahasiswa();
        obj.setNama("Nevan Rayyandithya");
        obj.setNim("50420968");
        obj.setAlamat("Depok");
        
        System.out.println("Nama : " + obj.getNama());
        System.out.println("Nim : " + obj.getNim());
        System.out.println("Alamat : " + obj.getAlamat());
    }
}
