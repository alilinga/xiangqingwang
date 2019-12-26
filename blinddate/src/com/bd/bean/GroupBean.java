package com.bd.bean;

public class GroupBean {
	private String g_id;
	private String g_name;
	private String g_classify;
	private String g_descrip;
	public GroupBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GroupBean(String g_id, String g_name, String g_classify, String g_descrip) {
		super();
		this.g_id = g_id;
		this.g_name = g_name;
		this.g_classify = g_classify;
		this.g_descrip = g_descrip;
	}
	public String getG_id() {
		return g_id;
	}
	public void setG_id(String g_id) {
		this.g_id = g_id;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getG_classify() {
		return g_classify;
	}
	public void setG_classify(String g_classify) {
		this.g_classify = g_classify;
	}
	public String getG_descrip() {
		return g_descrip;
	}
	public void setG_descrip(String g_descrip) {
		this.g_descrip = g_descrip;
	}
	@Override
	public String toString() {
		return "GroupBean [g_id=" + g_id + ", g_name=" + g_name + ", g_classify=" + g_classify + ", g_descrip="
				+ g_descrip + "]";
	}
	
}
