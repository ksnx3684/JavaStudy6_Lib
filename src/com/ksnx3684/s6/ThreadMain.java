package com.ksnx3684.s6;

public class ThreadMain {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start(); // run 메서드를 사용자가 직접 호출하는 것이 아닌 운영체제한테 호출을 위임시킨다.
		t2.start(); // 실행은 운영체제가 임의로 번갈아가며 호출하는 식으로 이루어진다.

	}

}
