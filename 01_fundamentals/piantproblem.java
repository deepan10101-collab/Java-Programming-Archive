import java.util.Scanner;
public class piantproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int COVERAGE = 275;
		int length, width, height;
		double totalsqft, paintNeeded;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter length of room :");
		length = keyboard.nextInt();
		System.out.println("Enter width of room :");
		width = keyboard.nextInt();
		System.out.println("Enter height of room :");
		height = keyboard.nextInt();
		totalsqft = 2 * ((length * height) + (width * height));
		paintNeeded = totalsqft/COVERAGE;
		System.out.print("For a room with length " + length + "ft, width " + width + "ft, and height " + height + "ft, the total gallons of paint needed is ");
		System.out.printf("%.2f", paintNeeded);
		System.out.println("\nEnter number of doors :");
		int doors = keyboard.nextInt();
		System.out.println("\nEnter number of windows :");
		int windows = keyboard.nextInt();
		totalsqft = totalsqft - (windows * 20) - (doors * 25);
		paintNeeded = totalsqft/COVERAGE;
		System.out.print("\nWith " + doors + " door(s) and " + windows + " window(s), the total gallons of paint needed is ");
		System.out.printf("%.2f", paintNeeded);
		double purchase = Math.ceil(paintNeeded);
		double paintCost = 25 * purchase;
		double totalC = paintCost;
		int moulding = (2*(length + width)) + (doors*13) + (windows*12);
		double SqFtTime = Math.ceil(totalsqft/200);
		SqFtTime = SqFtTime * 15;
		int sqftprice = (int) ((SqFtTime/60)*50);
		double mouldTime = Math.ceil(moulding/10);
		mouldTime = mouldTime * 10;
		int mouldprice = (int) ((mouldTime/60)*50);
		double time = SqFtTime + mouldTime;
		time = time/60;
		double timeCost = time * 50;
		totalC = (int)(totalC + timeCost);
		System.out.println("\nInvoice:");
		System.out.printf("\n total cost of paint: %s" ,paintCost );
		System.out.printf("\n total labour cost of painting: %s" , sqftprice   );
		System.out.printf("\n total labour cost of moulding: %s" , mouldprice  );
		System.out.printf("\n total cost: %s" , totalC   );
		//paint covers 275sq. feet/gallon

		//1. Declare integers length, width, height
		//2. Declare doubles totalsqft, paintNeeded

		//3. Declare and initialize object scanner
		//4. Prompt for and read in the length of the room
		//5. Prompt for and read in the height of the room
		//6. Prompt for and read in the width of the room

		//calculations 
		//7. Compute the total square feet of the walls to be painted
		//8. Compute the amount of paint needed

		//output with calculations rounded to 2 decimal places
		//9. Print the length, width, and height of the room and the gallons of paint needed.

		//10. Suppose the room has doors and windows that don't need painting. 


	}

}
