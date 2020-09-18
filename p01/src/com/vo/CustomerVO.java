package com.vo;

public class CustomerVO {

	 private String id;
	 private String pwd;
	 private String name;
	 private String adress;
	 private int point;
	
	 
	 public CustomerVO() {
		
	}


	public CustomerVO(String id, String pwd, String name, String adress) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.adress = adress;
	}


	public CustomerVO(String id, String pwd, String name, String adress, int point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.adress = adress;
		this.point = point;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", adress=" + adress + ", point=" + point
				+ "]";
	}
	 
	 
	 
}
