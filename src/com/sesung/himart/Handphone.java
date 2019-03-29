package com.sesung.himart;

public class Handphone extends Electronic {
	private String name;
	private int inch;
	
	public Handphone() {
		this.name="iPhone 7+";
		this.inch=20;
		this.setBrand("Apple");
		this.setColor("RoseGold");
		this.setPrice(125);
		this.setPoint(12);
	}

	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
