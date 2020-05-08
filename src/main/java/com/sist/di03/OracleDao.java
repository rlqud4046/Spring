package com.sist.di03;

public class OracleDao implements Dao {

	@Override
	public void add() {
		System.out.println("OracleDao 수행~~~");
	}

	public OracleDao() {
		System.out.println("OracleDao 생성자");
	}
}
