package chatbot;
import java.util.*;




public class Fruits {
  private LinkedList<String> bowl; 
  
  public Fruits() {
	  bowl = new LinkedList<>();
	  bowl.add("banana");
	  bowl.add("cherry");
	  bowl.add("orange");
	  bowl.add("cherries");
	  bowl.add("apricots");
	  
  }
  
  public void displayfruit(){
	  System.out.println(bowl);
  }
  public void displayfruit2(){
	  for(String p: bowl) {
		  System.out.println(p);
	  }
  }
  
  public void displayfruit3() {
	  ListIterator<String> iter = bowl.listIterator();
	  for(String p: bowl) {
		  System.out.println(p);
	  }
  }
  
  public void displayeveryotherfruit() {
	  ListIterator<String> iter = bowl.listIterator();
	  iter.next();
	  while(iter.hasNext()) {
		  iter.next();
		  iter.remove();
	  }
  }
  
  public void sort(String fruit) {
	  ListIterator<String> iter = bowl.listIterator();
	  int x = 0;
	  String name = "";
	  while(bowl != null) {
		  String one = bowl.getFirst();
		  if(one.substring(0, 1).equals("b")) {
			  bowl.remove();
			  name = iter.next();
		  }
	  }
	  
  }
  
  public 
  
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Fruits one = new Fruits();
      one.displayfruit();
      one.displayeveryotherfruit();
      one.displayfruit3();
	}

}
