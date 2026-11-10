package unit3;
import java.io.*;
import java.io.IOException;
import java.util.*;
public class inputandoutputfiles {

	public static void main(String[] args) throws IOException {
	
	Scanner keyboard = new Scanner(System.in);
	
	FileWriter fwriter = new FileWriter("numberlist.txt");
	PrintWriter outputfile = new PrintWriter(fwriter);
	
	outputfile.println("John wick");
	outputfile.println("James Bond");
	outputfile.println("Tony Stark"); 
	
	
	System.out.println("enter the number of of numbers: ");
	int count = keyboard.nextInt();
	keyboard.nextLine();
	
	System.out.println("lower bound");
	int lower = keyboard.nextInt();
	keyboard.nextLine();
	
	
	System.out.println("upper bound");
	int upper = keyboard.nextInt();
	keyboard.nextLine();
	
	for(int i = 0; i < count; i++) {
		int number = (int) (Math.random() * (upper - lower + 1) + 1);
		outputfile.println(number);
		
	}
	
	System.out.println("enter number of friends: ");
	int num_friends = keyboard.nextInt();
	for(int i = 1; i <= num_friends; i++ ) {
		System.out.println("enter friend name: ");
		String name = keyboard.next();
		outputfile.println(name);
	}
	
	System.out.println("file is written");
	outputfile.close();
	}
}
