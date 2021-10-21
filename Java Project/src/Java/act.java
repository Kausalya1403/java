package Java;

import java.util.Scanner;

public class act {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int sum = 0;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a number : ");
		        int num = sc.nextInt();
		        for(int i=1;i<=num;i++){
		            if(i%3==0 || i%5==0){
		                System.out.print(i +" ");
		                sum = sum+i;
		            }
		        }
		        System.out.println();
		        System.out.println("Sum of the given natural number is " +sum);
		    }
}
		        
