package com.bd.bean;

public class Inner {
	private String u_id;
	private String i_Inner;
	
	public Inner() {
		// TODO Auto-generated constructor stub
	}

	public Inner(String u_id, String i_Inner) {
		super();
		this.u_id = u_id;
		this.i_Inner = i_Inner;
	}

	public String getU_id() {
		return u_id;
	}

	public String getI_Inner() {
		return i_Inner;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public void setI_Inner(String i_Inner) {
		this.i_Inner = i_Inner;
	}

	@Override
	public String toString() {
		return "Inner [u_id=" + u_id + ", i_Inner=" + i_Inner + "]";
	}
}
