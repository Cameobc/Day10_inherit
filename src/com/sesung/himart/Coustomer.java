package com.sesung.himart;

public class Coustomer {
	private int price;
	private int point;
	
	public Coustomer() {
		this.price=1000;
		this.point=0;
	}

	//buy, 매개변수 1개
	//계산 후 잔액과 포인트 출력
	public void buy(Electronic electronic) {
		price = price-electronic.getPrice();
		System.out.println("현재 잔액 : "+price);
		point = point+electronic.getPoint();
		System.out.println("현재 포인트 : "+point);
	}
	
//	public void buy(Computer computer) {
//		price = price-computer.getPrice();
//		System.out.println("현재 잔액 : "+price);
//		point = point+computer.getPoint();
//		System.out.println("현재 포인트 : "+point);
//	}
//	
//	public void buy(Handphone handphone) {
//		price = price-handphone.getPrice();
//		System.out.println("현재 잔액 : "+price);
//		point = point+handphone.getPoint();
//		System.out.println("현재 포인트 : "+point);
//
//	}
}
