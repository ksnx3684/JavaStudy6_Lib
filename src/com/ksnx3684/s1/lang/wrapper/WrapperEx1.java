package com.ksnx3684.s1.lang.wrapper;
import java.util.Scanner;
public class WrapperEx1 {
	
	public void ex2() {
		// 주민등록번호 입력
		// 9  7  1  2  2  4 - 1  2  3  4  5  6  7 - 마지막 번호는 체크용 번호
		// 2  3  4  5  6  7   8  9  2  3  4  5   (위아래곱하기)
		// 18 21 4  10 12 28  8  18 6  12 20 30
		// 결과를 모두 더함 ex) 122
		
		// 모두 더한 결과값을 11로 나누어서 나머지를 구함
		// 122 / 11 = 몫:11 나머지:1
		
		// 11로 나눈 나머지값을 11에서 빼고 그 값을 체크용 번호랑 같은지 비교
		// 11 - 1 = 10 == 7과 같은지 비교
		
		// 만약에 결과값이 두자리라면 결과값을 다시 10으로 나누어서 그 나머지 값을 체크용 번호와 같은지 비교
		// 10 / 10 = 0 == 7
		// 같으면 정상적인 주민번호, 아니면 잘못된 번호
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		int[] result1 = new int[6];
		int[] result2 = new int[2];
		int[] result3 = new int[4];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		String number = sc.next();
		for(int i = 0; i < 6; i++) {
			char num1 = number.charAt(i);
			result1[i] = (num1-48)*(i+2);
		}
		for(int j = 0; j < result1.length; j++)
			sum1 += result1[j];
		
		for(int i = 7; i < 9 ; i++) {
			char num2 = number.charAt(i);
			result2[i-7] = (num2-48)*((i+1));
		}
		for(int j = 0; j < result2.length; j++)
			sum2 += result2[j];
		
		for(int i = 9; i < 13; i++) {
			char num3 = number.charAt(i);
			result3[i-9] = (num3-48)*((i-7));
		}
		for(int j = 0; j < result3.length; j++)
			sum3 += result3[j];
		
		int sum=sum1+sum2+sum3;
		int check = Integer.parseInt(number.substring(13));
		if(11-sum%11==check)
			System.out.println("정상");
		else if((11-sum%11)%10==check)
			System.out.println("정상");
		else
			System.out.println("비정상");
	}

	public void ex1() {
		// 키보드로부터 주민등록번호를 입력받음
		// 991224-1234567
		// 나이계산
		// 남자? 여자?
		// 3 - 5 : 봄
		// 6 - 8 : 여름
		// 9 - 11 : 가을
		// 12 - 2 : 겨울
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		String number = sc.next();
		int age;
		String sex;
		String season = "";
		int agenum = Integer.parseInt(number.substring(0, 2));
		int seasonnum = Integer.parseInt(number.substring(2, 4));
		int sexnum = Integer.parseInt(number.substring(7,8));
		if(sexnum == 1 || sexnum == 2)
			age = 2022 - (agenum+1900);
		else
			age = 2022 - (agenum+2000);
		if(sexnum == 1 || sexnum == 3)
			sex = "남자";
		else
			sex = "여자";
		if(seasonnum > 2 && seasonnum < 6)
			season = "봄";
		else if(seasonnum > 5 && seasonnum < 9)
			season = "여름";
		else if(seasonnum > 8 && seasonnum < 12)
			season = "가을";
		else if(seasonnum > 11 && seasonnum < 3)
			season = "겨울";
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("계절 : " + season);
	}
	
}
