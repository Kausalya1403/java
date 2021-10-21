package String;

import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original,reverse = "";
		Scanner in = new Scanner(System.in);// we can use 'in' instead of sc 
		System.out.println("Enter a string to check if it is a Palindrome: ");
		original = in.nextLine();
		System.out.println("original string is : " +original);
		int length = original.length();
		//System.out.println("length of the string is : " +length);
		
		//store original string in temp variable reverse
		
		for(int i = length-1;i>=0;i--)
			reverse = reverse + original.charAt(i);
		System.out.println("Reversed string is :" +reverse);
		
		//compare the string with reverse
		
		if(original.equals(reverse))
			System.out.println("String is a Palindrome");
		else
			System.out.println("String is not a Palindrome");
			
	}

}
