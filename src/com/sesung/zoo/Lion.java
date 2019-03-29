package com.sesung.zoo;

public class Lion extends Animal {
	private int tooth;
	
	public Lion() {
		// TODO Auto-generated constructor stub
	}
	public int getTooth() {
		return tooth;
	}

	public void setTooth(int tooth) {
		this.tooth = tooth;
	}
	
	public void eat() {
		//오버라이딩
//		super.eat();  //부모클래스
		System.out.println("찹찹찹");
	}
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
//		Animal animal=new Animal(); // 실체화되지 않는 객체는 원래는 만들면 안되기 때문에 추상 클래스로 강제함.

	}

}
