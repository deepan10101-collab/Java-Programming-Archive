package unit3;

import java.util.Scanner;

public class ifstatementsextension2 {

	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("enter first number: ");
			int one = keyboard.nextInt();
			System.out.println("enter the second number: ");
			int two = keyboard.nextInt();
			System.out.println("enter the third number: ");
			int three = keyboard.nextInt();
			if (one > two && one < three)
			{  
				System.out.println(one + " is the middle number");
			}
			else if (two > one && two < three)
			{
				System.out.println(two + " is the middle number");			}
			else
			{
				System.out.println(three + " is the middle number");
			}
	}

}
