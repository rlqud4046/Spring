package com.sist.di01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		/*
		 * MyGetSum getSum = new MyGetSum(); getSum.setGetsum(new GetSum());
		 * getSum.setA(200); getSum.getB(100); getSum.getGetsum().sum(num1, num2);
		 */
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:getsum.xml");
		MyGetSum getsum = (MyGetSum)ctx.getBean("mySum");
		getsum.sum();
		ctx.close();
		
	}

}
