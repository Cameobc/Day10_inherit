package com.sesung.himart;

public class HimartMain {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer computer = new Computer();
		Handphone handphone = new Handphone();
		HimartView vi = new HimartView();
		Coustomer su = new Coustomer();
		Electronic p = tv;
		
		System.out.println(((Tv)p).getInch());
		
		p = new Electronic();
		System.out.println(((Tv)p).getInch());
		
		System.out.println(p.getBrand());
		System.out.println(p.getPrice());
		su.buy(handphone);
		su.buy(computer);
		su.buy(tv);

//		Tv [] tvs = new Tv[3];
//		tvs[0] = new Tv();
//		tvs[1] = new Tv();
//		tvs[2] = new Tv();
//		
//		vi.view(computer);
//		vi.view(handphone);
//		vi.view(tv);
//		vi.view(tvs);
//		su.buy(tv);
//		su.buy(computer);
//		su.buy(handphone);
//	
	}

}
