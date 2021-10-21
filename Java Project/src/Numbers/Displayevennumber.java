package Numbers;

import java.util.Scanner;

public class Displayevennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int num = sc.nextInt();
		System.out.println("List of even numbers from 1 to" +num+ " is ");
		for(int i =1;i<num;i++) {
			if(i%2==0) {
				System.out.println(i+ " ");
			}
	}
	}

}
