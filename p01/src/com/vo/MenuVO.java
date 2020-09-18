package com.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class MenuVO {

	private int menu_code;
	private String name;
	private int price;
	private int stock;
	private String img1;
	private String img2;
	private String img3;
	private String category;
	private Date regdate;
	MultipartFile mf;
	



public MenuVO() {}




public MenuVO(int menu_code, String name, int price, int stock, String img1, String img2, String img3,
		String category) {
	super();
	this.menu_code = menu_code;
	this.name = name;
	this.price = price;
	this.stock = stock;
	this.img1 = img1;
	this.img2 = img2;
	this.img3 = img3;
	this.category = category;
}


public MenuVO(int menu_code, String name, int price, int stock, String img1, String category) {
	super();
	this.menu_code = menu_code;
	this.name = name;
	this.price = price;
	this.stock = stock;
	this.img1 = img1;
	this.category = category;
}




public MenuVO(int menu_code, String name, int price, int stock, String img1, String img2, String img3, String category,
		Date regdate, MultipartFile mf) {
	this.menu_code = menu_code;
	this.name = name;
	this.price = price;
	this.stock = stock;
	this.img1 = img1;
	this.img2 = img2;
	this.img3 = img3;
	this.category = category;
	this.regdate = regdate;
	this.mf = mf;
}




public MenuVO(int menu_code, String name, int price, int stock, String img1, String img2, String img3, String category,
		MultipartFile mf) {
	this.menu_code = menu_code;
	this.name = name;
	this.price = price;
	this.stock = stock;
	this.img1 = img1;
	this.img2 = img2;
	this.img3 = img3;
	this.category = category;
	this.mf = mf;
}




public MenuVO(int menu_code, String name, int price, int stock, String img1, String img2, String img3, String category,
		Date regdate) {
	this.menu_code = menu_code;
	this.name = name;
	this.price = price;
	this.stock = stock;
	this.img1 = img1;
	this.img2 = img2;
	this.img3 = img3;
	this.category = category;
	this.regdate = regdate;
}




public MenuVO(int menu_code, String name, int price, int stock, String img2, String img3, String category, Date regdate,
		MultipartFile mf) {
	this.menu_code = menu_code;
	this.name = name;
	this.price = price;
	this.stock = stock;
	this.img2 = img2;
	this.img3 = img3;
	this.category = category;
	this.regdate = regdate;
	this.mf = mf;
}




public int getMenu_code() {
	return menu_code;
}




public void setMenu_code(int menu_code) {
	this.menu_code = menu_code;
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




public int getStock() {
	return stock;
}




public void setStock(int stock) {
	this.stock = stock;
}




public String getImg1() {
	return img1;
}




public void setImg1(String img1) {
	this.img1 = img1;
}




public String getImg2() {
	return img2;
}




public void setImg2(String img2) {
	this.img2 = img2;
}




public String getImg3() {
	return img3;
}




public void setImg3(String img3) {
	this.img3 = img3;
}




public String getCategory() {
	return category;
}




public void setCategory(String category) {
	this.category = category;
}




public Date getRegdate() {
	return regdate;
}




public void setRegdate(Date regdate) {
	this.regdate = regdate;
}




public MultipartFile getMf() {
	return mf;
}




public void setMf(MultipartFile mf) {
	this.mf = mf;
}




@Override
public String toString() {
	return "MenuVO [menu_code=" + menu_code + ", name=" + name + ", price=" + price + ", stock=" + stock + ", img1="
			+ img1 + ", img2=" + img2 + ", img3=" + img3 + ", category=" + category + ", regdate=" + regdate + ", mf="
			+ mf + "]";
}



}
