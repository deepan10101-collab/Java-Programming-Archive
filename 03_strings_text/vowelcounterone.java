package unit3;
import static java.lang.System.*;
public class vowelcounterone {
	
		public static String getNumberString( String s)
		{
			for(int i = 0; i < s.length(); i++ ) {
				if(s.charAt(i) == "a" || s.charAt(i) == "e" || s.charAt(i) == "i" || s.charAt(i) == "o" || s.charAt(i) == "u") {
					 s.charAt(i) = i;	
				}
			}
			return s ;
		
	}
}
