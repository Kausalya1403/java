package String;

import java.util.Scanner;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		//counter variable to store the count of vowels and consonants
		int vowelcount=0,consocount=0;

		//converting entire string to lower case to reduce complications
		str = str.toLowerCase();

		for(int i =0;i<str.length();i++) {
			//checks whether a character is vowel
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u') {
				//increments the vowel counter
				vowelcount++;
			}
			//checks whether a character is consonant
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				//increments consonant counter
				consocount++;
			}
		}
		System.out.println("Number of vowels : " +vowelcount);
		System.out.println("Number of consonants : " +consocount);
	}

}
