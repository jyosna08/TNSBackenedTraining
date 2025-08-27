package com.tnsif.multithreaddemo;
// demo for implementing thread using thread class
public class UsingThreadClass extends Thread{
	
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
