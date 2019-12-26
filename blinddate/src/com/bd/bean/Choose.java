package com.bd.bean;

public class Choose {
	private String u_id;
	private String c_age;
	private String c_height;
	private String c_income;
	private String c_education;
	private String c_marrystatus;
	private String c_bodytype;
	private String c_jobcity;
	private String c_havechild;
	private String c_wantchild;
	private String c_smoke;
	private String c_drink;
	private String c_havephoto;
	
	public Choose() {
		// TODO Auto-generated constructor stub
	}

	public Choose(String u_id, String c_age, String c_height, String c_income, String c_education, String c_marrystatus,
			String c_bodytype, String c_jobcity, String c_havechild, String c_wantchild, String c_smoke, String c_drink,
			String c_havephoto) {
		super();
		this.u_id = u_id;
		this.c_age = c_age;
		this.c_height = c_height;
		this.c_income = c_income;
		this.c_education = c_education;
		this.c_marrystatus = c_marrystatus;
		this.c_bodytype = c_bodytype;
		this.c_jobcity = c_jobcity;
		this.c_havechild = c_havechild;
		this.c_wantchild = c_wantchild;
		this.c_smoke = c_smoke;
		this.c_drink = c_drink;
		this.c_havephoto = c_havephoto;
	}

	public String getU_id() {
		return u_id;
	}

	public String getC_age() {
		return c_age;
	}

	public String getC_height() {
		return c_height;
	}

	public String getC_income() {
		return c_income;
	}

	public String getC_education() {
		return c_education;
	}

	public String getC_marrystatus() {
		return c_marrystatus;
	}

	public String getC_bodytype() {
		return c_bodytype;
	}

	public String getC_jobcity() {
		return c_jobcity;
	}

	public String getC_havechild() {
		return c_havechild;
	}

	public String getC_wantchild() {
		return c_wantchild;
	}

	public String getC_smoke() {
		return c_smoke;
	}

	public String getC_drink() {
		return c_drink;
	}

	public String getC_havephoto() {
		return c_havephoto;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public void setC_age(String c_age) {
		this.c_age = c_age;
	}

	public void setC_height(String c_height) {
		this.c_height = c_height;
	}

	public void setC_income(String c_income) {
		this.c_income = c_income;
	}

	public void setC_education(String c_education) {
		this.c_education = c_education;
	}

	public void setC_marrystatus(String c_marrystatus) {
		this.c_marrystatus = c_marrystatus;
	}

	public void setC_bodytype(String c_bodytype) {
		this.c_bodytype = c_bodytype;
	}

	public void setC_jobcity(String c_jobcity) {
		this.c_jobcity = c_jobcity;
	}

	public void setC_havechild(String c_havechild) {
		this.c_havechild = c_havechild;
	}

	public void setC_wantchild(String c_wantchild) {
		this.c_wantchild = c_wantchild;
	}

	public void setC_smoke(String c_smoke) {
		this.c_smoke = c_smoke;
	}

	public void setC_drink(String c_drink) {
		this.c_drink = c_drink;
	}

	public void setC_havephoto(String c_havephoto) {
		this.c_havephoto = c_havephoto;
	}

	@Override
	public String toString() {
		return "Choose [u_id=" + u_id + ", c_age=" + c_age + ", c_height=" + c_height + ", c_income=" + c_income
				+ ", c_education=" + c_education + ", c_marrystatus=" + c_marrystatus + ", c_bodytype=" + c_bodytype
				+ ", c_jobcity=" + c_jobcity + ", c_havechild=" + c_havechild + ", c_wantchild=" + c_wantchild
				+ ", c_smoke=" + c_smoke + ", c_drink=" + c_drink + ", c_havephoto=" + c_havephoto + "]";
	}
}
