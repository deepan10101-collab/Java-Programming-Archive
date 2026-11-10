
public class word {

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
	public int hashcode() {
		return (stuff(theValue))%10;
	}
	@Override
	public boolean equals(Object other) {
		if(((word)other).hashcode()==this.hashcode()) {
			return true;
		}
		return false;
	}
	public int stuff(String x) {
		int countv = 0;
		int countl=0;
		for(int i =0; i < x.length(); i++) {
			if(x.substring(i,i+1).equals("a") || x.substring(i,i+1).equals("e") || x.substring(i,i+1).equals("i") ||x.substring(i,i+1).equals("o") ||x.substring(i,i+1).equals("u") ) {
				countv++;
			}
			char c=x.toLowerCase().charAt(i);
			if(c>=97&&c<=122) {
				countl++;
			}
		}
		return countv*countl;
	}
	
	public String toString() {

		return "the word: " + this.getTheValue()  + " hashcode: " + this.hashcode();	
	
}
	
	public class WordTester
	{
		public static void main(String[] args)
		{
			word one = new word("45alligator");
			System.out.println(one.hashCode());		//should out 4
			
			word two = new word("cat");
			System.out.println(two.hashCode());		//should out 3
			
			word three = new word("whootit");
			System.out.println(three.hashCode());	//should out 1		
		}
	}
}
