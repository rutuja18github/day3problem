package com.array.example;

public class SecondLargest {
	 public static void main(String args[]){
		 int temp;
	      int[] arr= {20, 10, 63, 25, 96, 57};
	      int size = arr.length;

	      for (int i = 0; i < size; i++) {     
	            for (int j = i+1; j < size; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        } 
	      System.out.println("print Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        } 
	        System.out.println();
	        int secondLargest=arr[size-2];
	        System.out.println("2nd Largest Number in an Array : "+secondLargest);
	        
	 }
}
