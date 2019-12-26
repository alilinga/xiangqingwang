package com.bd.bean;

import java.util.Date;

public class Dynamic {
	private String d_id;
	private String d_body;
	private String d_mood;
	private String d_sign;
	private Date d_time;
	
	public Dynamic() {
		// TODO Auto-generated constructor stub
	}

	public Dynamic(String d_id, String d_body, String d_mood, String d_sign, Date d_time) {
		super();
		this.d_id = d_id;
		this.d_body = d_body;
		this.d_mood = d_mood;
		this.d_sign = d_sign;
		this.d_time = d_time;
	}

	public String getD_id() {
		return d_id;
	}

	public String getD_body() {
		return d_body;
	}

	public String getD_mood() {
		return d_mood;
	}

	public String getD_sign() {
		return d_sign;
	}

	public Date getD_time() {
		return d_time;
	}

	public void setD_id(String d_id) {
		this.d_id = d_id;
	}

	public void setD_body(String d_body) {
		this.d_body = d_body;
	}

	public void setD_mood(String d_mood) {
		this.d_mood = d_mood;
	}

	public void setD_sign(String d_sign) {
		this.d_sign = d_sign;
	}

	public void setD_time(Date d_time) {
		this.d_time = d_time;
	}

	@Override
	public String toString() {
		return "Dynamic [d_id=" + d_id + ", d_body=" + d_body + ", d_mood=" + d_mood + ", d_sign=" + d_sign
				+ ", d_time=" + d_time + "]";
	}
}
