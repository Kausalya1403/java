package Numbers;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count till which fibonacci series must be printed : ");
		int count = sc.nextInt();
		
		System.out.print("fibonacci series for the given count is : ");
		System.out.print(n1+ " " +n2);//printing 0 and 1
		
		for(i=2;i<count;i++) //loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1+n2;
		    System.out.print(" " +n3);
			n1=n2;
			n2=n3;
		}

	}

}
