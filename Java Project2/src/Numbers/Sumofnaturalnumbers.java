package Numbers;

import java.util.Scanner;

public class Sumofnaturalnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number till which the sum must be calculated : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0;i<=num;i++) {
			sum = sum + i;
		}
		System.out.println("Sum of "+num+ " natural number is " +sum);
	}

}
