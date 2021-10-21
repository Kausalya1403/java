package Java;

public class PrintElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Here, 1, 2, 3, 4 and 5 represent the elements of the array.
		//These elements can be accessed through their corresponding indexes, 1.e., 0, 1, 2, 3 and 4.
		int [] arr = new int[] {1,2,3,4,5};
		System.out.println("Elements of given array : ");

		//loop through the array by increasing value of i
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
