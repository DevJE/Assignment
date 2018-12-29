package ncs4.test3;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Inventory implements Serializable{
	private static final long serialVersionUID = 2676779952090705524L;
	
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getaAmount;
	private int inventoryAmount;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy'��' MM'��' dd'��'");
	
	public Inventory() {}
	
	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
		this.inventoryAmount = putAmount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public int getGetaAmount() {
		return getaAmount;
	}

	public void setGetaAmount(int getaAmount) throws AmountNotEnough{
		this.getaAmount = getaAmount;
		
		if(this.getaAmount > this.putAmount) 
			throw new AmountNotEnough("���� ��� �����մϴ�.");
		else 
			this.inventoryAmount = this.putAmount - this.getaAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		String s = (getaAmount == 0 ? "null" : sdf.format(this.getDate));
	
		return this.productName + ", " + sdf.format(this.putDate) + " �԰�, "  + this.putAmount + "��, "
			+ s + " ���, "	+ this.getaAmount + "��, ��� " + this.inventoryAmount + "��";
	}
	

}
