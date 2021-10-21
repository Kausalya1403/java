package String;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String original = sc.nextLine();
		
		//stores the reverse of given string
		String reverse = "";
		//Iterate through the string from last and add each character to a temp variable reverse
		for(int i = original.length()-1;i>=0;i--) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse of entered string is : " +reverse);
	}

}
