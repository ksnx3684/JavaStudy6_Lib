package com.ksnx3684.s4.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 10;
		int result = 0;
		
		try {
			result = num2 / num1;
		} catch(Exception exception) { // 대부분 이런식으로 작성하고 대부분의 예외를 잡을 수는 있으나 세부적인 컨트롤 작성은 어려움
			
			exception.printStackTrace(); // 예외처리된 오류 출력
			System.out.println("예외발생");
		}
		System.out.println(result);
	}

}
