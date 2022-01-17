package com.ksnx3684.s4.exception;

public class ChildException extends Exception { // 예외 클래스를 선언하고 Exception 클래스 상속

	public ChildException() { // 기본생성자 (없어도 됨)
		super();
	}
		
	public ChildException(String message) { // 매개변수를 받는 생성자
		super(message); // 부모 생성자에 message
	}
}
