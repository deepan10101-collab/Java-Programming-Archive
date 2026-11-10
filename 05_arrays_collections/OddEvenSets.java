package chatbot;

import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
	 	// What should still exist in a no-arg constructor
		// given what you know about the object?
		odds = new HashSet<Integer>();
		evens = new HashSet<Integer>();
		
	}

	public OddEvenSets(String line)
	{
		this();
		Scanner chop = new Scanner(line);
		String[] one = line.split(" ");
		for(String x: one) {
			if(Integer.parseInt(x) % 2== 0) {
				evens.add(Integer.parseInt(x));
			}
			else {
				odds.add(Integer.parseInt(x));
			}
		}
		
		// Using the String parameter, separate
		// the data and populate the evens and odds Sets
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
	
	
	
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner(new File("oddevendata.dat"));
		while(file.hasNext())
		{
			String sent = file.nextLine();
			OddEvenSets test = new OddEvenSets(sent);
			System.out.println(test);
		}
	
}
}