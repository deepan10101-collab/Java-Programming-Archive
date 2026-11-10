import java.util.*;

public class linkedlists {
	private LinkedList<String> bowl;
public linkedlists() {
	bowl = new LinkedList<>();
	bowl = new LinkedList<>();
	  bowl.add("banana");
	  bowl.add("cherry");
	  bowl.add("orange");
	  bowl.add("cherries");
	  bowl.add("apricots");

	}

 public void sort(String fruit) {
	 ListIterator<String> iter = bowl.listIterator();
	 while(iter.hasNext()) {
		 if(iter.next().compareToIgnoreCase(fruit)>0) {
			 iter.previous();
			 iter.add(fruit);
		 }
	 }
	 
public void removefirst(String beginningLetter) {
	
}
	 
}
}
