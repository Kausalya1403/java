package Numbers;

import java.util.Scanner;

public class Swaptwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a= sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		System.out.println("Before swapping : ");
		System.out.println("a = " +a+ " b = " +b);
		a=a-b; //a=a^b; using xor method
		b=b+a; //b=a^b;
		a=b-a; //a=a^b;
		System.out.println("After swapping : ");
		System.out.println("a = "+a+ " b = " +b);
	}

}
