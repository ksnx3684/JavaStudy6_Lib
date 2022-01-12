package com.ksnx3684.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String str = "봄, 16, 여름,32, 가을,20, 겨울, -15";
		String [] s = str.split(",");
		StringTokenizer st = new StringTokenizer(str, ","); // 객체 생성 시 구분자 설정 (전처리 작업)
		
		ArrayList<SeasonDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) { // 지정한 구분자가 계속 나올 때 까지 반복
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken().trim();
			seasonDTO.setName(token); // 봄
			
			token = st.nextToken();
			seasonDTO.setGion(Integer.parseInt(token.trim())); // 16
			
			// String token = st.nextToken(", ") 구분자를 이쪽에서 명시해도 된다. (후처리 작업)
			// System.out.println(token);
			
			ar.add(seasonDTO);
//			System.out.println(seasonDTO.getName());
//			System.out.println(seasonDTO.getGion());
		}
		for(int i = 0; i < ar.size(); i++) {
			SeasonDTO seasonDTO = ar.get(i);
			System.out.println(seasonDTO.getName());
			System.out.println(seasonDTO.getGion());
		}
	}
}
