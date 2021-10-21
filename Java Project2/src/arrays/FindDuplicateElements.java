package arrays;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array = new int[] {1,3,5,2,3,6,8,9,7,7};
		 
		System.out.println("The duplicate elements in the given array are");

		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]==array[j])		
				System.out.println(array[j]);
			}
		}
	}

}
