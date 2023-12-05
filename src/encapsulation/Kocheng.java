/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author xviil
 */
public class Kocheng extends Hewan {
    
	private String warna;

	public Kocheng(boolean veg, String food, int legs) {
		super(veg, food, legs);
		this.warna="putih";
	}

	public Kocheng(boolean veg, String food, int legs, String color){
		super(veg, food, legs);
		this.warna=color;
	}

	public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}
}
