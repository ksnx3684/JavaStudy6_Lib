package com.ksnx3684.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		System.out.println("Client 입니다");
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			
			socket = new Socket("220.126.10.86", 8282);
			System.out.println("서버와 접속이 성공!!");
			System.out.println("서버로 보낼 메세지를 입력하시오");
			String message = sc.nextLine();
			// System.out.println(message); // hello -> h, e, l, l, o -> 0101010101.....
			
			// 1. output Stream을 구해오기
			OutputStream os = socket.getOutputStream(); // byte(bit처리)
			OutputStreamWriter ow = new OutputStreamWriter(os); // char형으로 문자 처리
			BufferedWriter bw = new BufferedWriter(ow);
			// 전송 준비 끝
			
			// 2. 전송
			bw.write(message + "\r\n"); // \r은 입력커서를 다시 앞으로 되돌린다
			// 강제로 버퍼 비우기
			bw.flush();
			
			
			// server에서 온 메세지를 client가 수신
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			
			message = br.readLine();
			System.out.println("Server : " + message);
			
		} catch (Exception e) {
			System.out.println("끼에에에에에에에엑");
			e.printStackTrace();
		}	
	}

}
