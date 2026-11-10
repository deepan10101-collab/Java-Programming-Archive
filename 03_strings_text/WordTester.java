import java.io.*;
import java.util.*;
 class word {

	private String theValue; 
	
	public word(String s) {
		setTheValue(s);
	}

	public String getTheValue() {
		return theValue;
	}

	public void setTheValue(String theValue) {
		this.theValue = theValue;
	}
	public int hashCode() {
		return (stuff(theValue)%10);
	}
	@Override
	public boolean equals(Object other) {
		if(((word)other).hashCode()==this.hashCode()) {
			return true;
		}
		return false;
	}
	public int stuff(String x) {
		int countv = 0;
		
		for(int i =0; i < x.length(); i++) {
			String b=x.substring(i,i+1).toLowerCase();
			if(b.equals("a") || b.equals("e") || b.equals("i") ||b.equals("o") ||b.equals("u") ) {
				countv++;
			}
			
		}
		return countv*x.length();
	}
	
	public String toString() {

		return "the word: " + this.getTheValue()  + " hashcode: " + this.hashCode();	
	
}
	
	
}
 public class WordTester
	{
		public static void main(String[] args) throws IOException
		{
			hashtable soldier_boy=new hashtable();
			File ryan=new File("words.dat");
			Scanner omelanda=new Scanner(ryan);
			int x=Integer.parseInt(omelanda.nextLine());
			while(x>0) {
				soldier_boy.add(new word(omelanda.nextLine().trim()));
				x--;
			}
			soldier_boy.print();
		}
	}
