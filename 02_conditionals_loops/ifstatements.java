package unit3;
import java.util.*;
public class ifstatements {

	private int num1;
	private int num2;
	private int num3;
	
	
public ifstatements() {
	
}
public String equal(){
	
	String equals = null;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("number : ");
    num1 = keyboard.nextInt();
    System.out.println("number : ");
    num2 = keyboard.nextInt();
    System.out.println("number : ");
    num3 = keyboard.nextInt();
    if(num1 == num2 && num1 == num3) {
    	equals = "numbers are equal";
    }
    else if(num1 != num2 && num1 != num3 && num2 != num3) {
    	equals = "numbers are not equal";
    }
    
    
    return equals;
    
}
public static void main(String[] args) {
	
	ifstatements one = new ifstatements();
	System.out.println(one.leapyear());
}
}
