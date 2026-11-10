
public class PiggyBank {
	
	 private int Pennies , nickels , dimes , quarters;
	 private double total;
	
	
	public PiggyBank() {};	
	public PiggyBank(int pennies , int nickels , int dimes ,int quarters) {
		this.Pennies = pennies;
		this.nickels = nickels;
		this.dimes = dimes;
		this.quarters = quarters;
	}
	
	public int getPennies() {
		return Pennies;
	}
	
	public int getnickels() {
		return nickels;
	}
	public int getdimes() {
		return dimes;
	}
	public int getquarters() {
		return quarters;
	}
	
	public double gettotal() {
		 total = ( Pennies * 0.01 + nickels * 0.05 + dimes * 0.1 + quarters * 0.25);
	     return total;
	
	}

	public String toString() {
		return "Pennies : " + getPennies() + "nickels :" + getnickels() + "dimes :"+ getdimes()+ "quarters: "+ getquarters();
		
	}
	public void combinepiggybank(PiggyBank B) {
		this.total +=  B.gettotal();
		this.total -= total;
	}
	public static void main(String[] args) {
	   
		

		
	}

}
