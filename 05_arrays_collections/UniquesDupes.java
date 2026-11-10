package chatbot;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	Set<String> unqiues;
	Set<String> dupes;
	
	public UniquesDupes() {
		
	}
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		String[] myArray = input.split(" ");
		for(String x: myArray) {
			if(uniques.add(x) == false) {
				continue;
			}
			else {
				uniques.add(x);
			}
		}

		
		//add code

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		//add code
		Set<String> dupes = new TreeSet<String>();
		String[] mydupes = input.split(" ");
		for(String x: mydupes) {
			if(dupes.add(x) == false) {
				dupes.add(x);
			}
			else {
				continue;
			}
		}
		
		return dupes;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "a b c d e f g h a b c d e f g h i j k";
		String input2 = "one two three one two three six seven one two";
		String input3 = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
		UniquesDupes one = new UniquesDupes();
		System.out.println(one.getUniques(input));
		System.out.println(one.getDupes(input));
		System.out.println(one.getUniques(input2));
		System.out.println(one.getDupes(input2));
		System.out.println(one.getUniques(input3));
		System.out.println(one.getDupes(input3));
		
		
        
	}

}