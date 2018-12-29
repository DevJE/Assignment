package ncs4.test2; 

import java.io.*;

public class Fruit implements Serializable{
	private static final long serialVersionUID = 1995023356145960067L;
	
	private String name;
	private int price;
	private int quantity;
	
	public Fruit() {}

	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		
		return this.name + "," + this.price + "¿ø, " + this.quantity + "°³";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
