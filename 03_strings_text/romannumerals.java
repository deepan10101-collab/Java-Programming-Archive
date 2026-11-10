package unit3;
import java.util.*;
public class romannumerals {
private int num;
public romannumerals() {
	
}	
public void num() {
  Scanner keyboard = new Scanner(System.in);
  System.out.println("enter a number within the range 1 - 10");
  num = keyboard.nextInt();
  
  if (num >= 1 && num <= 10) {
	  
	  if (num == 1) 
		  System.out.println("I");
	  if (num == 2) 
		  System.out.println("II");
	  if (num == 3) 
		  System.out.println("III");
	  if (num == 4) 
		  System.out.println("IV");
	  if (num == 5) 
		  System.out.println("V");
	  if (num == 6) 
		  System.out.println("VI");
	  if (num == 7) 
		  System.out.println("VII");
	  if (num == 8) 
		  System.out.println("VIII");
	  if (num == 9) 
		  System.out.println("IX");
	  if (num == 10) 
		  System.out.println("X");  
  }
  else {
	  System.out.println("error");
  }
}
public static void main(String[] args) {
	romannumerals one = new romannumerals();
	one.num();
}
}
