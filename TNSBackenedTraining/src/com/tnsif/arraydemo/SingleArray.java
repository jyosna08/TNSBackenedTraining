package com.tnsif.arraydemo;
// Demo for single dimensional array
public class SingleArray {

	public static void main(String[] args) {
		
		// declaration 
		//int[] arr;
		
		//int []arr;
		
		//declaration + initialization
		int []arr = {1,2,3};
		int[] number = new int[5]; 
		number[0]=10;
		number[1]=11;
		number[2]=12;
		number[3]=13;
		number[4]=14;
		
		for(int i=0;i<number.length;i++) {
			System.out.println("the element in the array are "+ number[i]);  // using for loop
			}
		for(int num:arr){
			System.out.println("the element in the array are "+ num);    // enhances or for each for loop

		}
	}

}
