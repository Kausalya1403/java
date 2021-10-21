package String;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		int count = 0;

		//Using for loop to calculate the total characters in a string
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i) != ' ') //if you dont give this it counts even space present in a sentence
				count++;
		}
		//Displays the total number of characters
		System.out.println("Total number of characters in the string : " +count);

	}

}
