package com.ksnx3684.s6;

public class Thread1 extends Thread {
	
	@Override
	public void run() {		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i : " + i);
		}
	}
	
}
