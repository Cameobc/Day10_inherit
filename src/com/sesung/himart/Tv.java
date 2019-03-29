package com.sesung.himart;

public class Tv extends Electronic{
	private int inch;
	
	public Tv() {
		this.inch=100;
		this.setBrand("LG");
		this.setColor("Black");
		this.setPrice(200);
		this.setPoint(20);
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}


	



}
