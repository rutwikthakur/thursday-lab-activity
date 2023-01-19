package com.Question2;

public class Question2 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum element in the array is: "+min);
		System.out.println("Maximum element int the array is: "+max);

	}

}
