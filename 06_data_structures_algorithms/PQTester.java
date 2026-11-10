package chatbot;

	import java.util.Queue;
	import java.util.Arrays;
	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.PriorityQueue;

	public class PQTester
	{
		private PriorityQueue<String> pQueue;

		public PQTester()
		{
			
			
		}

		public PQTester(String list)
		{
			pQueue=new PriorityQueue<>();
			String[] items = list.split(" ");
			for(int i = 0; i < items.length; i++) {
				this.pQueue.add(items[i]);
			}
		}

	
		
		public Object getMin()
		{
			String min = pQueue.peek();
			
			return min;
		}
		public Object remove() {
			return pQueue.poll();
		}
		
		public String getNaturalOrder()
		{   
			String output="";
			while(!pQueue.isEmpty()) {
				output += pQueue.poll();
			}
			
			return output;		
		}
		public String toString() {
			return pQueue.toString();
		}
		
		public static void main ( String[] args )
		{
			PQTester pq;
			pq = new PQTester("I love bananas 3 9 8 10 6564 did you see it ?");
			
            System.out.println();
			System.out.println(pq);
			System.out.println(pq.getMin());
			System.out.println(pq.getNaturalOrder()); 
			System.out.println(pq.remove());
			System.out.println(pq);
			System.out.println(pq.getMin());
			System.out.println(pq.getNaturalOrder()); 
			System.out.println("\n");
				
			System.out.println(pq.remove());
			System.out.println(pq);
			System.out.println(pq);
			System.out.println(pq.getMin());
			System.out.println(pq.getNaturalOrder()); 
			
			
			
			
			//add test cases (see document)		
		}

		//write a toString method
	}

