package com.ksnx3684.s3.ex4.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarStudy5 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		// 카카오택시
		// 30분 소요 예정
		// 도착 예정 시간은?
		// 1000*60*30
		System.out.println(ca.getTime());
		long time = ca.getTimeInMillis();
		time = time + 1000*60*30; // 30분만큼의 밀리세컨즈 추가
		
		ca.setTimeInMillis(time);
		System.out.println(ca.getTime());
		
		ca.roll(Calendar.MINUTE, 30); // 30분 흐르게 함
		System.out.println(ca.getTime());
		
		ca.add(Calendar.MINUTE, 70); // 70분 흐르게 함
		System.out.println(ca.getTime());
		
		// 2022년 01월 14일 - 16시 44분 11초
		String pattern = "yyyy년 MM월 dd일 - HH시 mm분 ss초";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String r = sd.format(ca.getTime());
		System.out.println(r);
		
		pattern = "yyyy-MM-dd (E)";
		sd.applyPattern(pattern);
		
		System.out.println(sd.format(ca.getTime()));
		
	}

}
