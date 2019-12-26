package com.bd.bean;

public class WorkLifeBean {
	private String u_id;
	private String w_profession;
	private String w_buyhouse;
	private String w_buycar;
	private String w_smoke;
	private String w_drink;
	public WorkLifeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkLifeBean(String u_id, String w_profession, String w_buyhouse, String w_buycar, String w_smoke,
			String w_drink) {
		super();
		this.u_id = u_id;
		this.w_profession = w_profession;
		this.w_buyhouse = w_buyhouse;
		this.w_buycar = w_buycar;
		this.w_smoke = w_smoke;
		this.w_drink = w_drink;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getW_profession() {
		return w_profession;
	}
	public void setW_profession(String w_profession) {
		this.w_profession = w_profession;
	}
	public String getW_buyhouse() {
		return w_buyhouse;
	}
	public void setW_buyhouse(String w_buyhouse) {
		this.w_buyhouse = w_buyhouse;
	}
	public String getW_buycar() {
		return w_buycar;
	}
	public void setW_buycar(String w_buycar) {
		this.w_buycar = w_buycar;
	}
	public String getW_smoke() {
		return w_smoke;
	}
	public void setW_smoke(String w_smoke) {
		this.w_smoke = w_smoke;
	}
	public String getW_drink() {
		return w_drink;
	}
	public void setW_drink(String w_drink) {
		this.w_drink = w_drink;
	}
	@Override
	public String toString() {
		return "WorkLifeBean [u_id=" + u_id + ", w_profession=" + w_profession + ", w_buyhouse=" + w_buyhouse
				+ ", w_buycar=" + w_buycar + ", w_smoke=" + w_smoke + ", w_drink=" + w_drink + "]";
	}
	
}
