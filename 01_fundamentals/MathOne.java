package unit3;
import java.awt.Color;
import java.math.*;


public class MathOne {
	

		// This method finds the average of q1, q2, and q3
public static double average(int q1, int q2, int q3) {
	
	return (double) (q1 + q2 + q3 ) / 3;

			}

		// This method converts a given Celsius temperature
		// to fahrenheit temperature F = 9/5C + 32
public static double convertToFar(int cels) {
	
	return (double)(9/ (5 * cels)) + 32;

			}

		//this method will return the max number of quarters needed
		//to correctly make change at a cash register
		// e.g. numQuarters(.78) ===> 3
public static int numQuarters(double amount) {
	 return (int) (amount / 0.25);

			}

		//This method will  round x to the nearest hundred place
		// roundHundreds(1297)  ==> 1300
			public static int roundHundreds(int x) {
				
				return Math.round(x);
				
				

			}

			public static double roundHundredths(double x) {
				return Math.round(x);
				

			}

			/* This method will generate a random number between a given range */
			public static int randomNum(int low, int high) {
				return (double)Math.random(low , high);

			}

		//This method will return a random color
			public static Color randomColor() {

			}

			// This method will return the total value of a coin bank
			// We round to 2 decimals to avoid roundoff errors

			public static double total(int pennies, int nickels, int dimes, int quarters) {
				double tot = pennies * .01 + nickels * .05 + dimes * .1 + quarters * .25;
				return (int) (tot * 100 + .5) / 100.0;
			}

		// This method will return the midpont of a segment with
		// endpoints (x1, y1) and (x2, y2).
		// The midpoint will be returned as a String
			public static String mdpt(int x1, int y1, int x2, int y2) {

			}

			public static void main(String[] args) {
				System.out.println(average(4, 4, 5));
//				System.out.println(convertToFar(0));
//				System.out.println(numQuarters(41.28));
//				System.out.println(numQuarters(.78));
//				System.out.println(roundHundreds(125));
//				System.out.println(roundHundredths(12.9756));
//				System.out.println(randomNum(25, 75));
//				System.out.println(randColor());
//				System.out.println("The total value of 3 pennies, 4 nickels, 5 dimes,"
//						+ " and 2 quarters is $" + total(3, 4, 5, 2));
//				System.out.println(mdpt(1,1,4,5));

			}

		}



