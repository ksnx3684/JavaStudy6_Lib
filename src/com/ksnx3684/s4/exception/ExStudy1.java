package com.ksnx3684.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExStudy1 {
	
	public void ex1() throws InputMismatchException, ArithmeticException, Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력");
		int num1 = sc.nextInt();
		// throw new InputMismatchException();
		int num2 = 10;
		
		int num3 = num2 / num1;
		// throw new ArithMathicException();
		System.out.println(num3);
		
	}
}
