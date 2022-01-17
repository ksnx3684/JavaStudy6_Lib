package com.ksnx3684.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server 입니다");
		ServerSocket serverSocket = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("클라이언트의 접속을 기다리는 중");
			serverSocket = new ServerSocket(8282); // 접속 준비
			socket = serverSocket.accept(); // client
			System.out.println("접속한 Client와 1:1 연결 완료");
			
			//
			InputStream is = socket.getInputStream(); // 01 처리
			InputStreamReader ir = new InputStreamReader(is); // char형 처리
			BufferedReader br = new BufferedReader(ir); // String
			
			String message = br.readLine();
			System.out.println("Clent : " + message);
			
			
			// server에서 클라이언트로 메세지 전송
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);
			// 준비 완료
			System.out.println("클라이언트로 보낼 메세지를 입력하시오");
			message = sc.nextLine();
			// System.out.println(message);
			bw.write(message + "\r\n");
			bw.flush();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
