package com.vo;

import java.sql.Date;

public class CartVO {
	private int cart_code;
	private String customer_id;
	private int menu_code;
    private int cart_stock;
	private Date regdate;
	private String menu_name;
	private int menu_price;
	
	
	
	public CartVO() {}


	public CartVO(int cart_code, String customer_id, int menu_code, int cart_stock, Date regdate) {
		super();
		this.cart_code = cart_code;
		this.customer_id = customer_id;
		this.menu_code = menu_code;
		this.cart_stock = cart_stock;
		this.regdate = regdate;
	}


	public CartVO(int cart_code, String customer_id, int menu_code, int cart_stock, Date regdate, String menu_name,
			int menu_price) {
		super();
		this.cart_code = cart_code;
		this.customer_id = customer_id;
		this.menu_code = menu_code;
		this.cart_stock = cart_stock;
		this.regdate = regdate;
		this.menu_name = menu_name;
		this.menu_price = menu_price;
	}


	public int getCart_code() {
		return cart_code;
	}


	public void setCart_code(int cart_code) {
		this.cart_code = cart_code;
	}


	public String getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}


	public int getMenu_code() {
		return menu_code;
	}


	public void setMenu_code(int menu_code) {
		this.menu_code = menu_code;
	}


	public int getCart_stock() {
		return cart_stock;
	}


	public void setCart_stock(int cart_stock) {
		this.cart_stock = cart_stock;
	}


	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	public String getMenu_name() {
		return menu_name;
	}


	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}


	public int getMenu_price() {
		return menu_price;
	}


	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}


	@Override
	public String toString() {
		return "CartVO [cart_code=" + cart_code + ", customer_id=" + customer_id + ", menu_code=" + menu_code
				+ ", cart_stock=" + cart_stock + ", regdate=" + regdate + ", menu_name=" + menu_name + ", menu_price="
				+ menu_price + "]";
	}


	



	

	
	
	
	
	
}
