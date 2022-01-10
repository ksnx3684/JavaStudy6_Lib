package com.ksnx3684.s1.lang.object;

public class ObjectStudy1 {
	
	// 생성자가 없으면 컴파일러가 기본생성자를 만든다.
	// 기본생성자 : 매개변수가 없는 생성자

	public void study1() {
		System.out.println("Study1 실행");
		
		// Object 객체를 생성하고 주소출력
		// 참조변수명.멤버메서드명
		Object object = new Object();
		System.out.println(object);
		
		int num = object.hashCode();
		System.out.println(num);
		
		
		String a = object.toString();
		System.out.println(a);
	}
	
}
