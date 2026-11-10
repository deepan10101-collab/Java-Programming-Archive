import java.util.Scanner;
public class bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Change maker");
		System.out.println("=============");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the total in dollars and cents (example:$22.67): $");
		double total = keyboard.nextDouble();
		System.out.println("enter the payed amount in dollars and cents (example:$40.00) : $");
		double payment = keyboard.nextDouble();
		double change = payment - total;
		double tens = (int)change / 10;
		double tensmoney = tens * 10;
		double fives = (int)(change - tensmoney) / 5;
		double fivesmoney = (int)(fives * 10) + tensmoney;
		double singles = (change - fivesmoney)/1;
		double singlesmoney  = (singles) + fivesmoney;
		  double quarters = (int)(change - singlesmoney)/ 25;  
	      double quartersmoney = quarters * 25;
	      double dimes  = (int)(change - quartersmoney )/10;
	      double dimesmoney = (int)(dimes * 10) + quartersmoney;
	      double nickels = (int)(change - dimesmoney)/5;
	      double nickelsmoney = (nickels * 5) + dimesmoney;
	      double pennies = (change - nickelsmoney) / 1;
	      
		
		System.out.printf(" %.0f" , change);
	      System.out.printf("%2s" , "\ntens :" );
	      System.out.printf("%.2f" , tens);
	      System.out.printf("%2s" , "\nfives   :"  );
	      System.out.printf("%.2f" , fives);
	      System.out.printf("%2s" , "\nsingles  :"  );
	      System.out.printf("%.2f" , singles);
	      
	      System.out.printf("%2s" , "\nquarters :" );
	      System.out.printf("%.2f" , quarters);
	      System.out.printf("%2s" , "\ndimes    :"  );
	      System.out.printf("%.2f" , dimes);
	      System.out.printf("%2s" , "\nnickels  :"  );
	      System.out.printf("%.2f" , nickels);
	      System.out.printf("%2s" , "\npennies  :" );
	      System.out.printf("%.2f" , pennies);
	      
	      
		
		

		
	}

}
