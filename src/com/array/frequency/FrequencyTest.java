package com.array.frequency;

public class FrequencyTest {
	 
			public static void main(String[] args) {
				FrequncyOfElement fe=new FrequncyOfElement();
				int arr[] = new int[] { 10, 30, 10, 20, 10, 20, 30, 10 };
				int size = arr.length;
				
				fe.countFrequency(arr, size);
			}

}
