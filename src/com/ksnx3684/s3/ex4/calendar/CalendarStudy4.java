package com.ksnx3684.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		// 현재 시간
		
		// 나의 태어난 날. 년 월 일
		
		// 오늘까지 며칠이 흘렀나
		
		// 나이
		
		Calendar ca = Calendar.getInstance();
		System.out.println("현재 시간");
		System.out.println(ca.getTime());
		
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1995, 2, 12);
		System.out.println("나의 생년월일");
		System.out.println(ca2.getTime());
		
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		long result = l1 - l2;
		
		System.out.println("오늘까지");
		System.out.println(result/1000/60/60/24);
		
		
		
		

	}

}
