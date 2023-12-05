/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author xviil
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kocheng kocheng = new Kocheng(false, "ikan", 4, "hitam");

		System.out.println("Apakah kocheng Vegetarian? " + kocheng.isVegetarian());
		System.out.println("Kocheng makan " + kocheng.getMakan());
		System.out.println("Kocheng punya " + kocheng.getBanyakKaki() + " kaki.");
		System.out.println("Warna kochengnya " + kocheng.getWarna());
    }
    
}
