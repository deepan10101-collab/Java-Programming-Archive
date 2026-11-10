package unit3;
import java.io.*;
import java.util.*;
public class fileswriting {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		FileWriter fwriter = new FileWriter("names1.txt" , true);
		PrintWriter outputfile = new PrintWriter(fwriter);
		
		
		
		System.out.println("enter the number of people: ");
		int num = keyboard.nextInt();
		
		System.out.println("enter the no. of families: ");
		int no_of_families = keyboard.nextInt();
		String name ;
		int age;
		for(int i= 1; i <= no_of_families; i++) {
			System.out.println("\n enter the family name: ");
			String family_name = keyboard.next();
			outputfile.print(family_name);
			for(int j = 1; j<= num ; j++) {
				System.out.print("first name: ");
				name = keyboard.next();
				System.out.print("enter age: ");
				age = keyboard.nextInt();
	            outputfile.print(" " + name + " " + age);			
			}
			
			outputfile.println("\n");
		}
		
		outputfile.close();
		
		
	}

}
