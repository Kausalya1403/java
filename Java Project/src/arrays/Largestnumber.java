package arrays;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store : ");
		//reading the number of elements
		int n=sc.nextInt();
		//creates an array in the memory of length
		int[] array = new int[10];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0;i<n;i++) {
			//reading array elements from the user
			array[i] = sc.nextInt();
		}
		//initialize max with the first element of array
		int max = array[0];
		//loop through the array
		for(int i=0;i<array.length;i++) {
			//compare elements of array with max
			if(array[i]>max)
				max = array[i];
		}
		System.out.println("largest element present in the given array is : " +max);
	}

}
