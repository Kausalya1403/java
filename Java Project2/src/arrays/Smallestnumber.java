package arrays;

import java.util.Scanner;

public class Smallestnumber {

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
		//initialize the first element of array
		//initialize min with the first element of array
				int min = array[0];
				//loop through the array
				for(int i=0;i<array.length;i++) {
					//compare elements of array with max
					if(array[i]<min)
						min = array[i];
		}
		System.out.println("The smallest number in the array is : " +min);
	}

}
