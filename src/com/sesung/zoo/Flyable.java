package com.sesung.zoo;

public interface Flyable {
	//접근지정자는 public static final 이 들어가야함
	//생략시엔 자동으로 만들어 준다. 
	//상수
	public static final int NUM=10;
	int NUMBER=20;  
	
	//추상메서드만 입력 가능
	//public abstract  무조건 들어가야함.
	//셍략시엔 자동으로 만들어준다.
	public abstract void fly();

}
