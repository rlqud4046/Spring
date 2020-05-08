package com.sist.di01;

public class AA {
	public static void main(String[] args) {
		BB bb = new BB();
		bb.print();

		GetSum getSum = new GetSum();
//		getSum.setNum1(200);
//		getSum.setNum2(100);
		getSum.sum(200, 100);

	}
}
