import java.util.Scanner;
public class Ttalbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the charge of the meal:$  ");
		double mealcharge = keyboard.nextDouble();
		double taxbill = 0.06 * mealcharge ;
		double taxbilltotal = taxbill + mealcharge; 
		double tipbill = 0.18 * (taxbilltotal);
		
		double total = taxbilltotal + tipbill;
		
		System.out.println("meal total: " + mealcharge);
		System.out.println("tax: " + taxbill);
		System.out.println("subtotal:" + taxbilltotal);
		System.out.println("\n tip: " + tipbill);
		System.out.println("total: " + total);
		
	}
	

}
