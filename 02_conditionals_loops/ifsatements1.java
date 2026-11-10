package unit3;
import java.util.Scanner;
public class ifsatements1 {

	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter first number: ");
		int one = keyboard.nextInt();
		System.out.println("enter the second number: ");
		int two = keyboard.nextInt();
		if (one == two)
		{ 
			System.out.println(one + " and " + two + " are the same number");
		}
		else
		{
			System.out.println(one + " and " + two + " are NOT the same number");
		}
	}
}
