package com.vo;

import java.sql.Date;

public class OrdersVO {
	private int order_code;
	private String customer_id;
	private int total;
	private Date regdate;
	
	
	
	public OrdersVO() {}


	public OrdersVO(int order_code, String customer_id, int total, Date regdate) {
		super();
		this.order_code = order_code;
		this.customer_id = customer_id;
		this.total = total;
		this.regdate = regdate;
	}


	public int getOrder_code() {
		return order_code;
	}


	public void setOrder_code(int order_code) {
		this.order_code = order_code;
	}


	public String getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "OrderVO [order_code=" + order_code + ", customer_id=" + customer_id + ", total=" + total + ", regdate="
				+ regdate + "]";
	}


	
	
	
	
}
