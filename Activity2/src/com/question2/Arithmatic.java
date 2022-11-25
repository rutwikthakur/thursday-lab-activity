package com.question2;

 class Arithmatic {
	
		int add(int a,int b)
		{
			return a+b;
		}
	}
	class Adder extends Arithmatic
	{
		


	

		public static void main(String[] args) {
			Adder a=new Adder();
			System.out.println("My superclass is:"+a.getClass().getSuperclass().getName());
			System.out.print(a.add(10,30)+" ");

		}

	}



