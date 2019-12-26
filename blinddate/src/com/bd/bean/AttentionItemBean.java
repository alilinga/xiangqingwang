package com.bd.bean;

public class AttentionItemBean {
	private String ai_id;
	private String u_id_me;
	private String u_id_others;
	public AttentionItemBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AttentionItemBean(String ai_id, String u_id_me, String u_id_others) {
		super();
		this.ai_id = ai_id;
		this.u_id_me = u_id_me;
		this.u_id_others = u_id_others;
	}
	public String getAi_id() {
		return ai_id;
	}
	public void setAi_id(String ai_id) {
		this.ai_id = ai_id;
	}
	public String getU_id_me() {
		return u_id_me;
	}
	public void setU_id_me(String u_id_me) {
		this.u_id_me = u_id_me;
	}
	public String getU_id_others() {
		return u_id_others;
	}
	public void setU_id_others(String u_id_others) {
		this.u_id_others = u_id_others;
	}
	@Override
	public String toString() {
		return "AttentionItemBean [ai_id=" + ai_id + ", u_id_me=" + u_id_me + ", u_id_others=" + u_id_others + "]";
	}
	
}
