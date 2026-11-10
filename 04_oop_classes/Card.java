package BlackJack;
import java.util.*;
public class Card implements Comparable<Card>{
	private String value="";
	private String suit="";
	public Card(String val,String suit) {
		value=val;
		this.suit=suit;
	}
	public String getSuit() {
		return suit;
	}
	public Integer getVal() {
		int x;
		if(value.equals("A")) {
			return 11;
		}
		else {
			try {
				x=Integer.parseInt(value);
				
			}catch(NumberFormatException e) {
				x=10;
			}
		}
		return x;
	}
	@Override
	public int compareTo(Card o) {
		return this.getVal().compareTo(o.getVal());
		
	}
	public String toString() {
		return ("the value is "+value+" and the suit is "+suit+"\n");
	}

}















class Deck{
	private Stack<Card> deck;
	public Deck() {
		deck=new Stack<>();
		loadDeck();
	}
	public Stack<Card> getDeck() {
		return deck;
	}
	public void loadDeck(){
		String[] suit= {"spades","hearts","clubs","diamonds"};
		for(int i=0;i<suit.length;i++) {
			for(int j=2;j<=10;j++) {
				deck.push(new Card(((Integer)j).toString(),suit[i]));
			}
			deck.push(new Card("J",suit[i]));
			deck.push(new Card("Q",suit[i]));
			deck.push(new Card("K",suit[i]));
			deck.push(new Card("A",suit[i]));
			
		}
		
	}
	public String toString() {
		return deck.toString();
	}
	
	public int size() {
		return deck.size();
	}
	public Card deal() {
		return deck.pop();
	}
	private void reverse() {
		Stack<Card> temp=new Stack<>();
		while(!deck.isEmpty()) {
			temp.push(deck.pop());
		}
		deck=temp;
	}
	private Stack<Card> reverse(Stack<Card> x){
		Stack<Card> temp=new Stack<>();
		while(!x.isEmpty()) {
			temp.push(x.pop());
		}
		return temp;
	}
	public void combineDecks(Stack<Card> other) {
		deck.addAll(other);
	}
	public void cut() {
		int rand=(int)(Math.random()*52);
		int i=0;
		Stack<Card> temp=new Stack<>();
		while(i<rand) {
			temp.push(deck.pop());
			i++;
		}
		combineDecks(temp);
	}
	public void bridgeShuffle() {
		Stack<Card> finale=new Stack<>();
		Stack<Card> temp=new Stack<>();
		int i=0;
		while(i<26) {
			temp.push(deck.pop());
			
			i++;
		}
		while(!temp.isEmpty()&&!deck.isEmpty()) {
			finale.push(temp.pop());
			finale.push(deck.pop());
			
		}
		deck=finale;
	}
	
	public void completeShuffle() {
		for(int i=0;i<7;i++) {
			this.bridgeShuffle();
			this.cut();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
