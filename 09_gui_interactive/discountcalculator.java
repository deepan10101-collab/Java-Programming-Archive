import javax.swing.JOptionPane;
public class discountcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String itemcharge = JOptionPane.showInputDialog("Enter the price of the item(s):  ");
	     double price = Double.parseDouble(itemcharge);
	     
	     String discountinput = JOptionPane.showInputDialog("enter the discount percent(%): ");
	     double discountpercent = Double.parseDouble(discountinput);
	     
	     double discount = discountpercent  / 100;
	     double discountprice = (discount * price);
	     double discountedprice = price - discountprice;
	     
	     double salestax = 0.06 * discountedprice;
	     double finalprice = discountedprice + salestax;
	     
	     
	     
	     
	     System.out.println("the original price: "+ price +"\n"+
	                        "the " + discountpercent + " discount is "+ discountprice+"\n"+
	    		             "the sale price is: " + discountedprice+"\n"+
	                         "6% sales tax is: " + salestax + "\n" +
	    		             "the finalprice is: " + finalprice
	    		              ); 
	}

}
