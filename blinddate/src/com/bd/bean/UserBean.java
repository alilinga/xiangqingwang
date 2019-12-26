package com.bd.bean;

public class UserBean {
	private String u_id;
	private String u_password;
	private String u_name;
	private String u_phone;
	private String u_email;
	private String u_sex;
	private String u_birth;
	private String u_workadd;
	private String u_marrystate;
	private String u_height;
	private String u_school;
	private String u_monthincome;
	private String u_head;
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBean(String u_id, String u_password, String u_name, String u_phone, String u_email, String u_sex,
			String u_birth, String u_workadd, String u_marrystate, String u_height, String u_school,
			String u_monthincome, String u_head) {
		super();
		this.u_id = u_id;
		this.u_password = u_password;
		this.u_name = u_name;
		this.u_phone = u_phone;
		this.u_email = u_email;
		this.u_sex = u_sex;
		this.u_birth = u_birth;
		this.u_workadd = u_workadd;
		this.u_marrystate = u_marrystate;
		this.u_height = u_height;
		this.u_school = u_school;
		this.u_monthincome = u_monthincome;
		this.u_head = u_head;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public String getU_sex() {
		return u_sex;
	}
	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}
	public String getU_birth() {
		return u_birth;
	}
	public void setU_birth(String u_birth) {
		this.u_birth = u_birth;
	}
	public String getU_workadd() {
		return u_workadd;
	}
	public void setU_workadd(String u_workadd) {
		this.u_workadd = u_workadd;
	}
	public String getU_marrystate() {
		return u_marrystate;
	}
	public void setU_marrystate(String u_marrystate) {
		this.u_marrystate = u_marrystate;
	}
	public String getU_height() {
		return u_height;
	}
	public void setU_height(String u_height) {
		this.u_height = u_height;
	}
	public String getU_school() {
		return u_school;
	}
	public void setU_school(String u_school) {
		this.u_school = u_school;
	}
	public String getU_monthincome() {
		return u_monthincome;
	}
	public void setU_monthincome(String u_monthincome) {
		this.u_monthincome = u_monthincome;
	}
	public String getU_head() {
		return u_head;
	}
	public void setU_head(String u_head) {
		this.u_head = u_head;
	}
	@Override
	public String toString() {
		return "UserBean [u_id=" + u_id + ", u_password=" + u_password + ", u_name=" + u_name + ", u_phone=" + u_phone
				+ ", u_email=" + u_email + ", u_sex=" + u_sex + ", u_birth=" + u_birth + ", u_workadd=" + u_workadd
				+ ", u_marrystate=" + u_marrystate + ", u_height=" + u_height + ", u_school=" + u_school
				+ ", u_monthincome=" + u_monthincome + ", u_head=" + u_head + "]";
	}
	
	
}
