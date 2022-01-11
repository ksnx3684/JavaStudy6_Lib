package com.ksnx3684.s1.lang.string;
import java.util.Scanner;
public class StringStudy1 {
	
	public void splitTest() {
		String name = "12 13 14 15 16";
		String[] result = name.split(" ");
		for(int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}
	
	public void valueTest() {
		int num = 1000;
		String result = String.valueOf(num);
		System.out.println(result);
	}
	
	public void caseTest() {
		String title = "Flay to The Moon";
		String lower = title.toLowerCase();
		String upper = title.toUpperCase();
		System.out.println(lower);
		System.out.println(upper);
	}
	
	public void replaceTest() {
		String title = "Fly to The Moon";
		// 참조변수명.멤버메서드명()
		String result = title.replace("Fly", "Run");
		System.out.println(title);
		System.out.println(result);
	}
	
	public void subStringEx1() {
		// 키보드로부터 업로드할 파일명을 입력
		// a.txt, b.pdf, ksnx.jpg...
		// jpg, gif, png - 이미지 파일입니다 출력
		// txt, pdf, hwp - 문서 파일입니다 출력
		// mp3, wav, ogg - 음원 파일입니다 출력
		// 나머지는 알 수 없는 파일입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력");
		String name = sc.next();
		int a = name.indexOf("."); // 변수에 "."의 인덱스값 넣기
		String b = name.substring(a+1); //a+1 부터 추출
			if(b.equals("jpg") || b.equals("gif") || b.equals("png")) {
				System.out.println("이미지 파일입니다");
			} else if(b.equals("txt") || b.equals("pdf") || b.equals("hwp")) {
				System.out.println("문서 파일입니다");
			} else if(b.equals("mp3") || b.equals("wav") || b.equals("ogg")) {
				System.out.println("음원 파일입니다");
			} else {
				System.out.println("알 수 없는 파일입니다");
			}
	}
	
	public void subStringTest() {
		String title = "Spider-Man: No way Home";
		String result = title.substring(12);
		// String result = title.substring(title.indexOf("N"));
		System.out.println(result);
		result = title.substring(12, 18);
		System.out.println(result);
	}
	
	public void lengthTest() {
		String title = "Spider-Man: No way Home";
		int len = title.length();
		System.out.println(len);
		for(int i = 0; i < len; i++) {
			// char a = title.charAt(i);
			// System.out.println(a);
			System.out.println(title.charAt(i));
			// title find에 들어가있는 글자가 몇개인지 출력
		}
		System.out.println("----------");
		int count = 0;
		for(int i = 0; i < len; i++) {
			char b = title.charAt(i);
			if(b == 'o') {
				count++;
			}
		}
		System.out.println("count : " + count);
		System.out.println("----------");
	}
	
	public void indexOfTest() {
		String msg = "Hello World";
		//indexOf를 호출
		int a = msg.indexOf('W'); // 매개변수 안의 문자가 위의 msg의 몇번째 인덱스인지 반환하는 메서드 - 문자로 인덱스를 찾음
		int num = msg.indexOf('o', 6);
		System.out.println(a);
		System.out.println(num);
	}
	
	public void equalTest() {
		String str = "이병훈"; // heap의 상수영역에 값을 저장
		String str2 = "이병훈"; // 이하동문. 그래서 str과 str2는 같은 주소를 갖는다.
		String str3 = new String("이병훈"); // new는 heap 영역에 객체를 새로 생성했기 때문에
		String str4 = new String("이병훈"); // str3와 str4는 서로 다는 주소를 갖는다.
		System.out.println(str); // 내부적으로 toString이 호출됨. String 클래스에서는 주소가 아니라 실제 값을 호출하는 메서드로 오버라이딩됐다.
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("----------");
		System.out.println(str == str2); // true
		System.out.println(str3 == str4); // false
		System.out.println(str == str3); // false
		System.out.println("----------");
		System.out.println(str.equals(str2)); // 위와 같은 사례 때문에 문자열 비교시 ==이 아니라 equals 메서드를 이용한다.
		System.out.println(str3.equals(str4));
		System.out.println(str.equals(str3));
	}

	public void study1() {
		String name = "hello"; // 'h' 'e' 'l' 'l' 'o'
		String name2 = new String("hello2");
		System.out.println(name);
		
		int i = 1;
		char j = name.charAt(i); // i번째에 해당하는 인덱스의 값을 꺼내는 메서드 (배열의 개념으로 접근) - 인덱스로 문자를 찾음
		System.out.println(j);
	}
	
}
