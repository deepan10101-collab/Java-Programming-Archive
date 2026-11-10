import javax.swing.JOptionPane;
public class totalbilldialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String bill = JOptionPane.showInputDialog("Enter the mealcharge: ");
     double mealcharge = Double.parseDouble(bill);
     
     
        double taxbill = 0.06 * mealcharge ;
		double taxbilltotal = taxbill + mealcharge; 
		double tipbill = 0.18 * (taxbilltotal);
		
		double total = taxbilltotal + tipbill;
		
		System.out.println("meal total: " + mealcharge);
		System.out.println("tax: " + taxbill);
		System.out.println("subtotal:" + taxbilltotal);
		System.out.println("\ntip: " + tipbill);
		System.out.println("total: " + total);
		
	}

}
