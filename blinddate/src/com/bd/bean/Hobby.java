package com.bd.bean;

public class Hobby {
	private String u_id;
	private String h_food;
	private String h_person;
	private String h_music;
	private String h_book;
	private String h_thing;
	
	public Hobby() {
		// TODO Auto-generated constructor stub
	}
	
	public Hobby(String u_id, String h_food, String h_person, String h_music, String h_book, String h_thing) {
		super();
		this.u_id = u_id;
		this.h_food = h_food;
		this.h_person = h_person;
		this.h_music = h_music;
		this.h_book = h_book;
		this.h_thing = h_thing;
	}

	public String getU_id() {
		return u_id;
	}

	public String getH_food() {
		return h_food;
	}

	public String getH_person() {
		return h_person;
	}

	public String getH_music() {
		return h_music;
	}

	public String getH_book() {
		return h_book;
	}

	public String getH_thing() {
		return h_thing;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public void setH_food(String h_food) {
		this.h_food = h_food;
	}

	public void setH_person(String h_person) {
		this.h_person = h_person;
	}

	public void setH_music(String h_music) {
		this.h_music = h_music;
	}

	public void setH_book(String h_book) {
		this.h_book = h_book;
	}

	public void setH_thing(String h_thing) {
		this.h_thing = h_thing;
	}

	@Override
	public String toString() {
		return "Hobby [u_id=" + u_id + ", h_food=" + h_food + ", h_person=" + h_person + ", h_music=" + h_music
				+ ", h_book=" + h_book + ", h_thing=" + h_thing + "]";
	}
}
