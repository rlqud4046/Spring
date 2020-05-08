package com.sist.di03;

import lombok.Data;

@Data
public class ServiceImpl {
	
	private Dao dao;
	
	public ServiceImpl() {	}
	
	public ServiceImpl(Dao dao) {
		this.dao = dao;
	}
	
	// 비지니스 로직
	public void biz() {
		dao.add();
	}
	
	
}
