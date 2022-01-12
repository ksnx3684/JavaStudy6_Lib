package com.ksnx3684.s3.ex1;

public class MemberMain {

	public static void main(String[] args) {
		MemberData memberData = new MemberData();
		MemberDTO[] members = memberData.init();
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i].getId());
			System.out.println(members[i].getPw());
			System.out.println(members[i].getName());
			System.out.println(members[i].getEmail());
			System.out.println(members[i].getAge());
			System.out.println("----------");
		}
		
	}

}
