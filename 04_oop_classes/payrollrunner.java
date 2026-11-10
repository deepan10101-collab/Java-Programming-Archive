package unit3;
import java.util.*;
public class payrollrunner {

	public static void main (String[] args) {
		payroll one = new payroll();
		payroll two = new payroll();
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("How many hours did the employee work :");
		one.hoursworked = keyboard.nextDouble();
		System.out.println("what is the employees hourly payrate :");
		one.payrate = keyboard.nextDouble();
		System.out.println(one.getgrosspay());
		
		System.out.println("How many hours did the employee work :");
		two.hoursworked = keyboard.nextDouble();
		System.out.println("what is the employees hourly payrate :");
		two.payrate = keyboard.nextDouble();
		System.out.println(one.getgrosspay());
		
	}
}
