package com.sist.di02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * DI 를 어떻게 할 것인지는 xml 문서에 기입되어 있음
		 * 스프링 컨테이너인 ctx가 classpath:exam.xml 을 보고 DI를 수행
		 * exam.xml 파일은 resources 폴더에 있어야 한다.
		 */
		
		// DI 작업을 해주는 스프링 컨테이너
		// 스프링 컨테이너 객체를 생성한다
		// xml 파일을 이용해서 스프링 컨테이너 객체가 생성된다 => 메모리로 로딩된다
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:exam.xml");
		
		// 실제적으로 주입과정이 진행됨
		// new 라는 키워드를 사용하지 않고 직접 스프링 컨테이너에서 꺼내서 사용한다.
		ExamDAO dao = ctx.getBean("daoImpl", ExamDAOImpl.class);
		dao.printMsg();
		ctx.close();

	}

}
