package unit3;

	public class StringFuncts {
		// 1.This method will return an email address in the form
		// first.last@ww-p.org
		// getEmail(&quot;Mister&quot;, &quot;Connolly&quot;) ====&gt; mister.connolly@ww-p.org
		public static String getEmail(String first, String last) {
		     return "" + first + "." + last + "@WW-P.org";

		}

		// 2. This method will return initials with periods.
		// getInitials(&quot;Mister&quot;, &quot;Connolly&quot;) ====&gt; M.C.
		public static String getInitials(String first, String last) {

			return first.substring(0 , 1).toUpperCase() + "." + last.substring(0,1).toUpperCase() + ".";)
		}

		// 3. This method will parse the year from a birthdate
		// in the form MMDDYYYY
		// getYear(&quot;06021966) ====&gt; 1966
		public static String getYear(String bday) {
			
			return bday.substring(4 , 8);

		}

		// 4. This method will return a lower case
		// user name in the form of first 3 letters of first name and
		// last 3 letters of last name.
		// getUserName(&quot;Mister&quot;, &quot;Connolly&quot;) ====&gt; mislly
		public static String getUserName(String first, String last) {
			
			return first.substring(0,3).toLowerCase() + last.substring(last.length() - 4).toLowerCase();
		}
		// 5. This method will parse the first name from a full name separated with
		// a space
		// getFirst(&quot;Mister Connolly&quot;) ====&gt; Mister
		public static String getFirst(String fullName) {
			return fullName.substring(0 , fullName.indexOf(" "));
			
		}
		// 6. This method will parse the last name from a full name separated with a
		// space
		// getLast(&quot;Mister Connolly&quot;) ====&gt; Connolly
		public static String getLast(String fullName) {
			return fullName.substring(fullName.indexOf(" ") + 1);
		}
		// 7. This will return a random 4 letter string of letters
		// getRandomWord() ====&gt; CDRT
		public static String getRandomWord() {
			
			String alphabets = "abcdefghijklmnopqrstuvwxyz";
			 
			return alphabets.substring((int)(Math.random() * 26)) + alphabets.substring((int)(Math.random() * 26)) + alphabets.substring((int)(Math.random() * 26)) + alphabets.substring((int)(Math.random() * 26)) ;
			
		}
		// 8. This will return a new word of every other letter
		// everyOtherLetter(&quot;KNIGHTS&quot;) ====&gt; KIHS
		public static String everyOtherLetter(String word) {
			
		}
		// 9. This will return a new word that is the reverse.
		// reverse(&quot;KNIGHTS&quot;) ====&gt; STHGINK
		public static String reverse(String word) {
		}

		// 10. This will return true if the sum of the first digit and the last
		// digit is divisible by 5.
		// checkDigit(&quot;123456789&quot;) ====&gt; TRUE
		// checkDigit(&quot;12345543211&quot;) ====&gt; FALSE
		// checkDigit(&quot;87878787&quot;) ====&gt; TRUE
		public static Boolean checkDigit(String creditCard) {
		}
		// 11. This will return a string where every other letter is capitalized
		// everyOtherLetterCaps(&quot;misterconnolly&quot;) ====&gt; mIsTeRcOnNoLlY
		public static String everyOtherLetterCaps(String word) {
		}
		// 11. This will return a string where every o is replaced with an 8
		// replacesOsWith8s(&quot;TomConnolly&quot;) ====&gt; T8mC8nn8lly
		public static String replaceOsWith8s(String word){
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(&quot;1. Email: &quot; + getEmail(&quot;Mister&quot;, &quot;Connolly&quot;));
		System.out.println(&quot;2. Initials: &quot; + getInitials(&quot;Mister&quot;, &quot;Connolly&quot;));
		System.out.println(&quot;3. Year: &quot; + getYear(&quot;06021966&quot;));
		System.out.println(&quot;4. UserName: &quot; + getUserName(&quot;Mister&quot;, &quot;Connolly&quot;));
		System.out.println(&quot;5. FirstName: &quot; + getFirst(&quot;Mister Connolly&quot;));
		System.out.println(&quot;6. LastName: &quot; + getLast(&quot;Mister Connolly&quot;));
		System.out.println(&quot;7. RandomWord: &quot; + getRandomWord());
		System.out.println(&quot;8. EveryOtherLetter: &quot; + everyOtherLetter(&quot;encyclopedias&quot;));
		System.out.println(&quot;9A. Reverse: &quot; + reverse(&quot;racecar&quot;));
		System.out.println(&quot;9B. Reverse: &quot; + reverse(&quot;JAVA&quot;));
		System.out.println(&quot;10A. CheckDigit: &quot; + checkDigit(&quot;123456&quot;));
		System.out.println(&quot;10B. CheckDigit: &quot; + checkDigit(&quot;123456789&quot;));
		System.out.println(&quot;11. EveryOtherCaps: &quot;+ everyOtherLetterCaps(&quot;misterconnolly&quot;));
		System.out.println(&quot;12.


}

}