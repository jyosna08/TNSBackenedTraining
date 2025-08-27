package com.tnsif.multithreaddemo;

public class MainThread {

	public static void main(String[] args) {
		UsingThreadClass ob = new UsingThreadClass();
		ob.start();
		
		SecondThread obj = new SecondThread();
		obj.start();
		

	}

}
