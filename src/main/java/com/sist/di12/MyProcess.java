package com.sist.di12;

import lombok.Data;

@Data
public class MyProcess {

	private String name;
	private int age;

	public MyProcess() {
		// TODO Auto-generated constructor stub
	}
	
	public MyProcess(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
