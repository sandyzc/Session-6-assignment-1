package com.assignment1.threads;

public class Timeout implements Runnable{

	@Override
	public void run() {
		for (int i = 0 ; i<30;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			
			}
			System.out.println(" timeout no "+i);
			
		}
	}

}
