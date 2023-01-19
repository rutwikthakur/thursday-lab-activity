package com.Question5;


	public class Question5  extends Thread{
		public void run()
		{
			System.out.println("----------------------------------------");
		}

		public static void main(String[] args) {
			
			Question5 t1=new Question5();
			Question5 t2=new Question5();
			System.out.println("Default priority of thread t1 is"+Thread.currentThread().getPriority());
			System.out.println("Default priority of thread t2 is"+Thread.currentThread().getPriority());
			t1.start();
			t1.setPriority(6);
			System.out.println("Default priority of thread t1 is"+t1.getPriority());
			/*t2.setPriority(11); //IllegelArgumentException
			System.out.println("Default priority of thread t2 is"+t2.getPriority());*/
			t2.start();

		}
	
}
