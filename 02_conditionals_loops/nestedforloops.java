package unit3;
import  java.util.*;
import java.io.*;
public class nestedforloops {

	public static void main(String[] args) throws IOException {

	Scanner one = new Scanner(System.in);
	System.out.println("'entertt he file name: ");
	String name = one.next();
	
	File file = new File(name);
	PrintWriter outputfile = new PrintWriter(file);
	outputfile.println("Thats an huge L");
	outputfile.println("Thats an huge L");
	outputfile.println("Thats an huge L");
	outputfile.println("Thats an huge L");
	Scanner list  = new Scanner(file);	
	while (list.next() != null) {
		String line = list.next();
		System.out.println(line);
	}
	
	outputfile.close();
	
	
	
	}
	
}
