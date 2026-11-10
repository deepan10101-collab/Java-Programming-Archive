import java.util.*;
public class binary {
    int input;
	public binary(int input) {
		this.input = input;
		
	}
	
	public void convert(int input1) {
		Stack<Integer> one = new Stack<Integer>();
		int[] list = new int[8];
		int x = 128;
		for(int i = 0; i < list.length; i++) {
			list[i] = x;
			x = x/2;
		}
		
		
		
		
	for ( int i = 0; i < list.length; i++) {
		if(input1 >= list[i]) {
			one.push(1);
			input1 -= list[i]; 
		}
		else {
			one.push(0);
		}
	}
	  Stack<Integer> two  = new Stack<Integer>();
	  while(!one.isEmpty()) {
		  two.push(one.pop());
	  }
	  
	  System.out.println(two);
	}
	

	public static void main(String[] args) {
		binary one = new binary(50);
		one.convert(50);
		one.convert(201);
	}
	
	
	
}
