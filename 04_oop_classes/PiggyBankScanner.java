
import java.util.*;
public class PiggyBankScanner {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter nickels : ");
		int nickels = keyboard.nextInt();
		System.out.println("enter dimes : ");
		int dimes = keyboard.nextInt();
		System.out.println("enter pennies : ");
		int pennies = keyboard.nextInt();
		System.out.println("enter quarters : ");
		int quarters = keyboard.nextInt();
		
		
		PiggyBank one  = new PiggyBank();
		PiggyBank two  = new PiggyBank(nickels , dimes , pennies , quarters);
		one.combinepiggybank(two);
		one.gettotal();
		
		
		

	}

}
