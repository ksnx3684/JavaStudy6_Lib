package com.ksnx3684.s3.ex1;

public class MemberMain {

	public static void main(String[] args) {
		MemberData memberData = new MemberData();
		ArrayList<MemberDTO> members = memberData.init();
		
		memberData.addMember(members);
		
		for(int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i).getId());
			System.out.println(members.get(i).getPw());
			System.out.println(members.get(i).getName());
			System.out.println(members.get(i).getEmail());
			System.out.println(members.get(i).getAge());
			System.out.println("----------");
		}
		
	}

}
