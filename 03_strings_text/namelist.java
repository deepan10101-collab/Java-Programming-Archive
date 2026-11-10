package unit3;

import java.util.*;
import java.io.*;
public class namelist {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		FileWriter fwriter = new FileWriter("numberlist.txt");
		PrintWriter outputfile = new PrintWriter(fwriter);
		
		System.out.println("enter number of friends: ");
		int num_friends = keyboard.nextInt();
		for(int i = 1; i <= num_friends; i++ ) {
			System.out.println("enter friend name: ");
			String firstname = keyboard.next();
			System.out.println("enter friend name: ");
			String lastname = keyboard.next();
			outputfile.println(firstname + " " +lastname);
		}
		
		Scanner one = new Scanner((Readable) fwriter);
		while(one.hasNext()) {
			String line = one.nextLine();
			output(line);
			
		}
		
		outputfile.close();
		
	}

}
