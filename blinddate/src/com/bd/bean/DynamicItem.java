package com.bd.bean;

public class DynamicItem {
	private String di_item;
	private String d_id;
	private String u_id;
	private String g_id;
	private int di_dystate; 
	
	public DynamicItem() {
		// TODO Auto-generated constructor stub
	}

	public DynamicItem(String di_item, String d_id, String u_id, String g_id, int di_dystate) {
		super();
		this.di_item = di_item;
		this.d_id = d_id;
		this.u_id = u_id;
		this.g_id = g_id;
		this.di_dystate = di_dystate;
	}

	public String getDi_item() {
		return di_item;
	}

	public String getD_id() {
		return d_id;
	}

	public String getU_id() {
		return u_id;
	}

	public String getG_id() {
		return g_id;
	}

	public int getDi_dystate() {
		return di_dystate;
	}

	public void setDi_item(String di_item) {
		this.di_item = di_item;
	}

	public void setD_id(String d_id) {
		this.d_id = d_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public void setG_id(String g_id) {
		this.g_id = g_id;
	}

	public void setDi_dystate(int di_dystate) {
		this.di_dystate = di_dystate;
	}

	@Override
	public String toString() {
		return "DynamicItem [di_item=" + di_item + ", d_id=" + d_id + ", u_id=" + u_id + ", g_id=" + g_id
				+ ", di_dystate=" + di_dystate + "]";
	}
}
