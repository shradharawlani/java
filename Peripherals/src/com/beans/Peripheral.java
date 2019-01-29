package com.beans;

public class Peripheral implements Comparable<Peripheral> {
	private String itemCode;
	private String name;
	public Peripheral(String itemCode, String name, String description,
			int price, int quantity) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	private String description;
	private int price, quantity;
	
	public Peripheral() { /* does nothing */ }

	public String getItemCode() { return itemCode; }
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getDescription() { return description; }
	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }

	public int getQuantity() { return quantity; }
	public void setQuantity(int quantity) { this.quantity = quantity; }
	public String toString()
	{
		return String.format("Peripheral[%s,%s,%s,%d,%d]",getItemCode(),getName(),getDescription(),getPrice(),getQuantity());

	}

	@Override
	public int compareTo(Peripheral p) {
		// TODO Auto-generated method stub
		return getPrice()-p.getPrice();
	}

	
}
