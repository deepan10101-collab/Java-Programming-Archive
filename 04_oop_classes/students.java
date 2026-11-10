package chatbot;
import java.util.LinkedList;
import java.util.ListIterator;
public class students {
    
	public void displayReverse() {
		
		while(bowl != null) {
			
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> roster = new LinkedList<String>();
		roster.addLast("priya");
		
		roster.addFirst("deepan");
		roster.addLast("dan");
		roster.addFirst("hello");
		roster.addLast("Tejas");
		
		System.out.println(roster);
		roster.add("Akshay");
		System.out.println(roster);
		roster.remove();
		System.out.println(roster);
		
		ListIterator iter = roster.listIterator();
		
		iter.add("koushik");
		System.out.println(roster);
		iter.add("viren");
		System.out.println(roster);
		iter.add("aditya");
		System.out.println(roster);
		
		System.out.println("remove testing");
		iter.next();
		iter.next();
		iter.previous();
		iter.next();
		iter.remove();
		System.out.println(roster);

	}

}
