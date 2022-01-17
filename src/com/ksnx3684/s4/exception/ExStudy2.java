package com.ksnx3684.s4.exception;

public class ExStudy2 {

	public void ex1() {
		
		// 유치원생 - 2자리수까지 읽기 가능
		int num = 40;
		int num2 = 30;
		int num3 = num + num2;
		int num4 = num2 - num;
		
		try {
		
			if(num3 > 99) { // 예외 조건
				throw new ChildException("3자리수는 몰라요");
			}
			if(num4 < 0) {
				throw new ChildException("음수는 몰라요");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Message : " + e.getMessage());
		}
	}
}
