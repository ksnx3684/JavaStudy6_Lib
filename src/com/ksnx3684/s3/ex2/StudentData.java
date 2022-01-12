package com.ksnx3684.s3.ex2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentData extends StudentDTO {

	private String info;
	private Scanner sc;
	
	public StudentData() { // 기본 생성자 메서드
		this.sc = new Scanner(System.in);
		this.info="name1,1,15,50,60,";
		this.info=this.info+"name2,2,52,68,40,";
		this.info=this.info+"name3,3,80,87,75,";
	}
	// 학생들의 정보를 파싱해서 총점과 평균도 계산 후 전체 출력
	// 학생의 정보를 추가
	// 학생의 정보를 삭제
	
	public ArrayList<StudentDTO> student() {
		StringTokenizer st = new StringTokenizer(this.info, ",");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNumber(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3);
			ar.add(studentDTO);
		}
		return ar;
	}
	
	public void addStudent(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름을 입력하시오");
		studentDTO.setName(sc.next());
		System.out.println("번호를 입력하시오");
		studentDTO.setNumber(sc.nextInt());
		System.out.println("국어 점수를 입력하시오");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어 점수를 입력하시오");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학 점수를 입력하시오");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3);
		ar.add(studentDTO);
	}
	
	public StudentDTO deleteStudent(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = null;
		System.out.println("삭제할 학생의 번호를 입력하시오");
		int num = sc.nextInt();
		for(int i = 0; i < ar.size(); i++) {
			if(num == ar.get(i).getNumber()) {
				studentDTO = ar.remove(i);
				break;
			}
		}
		return studentDTO;
	}
}
