
import java.util.Scanner;
public class reciept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner keyboard = new Scanner (System.in);
		
		double drinks = 1.17;
		double salads = 2.53;
		double burgers = 4.38;
		double wraps = 7.32;
		System.out.println("enter the quantity of drinks you want($1.17 each): ");
	
		int item1 = keyboard.nextInt();
		System.out.println("enter the quantity of salads you want($2.52 each): ");
		int item2 = keyboard.nextInt();
		System.out.println("enter the quantity of burgers you want($ 4.38 each) :");
		int item3 = keyboard.nextInt();
		System.out.println("enter the quantity of wraps you want($ 7.32 each)");
		int item4= keyboard.nextInt();
		
		drinks *= item1;
		salads *= item2;
		burgers *= item3;
		wraps *= item4;
		
		double total = drinks + salads + burgers + wraps;
		
		System.out.println("meal recipt\n"
				+ "__________\n"
				+ item1 + "drinks: " + drinks+"\n"
				+ item2 + "salads: " + salads+"\n"
				+ item3 + "burgers: " + burgers + "\n"
				+ item4 + "wraps: " + wraps + "\n"
				+ "_________\n"
				+ "subtotal : " + total 
				
				
				);
		
		
				
		
	
				
		
	}

}
