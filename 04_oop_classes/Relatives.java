package unit3;

import java.util.*;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map=new TreeMap<>();


	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		if(personRelative.length<=1) {
			
			return;
		}
		for(String a:personRelative)
		if(map.containsKey(personRelative[0])) {
			map.get(personRelative[0]).add(personRelative[1]);
		}
		else {
			map.put(personRelative[0], new TreeSet<String>());
			map.get(personRelative[0]).add(personRelative[1]);
		}








	}


	public String getRelatives(String person)
	{
		return map.get(person).toString();
	}


	public String toString()
	{
		String output="";

		
		for(String x:map.keySet()) {
			output+= x + " relatives are: " + map.get(x).toString()+"\n";
		}
		
		return output+"\n\n";






		
	}
	public static void main( String args[] ) throws IOException
	{
			File a=new File("H:\\relativesBig.dat");
			Relatives c=new Relatives();
			Scanner b=new Scanner(a);
			
			while(b.hasNextLine()) {
				c.setPersonRelative(b.nextLine());
			}
			System.out.println(c);
	}
}
