package com.ksnx3684.s2.util.collection;

import java.util.ArrayList;

public class ListStudy {
	
	public void study3() {
		// generic
		// ArrayList<E> 변수명 = new ArrayList<E>();
		// E => Integer
		ArrayList<Integer> ar2 = new ArrayList<>();
		// add(E e)
		ArrayList<String> ar3 = new ArrayList<>();
		ar3.add("");
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(1);
		ar.add('b');
		ar.add(3.12);
		ar.add("iu");
		
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//Object obj = 1;
		//int n = (Integer)obj;
		int num = (int)ar.get(0); // 형변환 필요
		String name = (String)ar.get(3);
		
	}
	
	public void study2() {
		
		ArrayList ar = new ArrayList();
		int num = 1;
		Integer n = num; // AutoBoxing
		ar.add(n); // 가능
		ar.add(1); // 원래는 primitive타입은 넣을 수 없으나 내부적으로 AutoBoxing을 했기 때문에 가능
		
		ar.add('a'); // AutoBoxing
		
		ar.add(3.12); // AutoBoxing
		
		ar.add("name"); // reference타입(Object)이라서 원래 가능. 다형성
		
		String k = "이병훈"; // String is a Object
		Object obj = k; // 다형성
		
	}

	public void study1() {
		int[] numbers = new int[2];
		ArrayList ar = new ArrayList(); // 기본 10칸
		
		numbers[0] = 1;
		numbers[1] = 2;
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(1, 100); // 1번 인덱스에 100 삽입
		ar.set(0, 2000); // 2000으로 수정
		ar.remove(0); // 0번 인덱스 삭제
		ar.clear();
		
		System.out.println(numbers[0]);
		// System.out.println(ar.get(0));
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("List 출력");
		for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
	}
}
