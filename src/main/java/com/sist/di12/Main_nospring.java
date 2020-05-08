package com.sist.di12;

public class Main_nospring {

	public static void main(String[] args) {
		//MyProcess 객체 생성 - 기본 생성자를 통해 생성
		MyProcess my = new MyProcess();
		my.setName("홍길동");
		my.setAge(27);
		
		my.print();
		
		MyProcess my2 = new MyProcess("유관순", 19);
		my2.print();
	
	}

}
