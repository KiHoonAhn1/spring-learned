package com.vo;

import java.sql.Date;

public class OrderListVO {
	private int list_code;
	private int menu_code;
	private int order_code;
	private int total;
	private int quantity;
	private String menu_name;
	private int menu_price;
	
	
	
	public OrderListVO() {}



	public OrderListVO(int list_code, int menu_code, int order_code, int total, int quantity, String menu_name,
			int menu_price) {
		super();
		this.list_code = list_code;
		this.menu_code = menu_code;
		this.order_code = order_code;
		this.total = total;
		this.quantity = quantity;
		this.menu_name = menu_name;
		this.menu_price = menu_price;
	}



	public OrderListVO(int list_code, int menu_code, int order_code, int total, int quantity) {
		super();
		this.list_code = list_code;
		this.menu_code = menu_code;
		this.order_code = order_code;
		this.total = total;
		this.quantity = quantity;
	}



	public int getList_code() {
		return list_code;
	}



	public void setList_code(int list_code) {
		this.list_code = list_code;
	}



	public int getMenu_code() {
		return menu_code;
	}



	public void setMenu_code(int menu_code) {
		this.menu_code = menu_code;
	}



	public int getOrder_code() {
		return order_code;
	}



	public void setOrder_code(int order_code) {
		this.order_code = order_code;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
		return "OrderListVO [list_code=" + list_code + ", menu_code=" + menu_code + ", order_code=" + order_code
				+ ", total=" + total + ", quantity=" + quantity + ", menu_name=" + menu_name + ", menu_price="
				+ menu_price + "]";
	}






	


	

	
	
	
	
	
	
}
