package BlackJack;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;	
public class tempcode{
	
	public static void main(String[] args) {
		System.out.println("its time to play jack black\n how much money do you want to bet");
		Scanner in=new Scanner(System.in);
		
		int bet = in.nextInt();
		int balance = 10000;
		Deck one = new Deck();
		one.completeShuffle();
		
		Card playercard1 = one.deal();	
		System.out.println("this is ur first card: "+ playercard1);
		Card playercard2 = one.deal();	
		System.out.println("this is ur second card: "+ playercard2);
		int total = playercard1.getVal() + playercard2.getVal();
		Card dealercard1 = one.deal();
		System.out.println("dealer card 1: " + dealercard1.getVal());
		Card dealercard2 = one.deal();
		int dealertotal = dealercard1.getVal()+dealercard2.getVal();
		while(total < 21||dealertotal<21) {
		
		  System.out.println("do u want to hit or stand 0 for hit 1 for stand: ");
		  int input=in.nextInt();
		  if(input == 0) {
			  int temp = one.deal().getVal();
			  if(temp == 11) {
				  System.out.println("u have an ace: what do u want 1 or 11");
				  total += in.nextInt();
			  }
			  else {
			  System.out.println("i ant showing u the entire card gng: this is the value: " + temp);
			  total+= temp;
			  }
			  
			  
		  }
		  
			  if(total > 21) {
				  System.out.println("its over for u");
				  balance = balance - bet;
				  System.out.println("this is ur balance: " + balance);
				  break;
			  }
			  else if(total == 21){
				  System.out.println("u win");
				  balance = balance + bet* 2;
				  System.out.println("this is ur balance: " + balance);
				  break;
			  }
			  if(dealertotal<=16) {
				  dealertotal+=one.deal().getVal();
			  }
			  if(dealertotal>21){
				  System.out.println("the dealer just went over 21 he's FINISHED. you won but a real gambler keeps gambling");
				  balance = balance + bet* 2;
				  System.out.println("this is ur balance: " + balance);
				  break;
			  }
		  
		 
		  
		
		
		  
		
		
	}
	
	
	}
	
		
	
	

}

