package com.cn.firstMyThread;

public class MyThread extends Thread{

 public void run(){
	 for(int i=0;i<5;i++){
		System.out.println(Thread.currentThread().getName()+"在运行!"); 
	 }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
	MyThread t=new MyThread();
	t.start();
	}

}
