package com.bd.bean;

public class DetailsInfoBean {
	private String u_id;
	private String d_nativeplace;
	private String d_weight;
	private String d_bodytype;
	private String d_constellation;
	private String d_nation;
	private String d_havachild;
	private String d_wantchild;
	private String d_marry;
	public DetailsInfoBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetailsInfoBean(String u_id, String d_nativeplace, String d_weight, String d_bodytype,
			String d_constellation, String d_nation, String d_havachild, String d_wantchild, String d_marry) {
		super();
		this.u_id = u_id;
		this.d_nativeplace = d_nativeplace;
		this.d_weight = d_weight;
		this.d_bodytype = d_bodytype;
		this.d_constellation = d_constellation;
		this.d_nation = d_nation;
		this.d_havachild = d_havachild;
		this.d_wantchild = d_wantchild;
		this.d_marry = d_marry;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getD_nativeplace() {
		return d_nativeplace;
	}
	public void setD_nativeplace(String d_nativeplace) {
		this.d_nativeplace = d_nativeplace;
	}
	public String getD_weight() {
		return d_weight;
	}
	public void setD_weight(String d_weight) {
		this.d_weight = d_weight;
	}
	public String getD_bodytype() {
		return d_bodytype;
	}
	public void setD_bodytype(String d_bodytype) {
		this.d_bodytype = d_bodytype;
	}
	public String getD_constellation() {
		return d_constellation;
	}
	public void setD_constellation(String d_constellation) {
		this.d_constellation = d_constellation;
	}
	public String getD_nation() {
		return d_nation;
	}
	public void setD_nation(String d_nation) {
		this.d_nation = d_nation;
	}
	public String getD_havachild() {
		return d_havachild;
	}
	public void setD_havachild(String d_havachild) {
		this.d_havachild = d_havachild;
	}
	public String getD_wantchild() {
		return d_wantchild;
	}
	public void setD_wantchild(String d_wantchild) {
		this.d_wantchild = d_wantchild;
	}
	public String getD_marry() {
		return d_marry;
	}
	public void setD_marry(String d_marry) {
		this.d_marry = d_marry;
	}
	@Override
	public String toString() {
		return "DetailsInfoBean [u_id=" + u_id + ", d_nativeplace=" + d_nativeplace + ", d_weight=" + d_weight
				+ ", d_bodytype=" + d_bodytype + ", d_constellation=" + d_constellation + ", d_nation=" + d_nation
				+ ", d_havachild=" + d_havachild + ", d_wantchild=" + d_wantchild + ", d_marry=" + d_marry + "]";
	}
	
}
