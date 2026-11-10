package unit3;

public class namegamesobjects {

	private String first;
	private String nickname;
	private String  last;
	private String letter;
	
	public namegamesobjects (String first1 , String nickname1 , String last1 , String letter1) {
		first = first1;
		nickname = nickname1;
		last = last1;
		letter = letter1;
}
	public String toString() {
		return "Nice to meet you, " + first + " " + nickname + " "+ last+"\n";
	}

	public String toletters() {
    int fullname = first.length() + last.length();
 return "You have " + first.length() + " letters in your first name, "+"\n" + "You have " + last.length() + " letters in your last name\n" + "Your full name has " + fullname + " letters.";
}
	public String intials() {
	 return "your intials are: " + first.charAt(0) + "." + last.charAt(0)+ ".\n";
	
}
	public String letterlocations() {
		String fullname1 = first + last;
		 return "the first location of " +letter +" in your name is at position "+fullname1.indexOf(letter) +"\n" + "The last location of " + letter +" in your name is at position "+ fullname1.lastIndexOf(letter) ;
		
	}
	
	public static void main (String[] args) {
	namegamesobjects one = new namegamesobjects("Eloise","Funny","Simonson","s");
	 System.out.println(one.toString());
	 System.out.println(one.toletters());
	 System.out.println(one.intials());
	 System.out.println(one.letterlocations());
	
	
	}
	}
