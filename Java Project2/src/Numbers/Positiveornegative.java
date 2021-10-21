package Numbers;

import java.util.Scanner;

public class Positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		if(num>0) {
			System.out.println("The number is postive");
		}
		else if(num<0) {
			System.out.println("The number is negative");
		}
		else 
		{
			System.out.println("The number is zero");
		}
	}

}
