package com.tnsif.multithreaddemo;

public class SecondThread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("The running thread"+Thread.currentThread().getName());
			
			try {
				sleep(2000);
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	

}


