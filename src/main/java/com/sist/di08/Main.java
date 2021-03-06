package com.sist.di08;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:map.xml");

		MapTest map = ctx.getBean("test", MapTest.class);
		map.print();
		ctx.close();

	}

}
