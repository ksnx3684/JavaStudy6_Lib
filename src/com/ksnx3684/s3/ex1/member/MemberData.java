package com.ksnx3684.s3.ex1.member;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberData extends MemberDTO {

	private String data;
	private Scanner sc;
	
	// 기본 생성자 메서드 선언
	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data+"id2 - pw2 - name2 - name2@naver.com-49-";
		this.data = this.data+"id3 - pw3 - name3 - name3@daum.net-36-";
		System.out.println(this.data);
	}
	
	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		// 삭제하고 싶은 ID를 입력받아서
		// ArrayList에서 삭제
		MemberDTO memberDTO = null;
		System.out.println("삭제할 대상의 ID를 입력하시오");
		String id = this.sc.next();
		for(int i = 0; i < ar.size(); i++) {
			if(ar.get(i).getId().equals(id)) {
				// ar.get(i) : ArrayList ar의 i번째의 // getID() : String type getID메서드의 값이 // equals(id) : 입력한 id값과 같으면
				memberDTO = ar.remove(i); // memberDTO에 ar.remove(i)를 넣고
				break; // 탈출
			}
		}
		
		return memberDTO; // 반환
	}
	
	public void addMember(ArrayList<MemberDTO> ar) {
		// 새로 추가할 MemberDTO 생성
		// 키보드로부터 id, pw, name, email, age를 입력 받아서
		// MemberDTO의 멤버변수 값으로 대입
		// 매개변수로 받은 ar에 MemberDTO 추가
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("ID를 입력하시오");
		memberDTO.setId(sc.next());
		System.out.println("PW를 입력하시오");
		memberDTO.setPw(sc.next());
		System.out.println("이름을 입력하시오");
		memberDTO.setName(sc.next());
		System.out.println("Email을 입력하시오");
		memberDTO.setEmail(sc.next());
		System.out.println("나이를 입력하시오");
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
