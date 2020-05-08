package com.sist.di03;

public class MySqlDao implements Dao {

	@Override
	public void add() {
		System.out.println("MySqlDao 수행~~~");
	}
	
	public MySqlDao() {
		System.out.println("MySqlDao 생성자");
	}

}
