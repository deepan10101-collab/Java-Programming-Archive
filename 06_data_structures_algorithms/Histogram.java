package unit3;


import java.util.*;
public class Histogram
{
	
	private Map<String,Integer> histogram;
	String m;
	public Histogram()
	{
		histogram = new HashMap<>();
		m="";
	}

	public Histogram(String sent)
	{
		histogram=new HashMap<>();
		m=sent;
		

		
	}
	
	public void setSentence(String sent)
	{
		m=sent;
	}

	public String toString()
	{
		for(String x : m.split(" "))

		{

		if(histogram.get(x)==null)

			histogram.put(x,0);

		histogram.put(x,histogram.get(x)+1);

		}
		String output="";
		for(String x:histogram.keySet()) {
			output+= x + " " + histogram.get(x)+"\n";
		}
		String allStars="";
		return output+"\n\n";
	}
	public static void main( String args[] ) 
	{
		Histogram test = new Histogram("a b c d e f g h i a c d e g h i h k");
		System.out.println(test);

		test.setSentence("1 2 3 4 5 6 1 2 3 4 5 1 3 1 2 3 4");
		System.out.println(test);

		test.setSentence("Y U I O Q W E R T Y");
		System.out.println(test);

		test.setSentence("4 T # @ ^ # # #");
		System.out.println(test);	
	}
}