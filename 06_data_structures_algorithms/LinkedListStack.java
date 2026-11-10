package unit3;
import java.util.*;
public class LinkedListStack implements MyStack{
	
	LinkedList<Object> a;
	public LinkedListStack() {
		a=new LinkedList<>();
	}
	
	
	
	
	public static void main(String[] args) {
		LinkedListStack tc = new LinkedListStack();
		System.out.println(tc.push("quarter"));
		
		System.out.println(tc.push("dime"));
		System.out.println(tc.push("nickel"));
		System.out.println(tc.push("penny"));
		System.out.println( "toString() " + tc);
		System.out.println( "peek() " + tc.peek());
		System.out.println( "search for dime " + tc.search("dime"));
		System.out.println( "search for euro " + tc.search("euro"));
		System.out.println( "Size " + tc.size());
		System.out.println("pop() and isEmpty()");
		while (!tc.isEmpty())
		System.out.println(tc.pop());
	}




	




	@Override
	public Object pop() {
		return a.remove();
		
	}




	@Override
	public Object peek() {
		return a[a.length-1];
	}




	@Override
	public boolean isEmpty() {
		if(a.length==0) {
			return true;
		}
		return false;
	}




	@Override
	public int size() {
		return a.length;
	}




	@Override
	public int search(Object b) {
		for(int i=0;i<a.length;i++) {
			if(((String)a[i]).equals(b)) {
				return i;
			}
		}
		return -1;
	}




	@Override
	public Object push(Object item) {
	a.add(item);
	return item;
		
	}
}




 interface MyStack
{
public Object push(Object item);
public Object pop();
public Object peek();
public boolean isEmpty();
public int size();
public int search (Object a);
public String toString();
}