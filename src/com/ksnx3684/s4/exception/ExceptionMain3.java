package com.ksnx3684.s4.exception;

import java.util.InputMismatchException;

public class ExceptionMain3 {

	public static void main(String[] args) throws InputMismatchException, ArithmeticException, Exception {
		ExStudy1 e1 = new ExStudy1();
		
		try {
			e1.ex1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
