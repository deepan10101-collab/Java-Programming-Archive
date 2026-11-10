package unit3;
import java.util.Scanner;
public class switchcase {
public static void measure(String word){

int length = word.length();
switch(length)
{
case 0:
	System.out.println("short");
case 1:
	System.out.println("Short");
	break;
case 2:
	System.out.println("Short");
	break;
case 3:
	System.out.println("Short");
	break;
case 4:
	System.out.println("medium");
	break;
case 5:
	System.out.println("medium");
	break;
case 6:
	System.out.println("medium");
	break;
case 7:
	System.out.println("medium");
	break;
default:
	System.out.println("long");
}



			//  Use a switch statement to do the following:
			//  For any words that are three letters or less,
			//  display a message that the name is "short"
			//  For words that have four to seven letters, 
			//  print that the name is "medium sized"
			//  The display should say the word is "long"
			//  if there are more than 7 letters
			
//	      Example:
			
//			Enter a name: Elizabeth
//			Enter a second name: Fred
//			
//			Wow, there are 9 letters in Elizabeth - that's a really long name
//			Since Fred has 4 letters, I think that is a medium sized name.
		}

		public static void main(String[] args) {
			// Use a scanner object to ask the user to supply two names.
			// Then, send those names (one at a time) to the measure
			// method - the measure method will evaluate and display
			// a message telling whether the name is short, 
			// medium, or long.
			Scanner keybaord = new Scanner(System.in);
			System.out.println("enter the word: ");
			String word  = keybaord.next();
			measure(word);
			word  = keybaord.next();
			measure(word);
			
		}

	}

