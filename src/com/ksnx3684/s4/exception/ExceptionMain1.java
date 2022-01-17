package com.ksnx3684.s4.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하시오");
		int num = 200;
		try {
			int age = sc.nextInt(); // ten
			// throw new InputMismatchException();
			int result = num/age; // 0
			// throw new ArithmeticException();
			
			System.out.println("Age : " + age);
			System.out.println("Result : " + result);
			
		} catch(InputMismatchException exception) {
			System.out.println("숫자만 입력하세요");
		} catch(ArithmeticException exception) { // try catch 구문은 여러개를 사용할 수 있다.
			System.out.println("0으로 나눌 수가 없습니다");
		} catch(Exception exception) { // 예외처리의 다형성
			System.out.println("알수없는 예외 발생");
		} catch(Throwable exception2) {
			System.out.println("모든 예외는 여기서 처리");
		}
	}

}
