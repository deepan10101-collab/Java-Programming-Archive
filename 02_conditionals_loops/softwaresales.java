package unit3;
import java.util.*;
public class softwaresales {
private int quantity;
private double total;
public softwaresales() {
	
}
public void total() {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("what is the quantity: ");
	quantity = keyboard.nextInt();
	if(quantity > 10 && quantity < 19)
		total = (99 * quantity) - (0.2 * (99 * quantity));
	else if (quantity > 20 && quantity < 49)	
		total = (99 * quantity) - (0.3 * (99*quantity));
	else if (quantity > 50 & quantity < 99)
		total = (99*quantity) - (0.4 * (99*quantity));
	else if (quantity > 100)
		total = (99*quantity) - (0.5 * (99*quantity));
	else
		total = 99 * quantity;
	System.out.println("          Bill");
	System.out.println("_________________________");
	System.out.println("QUANTITY: " + quantity);
	System.out.println("total: " + total);
	System.out.println("amount saved:" + ((quantity * 99) - total));
	System.out.println();
}
	public static void main (String[] args) {
		softwaresales one = new softwaresales();
		one.total();
	}
}
