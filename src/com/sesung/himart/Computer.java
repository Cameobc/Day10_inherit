package com.sesung.himart;

public class Computer extends Electronic{
	private String cpu;
	private int cc;
	
	public Computer() {
		this.cc=250;
		this.cpu="intel i7";
		this.setBrand("LG");
		this.setColor("White");
		this.setPrice(150);
		this.setPoint(15);
	}
	
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}

	

}
