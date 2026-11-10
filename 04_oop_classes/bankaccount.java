
public class bankaccount {

private String acctnumb;
private double balance;

public bankaccount() {
	
}


public bankaccount(double mybalance , String myaccount) {
	balance = mybalance;
	acctnumb = myaccount;
}

public double getbalance() {
	return balance;
}

public String getaccount() {
	return acctnumb;
}

public String toString() {
	return "balance: " + getbalance() + "account number: " + getaccount();
}

public void setbalance(double balance) {
this.balance = balance;
}

public void setacctnumb(String acctnumber) {
acctnumb = acctnumber;
}

public void deposit(double amount) {
	balance += amount;
}	

public void withdraw(double amount) {
	balance -= amount;
}	

public void calculatemonthlyintrest(int rate) {
	balance 
}	







public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
