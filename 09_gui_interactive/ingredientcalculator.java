import javax.swing.JOptionPane;

public class ingredientcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog("enter the number of coockies: ");
		int nocoockies = (int) Double.parseDouble(input);
		
		double sugaronecoockie = 1.5 / 48;
		double butteronecoockie = 1.0 / 48;
		double flouronecoockie  = 2.75/48 ; 
		
		
		
	    double sugarrequired = nocoockies * sugaronecoockie;
		double butterrequired = nocoockies * butteronecoockie;
		double flourrequired = nocoockies * flouronecoockie;
		
		 System.out.println("the sugar required: " + sugarrequired + "\n" +
		                    "the butter required: " + butterrequired + "\n" +
				            " the flour required: " + flourrequired + "\n");
		
		
	}

	}


