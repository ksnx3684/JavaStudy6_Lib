package com.ksnx3684.s3.ex2;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
	
		StudentData student = new StudentData();
		ArrayList<StudentDTO> stu = student.student();
		
		student.addStudent(stu);
		
		StudentDTO studentDTO = student.deleteStudent(stu);
		if(studentDTO != null)
			System.out.println("삭제 성공");
		else
			System.out.println("삭제 실패");
		
		for(int i = 0; i < stu.size(); i++) {
			System.out.println(stu.get(i).getName());
			System.out.println(stu.get(i).getNumber());
			System.out.println(stu.get(i).getKor());
			System.out.println(stu.get(i).getEng());
			System.out.println(stu.get(i).getMath());
			System.out.println(stu.get(i).getTotal());
			System.out.println(stu.get(i).getAvg());
		}

	}

}
