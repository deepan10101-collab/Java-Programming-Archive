package unit3;

public class addingapples {
String s = "";
int total ; 
public addingapples(String s) {
	this.s = s;
}

public String total() {
	for(int i = 0; i <= s.length() - 1; i++ ) {
		for(int j = 0; j <= 9 ; j++) {
			try {
				if(Integer.parseInt(s.substring(i , i + 1)) == j ) {
		        	   total += j;
		        }
			}
			catch (NumberFormatException e) {
				
			}
		}	
	}
	
	return "the total number of fruits are : " + total;
}

public static void main(String[] args) {
	addingapples one = new addingapples("Ellen has 6 apples, Bob has 8 apples, and Chris has 9 apples. How many apples do they have?");
	System.out.println(one.total());
}
}
