package arrays;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//initialize array
		int[] arr = new int[] {5,9,7,5,7,1,0,5,2,3};
		System.out.print("The elements in given array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int sum = 0;
		//loop through the array to calculate sum of elements
		for(int i =0;i<arr.length;i++) {
			sum = sum +arr[i];
		}
		System.out.println("Sum of all Elements of an array : " +sum);
	}

}