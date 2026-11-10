package unit3;
import java.util.*;
public class ifelsepractice3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter your age: ");
		int age = keyboard.nextInt();
		System.out.println("enter the time in 24 hour clock: ");
		int time = keyboard.nextInt();
		double ticketprice;
		if (age >= 13) {
			if (time > 1200 && time < 1630) {
				ticketprice = 5.00;
				System.out.println("ticketprice : " + ticketprice);}
			else {
				ticketprice = 8.00;
				System.out.println("ticketprice : " + ticketprice);}
		
		}
		else if(age < 13){
			if(time > 1200 && time < 1630) {
				ticketprice = 2.00;
				System.out.println("ticketprice : " + ticketprice);
			}
			else {
				ticketprice  = 4.00;
				System.out.println("ticketprice : " + ticketprice);
			}
			
			
		}
 
	}
}
