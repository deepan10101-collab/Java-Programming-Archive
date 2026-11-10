package unit3;
import java.util.*;
public class ifelsepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
System.out.println("enter the price: ");
double price = keyboard.nextDouble();
if (price > 10.00) {
	System.out.println("discounted price :" + price * 0.9);
}
	}

}
