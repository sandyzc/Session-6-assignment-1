package com.assignment1.threads;

public class Main {
	
	public static void main(String[] args) {
		
	
	Timeout to = new Timeout();
	
	Thread thOne = new Thread(to);
	
	thOne.start();
	
	}
}