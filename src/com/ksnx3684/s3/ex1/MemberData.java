package com.ksnx3684.s3.ex1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberData extends MemberDTO {

	private String data;
	
	// 기본 생성자 메서드 선언
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data+"id2 - pw2 - name2 - name2@naver.com-49-";
		this.data = this.data+"id3 - pw3 - name3 - name3@daum.net-36-";
		System.out.println(this.data);
	}
	
	public ArrayList<MemberDTO> init() {
		// 새로 추가할 MemberDTO 생성
		// 키보드로부터 id, pw, name, email, age를 입력 받아서
		// MemberDTO의 멤버변수 값으로 대입
		// 매개변수로 받은 ar에 MemberDTO 추가
		Scanner sc = new Scanner(System.in);
		ArrayList<MemberDTO> ar = new ArrayList<>(); 
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(sc.next());
		memberDTO.setPw(sc.next());
		memberDTO.setName(sc.next());
		memberDTO.setEmail(sc.next());
		memberDTO.setAge(sc.nextInt());
		ar.add(memberDTO);
		
		
		// data에 있는 문자열을 StringTokenizer로 파싱해서
		// MemberDTO를 생성해서 멤버변수값으로 대입
		// MemberDTO들을 ArrayList에 담아서 return
		
		MemberData data = new MemberData();
		StringTokenizer st = new StringTokenizer(data.toString(),"-");
		ArrayList<String> member = new ArrayList<>();
		for(int i = 0; i < member.size(); i++) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(member.get(i));
			memberDTO.setPw(member.get(i));
			memberDTO.setName(member.get(i));
			memberDTO.setEmail(member.get(i));
			memberDTO.setAge(Integer.parseInt(member.get(i)));
			member.add(memberDTO);
		}
		
		
		
		return null;
	}
}
