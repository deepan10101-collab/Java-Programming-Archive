	
	public class CashRegister {
		/**
		* A cash register is an Object with a name and a total
		*
		* @param cashierName
		*
		* total
		*/
		private String cashierName;
		private double total;
		/**
		* default constructor
		*/
		public CashRegister() {
		}
		/**
		* Overloaded Constructor Creates a CashRegister with specified name and
		* total
		*/
		public CashRegister(String myName, double myTotal) {
			this.cashierName = myName;
			this.total = myTotal;
		}
		/**
		* Returns the cashierName of this CashRegister
		*/
		public String getName() {
           return cashierName;
		}

		/**
		* returns theCashRegister total
		*/
		public double getTotal() {
             return total;
		}

		/**
		* Returns a String representation of this CashRegister
		*/
		public String toString() {
		
			return "This is the name of the cash : ier" + cashierName + "this is the total : " + total;

		/**
		* Adds to the total a specified amount totalSale.
		*/
		}
		private void addToRegister(double totalSale) {
                total += totalSale;
		}
		/**
		* Changes the cashier name to a specified name
		*/
		public void changeName(String otherCashier) {
			
			cashierName = otherCashier;

		}
		/**
		* Calculates and returns change due. Adds sale to register
		*/
		public double makeChange(double totalSale, double amountTendered) {
                 totalSale -=  amountTendered;
                 total += totalSale;
                 return totalSale;
		}
		/**
		* Adds total from other cashRegister.
		*/
		public void combineRegister(CashRegister other) {
                 this.total += other.total;
                 other.total -= other.total;
		}

	public static void main(String[] args) {
		
		

	

}}
