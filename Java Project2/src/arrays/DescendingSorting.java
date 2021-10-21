package arrays;

public class DescendingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  {66,54,12,9,37,0,96,75}; 
		int temp = 0;

		//Displaying elements of original array
		System.out.println("Elements of original array : ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		//sort array in descending order
		for(int i= 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		//display elements after sorting in Descending order
		System.out.println("elements after sorting in Descending order : ");{
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
