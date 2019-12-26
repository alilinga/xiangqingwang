package com.bd.bean;

public class GroupItemBean {
	private String gi_id;
	private String g_id;
	private String u_id;
	public GroupItemBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GroupItemBean(String gi_id, String g_id, String u_id) {
		super();
		this.gi_id = gi_id;
		this.g_id = g_id;
		this.u_id = u_id;
	}
	public String getGi_id() {
		return gi_id;
	}
	public void setGi_id(String gi_id) {
		this.gi_id = gi_id;
	}
	public String getG_id() {
		return g_id;
	}
	public void setG_id(String g_id) {
		this.g_id = g_id;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	@Override
	public String toString() {
		return "GroupItemBean [gi_id=" + gi_id + ", g_id=" + g_id + ", u_id=" + u_id + "]";
	}
	
}
