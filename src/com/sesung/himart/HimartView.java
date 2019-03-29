package com.sesung.himart;

public class HimartView {
	//오버로딩

	public void view(Tv tv) {
		System.out.println("Brand : "+ tv.getBrand());
		System.out.println("Color : "+ tv.getColor());
		System.out.println("Inch : "+ tv.getInch());
		System.out.println("Price : "+ tv.getPrice());
		System.out.println("Point : " + tv.getPoint());
		System.out.println("=========================");
	}

	public void view(Handphone handphone) {
		System.out.println("Name : "+ handphone.getName());
		System.out.println("Brand : "+ handphone.getBrand());
		System.out.println("Color : "+ handphone.getColor());
		System.out.println("Inch : "+ handphone.getInch());
		System.out.println("Price : "+ handphone.getPrice());
		System.out.println("Point : " + handphone.getPoint());
		System.out.println("=========================");
	}

	public void view(Computer computer) {
		System.out.println("Brand : "+ computer.getBrand());
		System.out.println("용     량 : "+computer.getCc());
		System.out.println("Cpu : " + computer.getCc());
		System.out.println("Color : "+ computer.getColor());
		System.out.println("Price : "+ computer.getPrice());
		System.out.println("Point : " + computer.getPoint());
		System.out.println("=========================");
	}

	public void view(Tv [] tvs) {
		for(int i =0; i<tvs.length; i++) {
			System.out.println("Brand : "+ tvs[i].getBrand());
			System.out.println("Color : "+ tvs[i].getColor());
			System.out.println("Inch : "+ tvs[i].getInch());
			System.out.println("Price : "+ tvs[i].getPrice());
			System.out.println("Point : " + tvs[i].getPoint());
			System.out.println("=========================");
		}
	}

}
