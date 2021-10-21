package arrays;

public class PrintEvenposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Original Array : ");
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Elements of given array on even position : ");
		//loop through the array by increasing value of i by 2
		//Here, i will start from 1 as first even positioned element is present at position 1.
		for (int i = 1;i<arr.length;i = i+2) {
			System.out.print(arr[i] + " ");
		}
	}

}
