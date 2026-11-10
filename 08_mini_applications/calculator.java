import java.util.*;
public class calculator {
	
	public static void main(String[] args) {
		Stack<Integer> nums=new Stack<>();
		Stack<String> ops=new Stack<>();
		String[] signs = {"+" , "-" , "/" , "*"};
		Scanner one = new Scanner (System.in);
		System.out.println("enter in equation make sure there are spaces between the numbers and ops");
		String eq=one.nextLine();
		String[] stuff=eq.split(" ");
		
		for(int i=0;i<stuff.length;i++) {
			int y=(int)(stuff[i].charAt(0));
			
			if(!(y>=48&&y<=57)) {
				
				if(ops.isEmpty()||y==40||ops.peek().equals("(")) {
					ops.push(stuff[i]);
					continue;
				}
				
				if(y==41) {
					int x=i;
					while(y!=40) {
						
						nums.push(process(nums.pop(),nums.pop(),ops.pop()));
						System.out.println("nums "+nums+" and ops "+ops);
						i--;
						y=(int)(stuff[i].charAt(0));
					}
					ops.pop();
					i=x;
					continue;
				}
				
			
				
				int x=(int)(ops.peek().charAt(0));
				if(x==43||x==45) {
					ops.push(stuff[i]);
				
				}
				else {
					if((y==94)&&(x==42||x==47)) {
						ops.push(stuff[i]);
					}
					else {
						nums.push (process(nums.pop(),nums.pop(),ops.pop()));
						i--;
					}
				}
			}
			else {
				nums.push(Integer.parseInt(stuff[i]));
				
			}
			System.out.println("nums "+nums+" and ops "+ops);
			
		}
		while(!ops.isEmpty()) {
			
			nums.push(process(nums.pop(),nums.pop(),ops.pop()));
			System.out.println("nums "+nums+" and ops "+ops);
		}
		System.out.println(nums);
		
		}
	public static Stack<Integer> reverse(Stack<Integer> a){
		Stack<Integer> temp=new Stack<>();
		while(!a.isEmpty()) {
			temp.push(a.pop());
		}
		return temp;
	}
	public static int process(int a,int b,String c) {
		if(c.contains("+")) {
			return b+a;
		}
		else if(c.contains("/")) {
			return b/a;
		}
		else if(c.contains("*")) {
			return b*a;
		}
		else if(c.contains("^")) {
			return (int)Math.pow(b, a);
		}
		
		else  {
			return b-a;
		}
	}
		
	}


	

