package chatbot;
import java.util.*;
public class LLQueue implements MyQueue{
	private int size;
	int[] a;
	public LLQueue(int s) {
		size=s;
		a=new int[size];
	}
	int rPTR=0;
	int wPTR=0;
	
	public static void main(String[] args) {
		LinkedList a=new LinkedList<Integer>();
		a.add(343);
		a.getFirst();
	}
		
		
	public void append(LLQueue q)
	{
		
		
	}
	
	//* Inserts q to the current queue alternately.
	//* Queue q is then cleared.
	
	public LLQueue alternate(LLQueue q)
	{
	}
	@Override
	public boolean empty() {
		if(rPTR==wPTR) {
			return true;
		}
		else {
			return false;
	}
		public boolean filled() {
			if(wPTR!=size-1) {
				return wPTR+1==rPTR; 
					
				
			}
			else {
				return rPTR==0;
			}
		
		
	}
	@Override
	public boolean offer(Object item) {
	
	}
	@Override
	public Object poll() {
		
	}
	@Override
	public Object peek() {
		return a[rPTR];
	}

}

 interface MyQueue {
	//Tests if this queue is empty
	public boolean empty();
	//Inserts the specified element into this queue
	public boolean offer(Object item); //Different from add()?
	//Retrieves and removes the head of this queue,
	//or returns null if this queue is empty.
	public Object poll(); //Different from remove()?
	//Retrieves, but does not remove, the head of this queue,
	//or returns null if this queue is empty
	public Object peek();

	//Returns a String representation of your queue
	public String toString();
 }
 

	
