package unit3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class GradebookWrite {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		//Declare and instantiate the necessary files
		FileWriter fwriter = new FileWriter("Gradebook.txt", true);
		PrintWriter outputFile = new PrintWriter(fwriter);
		
		// Enter names with a loop
		System.out.println("Put in names and grades - when finished\n" + "hit 'enter' instead of entering a name");
		System.out.println("Enter student name");
		String name = keyboard.nextLine();
		while (!name.equals("")) {
			
			outputFile.print(name + " ");
			System.out.println("Enter as many grades as you like. \n"
					+ "Just enter -1 when finished entering grades for each student");
			//Use a loop to enter the grades - reset to zero at top
			int grade = 0;
			while (grade >= 0) {
				System.out.println("Enter next grade");
				grade = keyboard.nextInt();
				keyboard.nextLine();  // remember, grab carriage return
				if(grade >= 0)  // only enter grades, not the '-1'
					outputFile.print(grade + " ");

			}
			// after all the numbers are in, carriage return
			outputFile.println();
			// use this internal read to work with while loop
			System.out.println("Enter next student name");
			name = keyboard.nextLine();
		}
		outputFile.close();

	}
}
