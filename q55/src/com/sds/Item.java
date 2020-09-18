package com.sds;

public class Item {
	private String id;
	private String name;
	private int price;
	private String img;
	private int stock;
	
	public Item() {}
	public Item(String id, String name, int price, String img, int stock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.img = img;
		this.stock = stock;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", img=" + img + ", stock=" + stock + "]";
	}
	
}
