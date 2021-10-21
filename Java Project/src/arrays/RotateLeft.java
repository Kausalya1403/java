package arrays;

public class RotateLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize array
		int[] arr = new int[] {1,2,3,4,5};
		//n determines the number of times an array should be rotated

		int n=3;
		//display original array
		System.out.println("Original array : ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		//Rotate the given array by n times by left
		for(int i = 0;i<n;i++) {
			int j,first;
			//stores the first element of the array
			first=arr[0];
			for(j=0;j<arr.length-1;j++) {
				//shift element of array by one
				arr[j]=arr[j+1];
			}
			//first element of array will be added at the end
			arr[j]= first;
		}
		System.out.println();
		//display result after rotation
		System.out.println("Array after left rotation : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
