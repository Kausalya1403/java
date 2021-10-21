package patternprinting;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want to enter in this pattern ? :");
		int rows = sc.nextInt();
		System.out.println(" pattern ");
		System.out.println("");
		for(int i=1;i<=rows;i++)
		{
		for(int j=rows;j>=i;j--)
		{
		System.out.print(j+ " ");
		}
		System.out.println();
	}
	}

}
