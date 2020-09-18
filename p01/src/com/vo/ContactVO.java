package com.vo;

import java.sql.Date;

public class ContactVO {
	 private int contact_code;
	 private String id;
	 private String name;
	 private String email;
	 private String subject;
	 private String message;
	 private Date regdate;
	 
	 
	 
	public ContactVO() {
	}

	public ContactVO(int contact_code, String id, String name, String email, String subject, String message,
			Date regdate) {
		this.contact_code = contact_code;
		this.id = id;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.message = message;
		this.regdate = regdate;
	}

	public ContactVO(int contact_code, String id, String subject, Date regdate) {
		this.contact_code = contact_code;
		this.id = id;
		this.subject = subject;
		this.regdate = regdate;
	}

	public ContactVO(int contact_code, String name, String email, String subject, String message) {
		this.contact_code = contact_code;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.message = message;
	}

	
	
	public int getContact_code() {
		return contact_code;
	}

	public void setContact_code(int contact_code) {
		this.contact_code = contact_code;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "ContactVO [contact_code=" + contact_code + ", id=" + id + ", name=" + name + ", email=" + email
				+ ", subject=" + subject + ", message=" + message + ", regdate=" + regdate + "]";
	}
	 
	 
}
