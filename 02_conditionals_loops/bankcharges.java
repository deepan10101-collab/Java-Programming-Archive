package unit3;
import java.util.*;
public class bankcharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner keyboard = new Scanner(System.in);
System.out.println("beginning balance fee: ");
double beginningbalance = keyboard.nextDouble();
System.out.println("no. of checks: ");
double checks = keyboard.nextInt();
double endbalance = 0;
double checksprice = checks;


if (checks < 20 && checks > 0)
{
	checksprice *= 0.10;
}
else if(checks > 20 && checks < 39)
{
	checksprice *= 0.08;
}
else if(checks > 40 && checks < 59)
{
	checksprice *= 0.06;
}
else if(checks > 60)
{
	checksprice *= 0.04;
}
endbalance = (beginningbalance - 10) - checksprice;
System.out.printf("beginning balance : %.2f" ,beginningbalance );
System.out.printf("\nservice fee for "+ checks + " checks: $ %.2f" , checksprice);
if(beginningbalance < 400.00) {
	endbalance = beginningbalance - 15;
	System.out.println("additional $15 charge for balance below $400");
}
System.out.printf("\nEnding Balance: $ %.2f" , endbalance );
	}

}