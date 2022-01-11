package com.ksnx3684.s1.lang.string.ex1;

public class MemberData extends MemberDTO {

	private String data;
	
	// 기본 생성자 메서드 선언
	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-20-";
		this.data = this.data+"id2 - pw2 - name2 - name2@naver.com-49-";
		this.data = this.data+"id3 - pw3 - name3 - name3@daum.net-36-";
		System.out.println(this.data);
	}
	
	public MemberDTO[] init() {
		String[] result = this.data.split("-");
		MemberDTO[] members = new MemberDTO[result.length/4];
		int count = 0;
		for(int i = 0; i < members.length; i++) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(result[count]);
			memberDTO.setPw(result[++count]);
			memberDTO.setName(result[++count]);
			memberDTO.setEmail(result[++count]);
			memberDTO.setAge(Integer.parseInt(result[++count]));
			members[i] = memberDTO;
			count++;
		}
		return members;
	}
}
