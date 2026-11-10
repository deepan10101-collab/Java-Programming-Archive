package unit3;
import java.util.*;
import java.util.Random.*;
public class quiz {

	public static void main (String[] args) {
		Random one = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		String question1 = "what is the correct attribute: A) import java.util.random; B) import java.utils.random;C) import javas.util.random;D) imports java.util.random;";
		String question2 = "what is the correct attribute: A) Random one = new Random();B) Randoms one = new Random();C)Random ones = new Random();D)Random one == new Random();";
		String question3 = "what is the correct attribute: A) import java.util.random; B) import java.utils.random;C) import javas.util.random;D) imports java.util.random;";
        String question4 = "what is the correct attribute: A) import java.util.random; B) import java.utils.random;C) import javas.util.random;D) imports java.util.random;";
        String question5 = "what is the correct attribute: A) Random one = new Random();B) Randoms one = new Random();C)Random ones = new Random();D)Random one == new Random();";
		
        int order = one.nextInt(5)+1;
        switch(order) {
        case 1:
        	System.out.println(question1);
        	System.out.println(question3);
        	System.out.println(question5);
        	System.out.println(question4);
        	System.out.println(question2);
        	break;
        case 2:
        	System.out.println(question2);
        	System.out.println(question1);
        	System.out.println(question3);
        	System.out.println(question5);
        	System.out.println(question4);
        	break;
        case 3:
        	System.out.println(question3);
        	System.out.println(question1);
        	
        	System.out.println(question5);
        	System.out.println(question4);
        	System.out.println(question2);
        	break;
        case 4:
        	System.out.println(question4);
        	System.out.println(question1);
        	System.out.println(question3);
        	System.out.println(question5);
        	
        	System.out.println(question2);
        	break;
        case 5:
        	System.out.println(question5);
        	System.out.println(question1);
        	System.out.println(question3);
        	
        	System.out.println(question4);
        	System.out.println(question2);
        	break;
        }
        
        System.out.println("enter your answer: ");
        
	} 
}
