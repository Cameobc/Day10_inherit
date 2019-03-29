package com.sesung.zoo;

public class Tazo extends Birds{
	private int egg;

	public Tazo(){
//		super();  //부모클래스의 생성자를 호출함. 셍략되는 부분. 객체를 만들기 위해서는 생성자를 호출해야함.
	
	}
	public Tazo(int egg) {
		this.egg=egg;
		this.getAge();
		super.getAge(); //부모의 getAge를 가리키며 딱히 쓸 일은 없음.
	}
	
	@Override
	public void fly() {
		System.out.println("파닥파닥");
		
	}
	
	@Override
	public void eat() {
		System.out.println("춉춉춉");
		
	}

}
