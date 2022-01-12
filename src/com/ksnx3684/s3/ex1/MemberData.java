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
	
	public void addMember(ArrayList<MemberDTO> ar) {
		// 새로 추가할 MemberDTO 생성
		// 키보드로부터 id, pw, name, email, age를 입력 받아서
		// MemberDTO의 멤버변수 값으로 대입
		// 매개변수로 받은 ar에 MemberDTO 추가
		
		Scanner sc = new Scanner(System.in);
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(sc.next());
		memberDTO.setPw(sc.next());
		memberDTO.setName(sc.next());
		memberDTO.setEmail(sc.next());
		memberDTO.setAge(sc.nextInt());
		ar.add(memberDTO);
	}
	
	public ArrayList<MemberDTO> init() {
		// data에 있는 문자열을 StringTokenizer로 파싱해서
		// MemberDTO를 생성해서 멤버변수값으로 대입
		// MemberDTO들을 ArrayList에 담아서 return
		System.out.println("MemberEx1 Branch");
		
		StringTokenizer st = new StringTokenizer(this.data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			ar.add(memberDTO);
		}
		return ar;
	}
}
	
