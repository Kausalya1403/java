package Numbers;

import java.util.Scanner;

public class Displayoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int num = 100;
Scanner sc = new Scanner(System.in);
System.out.println("enter a number : ");
int num = sc.nextInt();
System.out.println("List of odd numbers from 1 to" +num+ " is ");
for(int i =1;i<num;i++) {
	if(i%2!=0) {
		System.out.println(i+ " ");
	}
}
	}

}
