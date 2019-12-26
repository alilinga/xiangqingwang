package com.bd.bean;

public class Photo {
	private String p_id;
	private String u_id;
	private String p_url;
	private int p_photostate;
	
	public Photo() {
		// TODO Auto-generated constructor stub
	}

	public Photo(String p_id, String u_id, String p_url, int p_photostate) {
		super();
		this.p_id = p_id;
		this.u_id = u_id;
		this.p_url = p_url;
		this.p_photostate = p_photostate;
	}

	public String getP_id() {
		return p_id;
	}

	public String getU_id() {
		return u_id;
	}

	public String getP_url() {
		return p_url;
	}

	public int getP_photostate() {
		return p_photostate;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public void setP_url(String p_url) {
		this.p_url = p_url;
	}

	public void setP_photostate(int p_photostate) {
		this.p_photostate = p_photostate;
	}

	@Override
	public String toString() {
		return "Photo [p_id=" + p_id + ", u_id=" + u_id + ", p_url=" + p_url + ", p_photostate=" + p_photostate + "]";
	}
}
