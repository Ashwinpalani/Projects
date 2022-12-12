package org.ashwin;

import java.util.Scanner;

public class Sample {
     void Sort(int[] arr)
     {
    	 for (int i = 0; i < arr.length; i++) 
    	 {
    		 for (int j = 1; j < arr.length - i; j++) 
    		 {
    			 if(arr[j-1] > arr[j])
    			 {
    				 int temp = arr[j-1];
    				 arr[j-1] = arr[j];
    				 arr[j] = temp;
    			 }
    		 } 
    	 }
     }
     void insertionSort(int[] arr)
	 {
    	 for (int i = 1; i < arr.length; i++) {
    		 int temp = arr[i];  
		     int   j = i - 1;  
		  
		        	while(j>=0 && temp <= arr[j]) 
		        	{		          
		            arr[j+1] = arr[j];     
		            j = j-1;    
		        	}    
		        	arr[j+1] = temp;    
	    	}  
	 } 

	public static void main(String[] args) {
		System.out.println("enter the size:");
		Sample z = new Sample(); 
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter valid values:");
	    int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Bubble Sort :");
		z.Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("Insertion Sort :");
		z.insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}
	
}

