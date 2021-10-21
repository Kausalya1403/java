package arrays;

public class CopyElementtoAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize array
				int [] array1 = new int [] {5,6,8,9,14,20};

				//create another array same as size of array1
				int array2[] = new int[array1.length];

				//copying all elements of one array into another
				for(int i=0;i<array1.length;i++) {
					array2[i]=array1[i];
				}
				//Displaying elements of array 1
				System.out.print("Elements of original array : ");
				for(int i = 0;i<array1.length;i++) {
					System.out.print(array1[i] + " ");
				}
				
				System.out.println();
				
				//Displaying elements of array 2
				System.out.print("Elements of new array : ");
				for(int i=0;i<array2.length;i++) {
					System.out.print(array2[i] + " ");
				}
	}

}
