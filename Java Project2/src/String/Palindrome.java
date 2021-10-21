package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		boolean flag = true;

		//converts the given string to lowercase
		str=str.toLowerCase();

		//Iterate the string forward and backward, compare one character at a time     
		// till middle of the string is reached    
		for(int i = 0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Given String is Palindrome");
		else
			System.out.println("Given String is not a Palindrome");
	}

}
