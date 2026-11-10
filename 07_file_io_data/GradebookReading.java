package unit3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class GradebookReading {
	public static void main(String[] args) throws FileNotFoundException {
	      // Open the file.
         File one = new File("Gradebook.txt");
         Scanner reader = new Scanner(one);
	      
	      //Read in each line, as long as they exist, from the file
         int total = 0;
         int grades = 0;
        while(reader.hasNextLine()) {
        	String line = reader.nextLine();        	
        	Scanner chop = new Scanner(line);
        	
        	String name = chop.next();
        	
        	System.out.println(name);
        	System.out.println("Scores: ");
        	while(chop.hasNextInt()) {
        		int num = chop.nextInt();
        		
        		System.out.println(num);
        		total += num;	
        		grades += 1;
        	}
      
         System.out.println("\nTotal score: " + total);
         System.out.println("\nAverage: " + (total / grades )+"\n");
         total = 0;
        }
	}

}

