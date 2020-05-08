package com.sist.di12;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main_spring {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:process.xml");
		MyProcess process = ctx.getBean("process",MyProcess.class);
		process.print();
		
		ctx.close();
		
	}

}
