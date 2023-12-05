/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author xviil
 */
public class Hewan {
    
	private boolean vegetarian;

	private String makan;

	private int banyakKaki;

	public Hewan(){}

	public Hewan(boolean veg, String food, int legs){
		this.vegetarian = veg;
		this.makan = food;
		this.banyakKaki = legs;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getMakan() {
		return makan;
	}

	public void setMakan(String makan) {
		this.makan = makan;
	}

	public int getBanyakKaki() {
		return banyakKaki;
	}

	public void setBanyakKaki(int banyakKaki) {
		this.banyakKaki = banyakKaki;
	}
    
}
