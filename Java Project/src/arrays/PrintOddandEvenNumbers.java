package arrays;

public class PrintOddandEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {1,8,6,52,73,69,20,70,12,5,92,11,56};
		//Display all elements in given array
		System.out.print("Given Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//print odd numbers
		System.out.print("Odd numbers in given array : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		//print even numbers
		System.out.print("Even numbers in a given array : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
