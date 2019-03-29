package com.sesung.himart;

public class HimartView {
	//오버로딩

	public void view(Electronic electronic) {
		System.out.println("Brand : "+ electronic.getBrand());
		System.out.println("Color : "+ electronic.getColor());
		System.out.println("Price : "+ electronic.getPrice());
		System.out.println("Point : " + electronic.getPoint());
		System.out.println("=========================");
		
		if(electronic instanceof Tv) {
			Tv tv=(Tv)electronic;
			System.out.println(tv.getInch());
		}else if(electronic instanceof Computer) {
			Computer computer = (Computer)electronic;
		}else {
			Handphone handphone = (Handphone)electronic;
		}
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
