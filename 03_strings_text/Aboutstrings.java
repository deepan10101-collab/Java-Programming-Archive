import java.util.Scanner;
public class Aboutstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your first name ===> ");
		String a = keyboard.next();
		System.out.println("Please enter your last name ===> ");
		String b = keyboard.next();
	    System.out.println("Welcome " + a.substring(0,1).toUpperCase() + a.substring(1) +" " +b.substring(0,1).toUpperCase()+b.substring(1) + "!");
	    System.out.println("an analysis of yout name shows that your first name has " + a.length() + " letters");
	    System.out.println("and your last name has " + b.length() + " letters");
	    System.out.println("What is your favorite subject in school? ===>");
	    String subject = keyboard.next().toUpperCase();
	    System.out.println("Great! " + subject + "is a great thing to study and " + subject.toLowerCase() + " is fun as well" );
	    System.out.println("the second letter in this subject is " + subject.charAt(1));
	  
	    // challenge 1
	  
	    System.out.println("let's reverse your last name");
	    String c =  b.substring(0,1).toUpperCase()+b.substring(1);
	    String reversed = "";
	    for (int i = c.length() - 1; i >= 0; i--) { 
           reversed += c.charAt(i);
	    }
	   
       System.out.println("Reversed String: " + reversed);
       reversed =  reversed.substring(0,reversed.length()-1)+ reversed.substring(reversed.length()-1).toLowerCase();
       System.out.println("Hmmm.  I think it looks better like this: " + reversed.substring(0,1).toUpperCase() + reversed.substring(1) );
		// challenge 2
       System.out.println("Let's say your last name in Pig Latin");
	   System.out.println(c + " in pig latin is " + reversed.substring(0,1).toUpperCase() + reversed.substring(1) );
	}

}
