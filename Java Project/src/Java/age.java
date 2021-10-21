package Java;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner age = new Scanner (System.in);
		System.out.println("Enter your age");
		int a = age.nextInt();

		try{  
			if(a<15){         
				throw new Exception();
			}          
		}
		catch(Exception ex){
			System.out.println("Age must be above 15");        
		}
		finally{
			System.out.println("Your age is " + a);
		}   
	}
}