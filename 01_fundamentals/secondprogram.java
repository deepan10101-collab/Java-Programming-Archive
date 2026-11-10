package unit3;
import java.util.*;
public class secondprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner keyboard = new Scanner(System.in);
     int descision;
     do {
     System.out.println("enter the first num: ");
     
     int num1 = keyboard.nextInt();
     System.out.println("enter the second num: ");
     int num2 = keyboard.nextInt();
     System.out.println(num1 + num2);
     System.out.println("type 1 to continue and 2 ");
     descision = keyboard.nextInt();
     
     }
     while(descision != 2);
     
	}

}
