package com.sesung.quiz;

public class God {  //java 싱글톤   https://blog.naver.com/emoney01/221426997962
	private static final God god = new God();

	private God() {}

	public void say() {
		System.out.println("Today is Friday!");
	}

	public static God get() {
		return god;
	}

}
