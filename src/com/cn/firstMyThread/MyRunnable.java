package com.cn.firstMyThread;

public class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"线程在运行!");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable m=new MyRunnable();
		Thread t=new Thread(m);
		t.start();
	}

	
}
