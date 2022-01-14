package com.ksnx3684.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		
		// Calendar는 추상 클래스
		// GregorianCalendar가 Calendar 클래스 상속
		// Calendar의 메서드는 GregorianCalendar에 있다
		
		// 현재 날짜와 시간정보를 가지는 객체 생성
		GregorianCalendar gc = new GregorianCalendar();
		
		Calendar calendar = new GregorianCalendar();
		
		Calendar ca = Calendar.getInstance();
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DATE);
		
		int h = ca.get(Calendar.HOUR);
		int hh = ca.get(Calendar.HOUR_OF_DAY); // 24시간 형식
		int mi = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		int ms = ca.get(Calendar.MILLISECOND);
		
		long millis = ca.getTimeInMillis();
		
		Date date = ca.getTime();
		
		System.out.println("Year : " + y);
		System.out.println("Month : " + (m+1));
		System.out.println("Day : " + d);
		System.out.println("Hour : " + hh);
		System.out.println("Minute : " + mi);
		System.out.println("Second : " + s);
		System.out.println("Millisecond : " + ms);
		System.out.println(millis);
		System.out.println(date);
	}

}
