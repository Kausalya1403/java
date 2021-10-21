package Numbers;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int n = sc.nextInt();
if(isPrime(n)) {
	System.out.println(n+ " is a Prime number");
}else {
	System.out.println(n+ " is not a Prime number");
	
}
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
		return false;
	}
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;

}
}

