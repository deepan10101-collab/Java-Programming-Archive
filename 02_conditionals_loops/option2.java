package unit3;

import java.util.Random;
import java.util.Scanner;

public class option2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// You will need a Scanner object and a Random object,
		// as well as a switch structure and a variety of variables.
		
		// Code your implementation below.
		
		Scanner one = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("What kind of random numbers would you like?");
		System.out.println("\nSmall numbers are 1 digit long --> 0-9 \nmedium numbers are two digits --> 10-99 \nand big numbers are three digits  -->100 - 999.");
		System.out.println("\nFor small, press 1; medium, press 2; big, press 3.");
		System.out.println("\nPlease enter a number:\n");
		String number = one.next();
		double num;
		int num1 , num2,num3;
		switch(number) {
		case "1":
			num1 = rand.nextInt(10);
			num2 = rand.nextInt(10);
			num3 = rand.nextInt(10);
			num = (num1 + num2 + num3)/3;
			System.out.println("the number is : " + num );
			break;
		case "2":
			num1 = rand.nextInt(90) + 10; 
			num2 = rand.nextInt(90) + 10; 
			num3 = rand.nextInt(90) + 10; 
			num = (num1 + num2 + num3)/3;
			System.out.println("the number is : " + num );
			break;
		case "3":
			num1 = rand.nextInt(900) + 100;
			num2 = rand.nextInt(900) + 100;
			num3 = rand.nextInt(900) + 100;
			num = (num1 + num2 + num3)/3;
			System.out.println("the number is : " + num );
			break;
		default:
			System.out.println("error , please enter 1,2 or 3");
		}
		
		
		
		
		
		
	}

}

