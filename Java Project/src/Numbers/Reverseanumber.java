package Numbers;

import java.util.Scanner;

public class Reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number which needs to be reversed");
int number = sc.nextInt();
int reverse=0;
while(number>0) {
	int remainder = number%10;
	reverse = reverse*10 + remainder;
	number = number/10;
}
System.out.println("The reversed number is : " +reverse);
	}

}
