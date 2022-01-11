package com.ksnx3684.s1.lang.stringBuffer;

public class StringBufferMain {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("이병훈");
		sb.append("김병훈");
		System.out.println(sb);
		String name = "iu";
		String name2 = "lee";
		name = name+name2;
		System.out.println(name);
		name = sb.toString();
		
	}

}
