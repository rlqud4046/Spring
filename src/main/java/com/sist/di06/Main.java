package com.sist.di06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:car.xml");
		Car car = ctx.getBean("hyun", HyundaiCar.class);
		car.drive();
		ctx.close();

	}

}
