package Numbers;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;
		//int n = 454;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		temp = n;
		while(n>0) {
			r=n%10;//getting reminder
			sum = (sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("It is a Palindrome number");
		else
			System.out.println("It is not a Palindrome number");
	}

}
