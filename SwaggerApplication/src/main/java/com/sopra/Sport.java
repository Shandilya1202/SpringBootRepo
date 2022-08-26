package com.sopra;

public class Sport {
	
	private int id;
	private String name;
	private String noofPlayer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNoofPlayer() {
		return noofPlayer;
	}
	public void setNoofPlayer(String noofPlayer) {
		this.noofPlayer = noofPlayer;
	}
	@Override
	public String toString() {
		return "Sport [id=" + id + ", name=" + name + ", noofPlayer=" + noofPlayer + "]";
	}
	public Sport(int id, String name, String noofPlayer) {
		super();
		this.id = id;
		this.name = name;
		this.noofPlayer = noofPlayer;
	}
	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
