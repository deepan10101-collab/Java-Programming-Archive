package unit3;
import java.util.*;
public class ifpractice2 {
	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the amount of bolts you have:");
int bolt = keyboard.nextInt();
System.out.println("Enter the amount of nuts you have:");
int nut = keyboard.nextInt();
System.out.println("Enter the amount of washers you have:");
int washer = keyboard.nextInt();
if (nut >= bolt && (2*washer)>= bolt)
{
	System.out.println("Order is Ok");
	System.out.println("The total price is: " + 5*bolt + 3*nut + washer);
}
else if(nut < bolt)
{
	System.out.println("Check the Order: too few nuts ");
}
else if((2*washer) < bolt)
{
	System.out.println("Check the Order: too few washers");
}

	}
}
