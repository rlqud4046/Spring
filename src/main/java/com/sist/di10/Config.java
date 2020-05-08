package com.sist.di10;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
DI 설정에서 Java 코드에서 에노테이션을 설정하여 주입하는 방법
@Configuration, @Bean 에노테이션을 사용함

- @Configuration : 클래스 앞에 선언하는 에노테이션.
	해당 클래스는 스프링 설정에 사용되는 클래스입니다. 
- @Bean : 메서드 앞에 사용하는 에노테이션. 
	해당 메서드는 객체를 생성하는데 사용된다는 의미. 

- 에노테이션
	*컴파일러에게 정보를 알려주거나 
	*컴파일 할 때와 설치 시의 작업을 지정하거나
	*실행될 때 별도의 처리가 필요한 경우에 사용된다. 
	
- 에노테이션은 클래스, 메서드, 변수 등 모든 요소에 선언이 가능하다. 
*/
@Configuration
public class Config {

	@Bean
	public Player player1() {
		ArrayList<String> position = new ArrayList<String>();
		position.add("4번타자");
		position.add("1루수");

		Player player = new Player("박병호", 36, position);
		player.setHeight(185);
		player.setWeight(101);

		return player;
	}
	@Bean
	public Player player2() {
		ArrayList<String> position = new ArrayList<String>();
		position.add("9번타자");
		position.add("투수");
		
		Player player = new Player("류현진", 32, position);
		player.setHeight(191);
		player.setWeight(110);
		
		return player;
	}

}
