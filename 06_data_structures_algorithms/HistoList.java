

public class HistoList {
	
		private ListNode front;

		public HistoList( )
		{
			front=null;
		}
	


		//ADDS NEW NODE TO THE FRONT OF THE LIST FOR LET IF IT DOES NOT EXIST.
		//IF IT EXISTS, IT BUMPS UP LET'S COUNT BY ONE
		public void add(Object obj)
		{
			
			if(front==null) {
				front=new ListNode(new ThingCount(obj,1),null);
			}
			else {
				boolean found=false;
				ListNode temp=front;
				 
				while(temp!=null) {
					ThingCount temp2=(ThingCount)temp.getValue();
					if(temp2.compareTo(obj)==0){
						if(temp2.getThing().equals(obj)) {
							found=true;
							temp2.setCount(temp2.getCount()+1);
							break;
						}
						
					}
					temp = temp.getNext();
					
				}
				if(!found) {
					front=new ListNode(new ThingCount(obj,1),front);
				}
			}
			



		}


		//RETURNS THE LIST AS A BIG STRING
		public String toString()
		{
			String output = "";
			ListNode temp=front;
			
			while(temp!=null) {
				ThingCount temp2=(ThingCount)temp.getValue();
				output=output+temp2.toString();
				temp = temp.getNext();
				
			}
			return output;
		}
		

		public static void main(String[] args) {
			HistoList test = new HistoList();
			String testString = "ABCDEFABCDEFFEDCBAAAAABBBBBCCCDAAAAAAAEEFFF";
			for(char c : testString.toCharArray())
			{
				test.add(c);
			}
			System.out.println(test);


			//add more test cases
			
			
			//demonstrate bad data check
			test = new HistoList();
			test.add("dog");
			test.add(33);
			test.add(3.4);
			test.add('k');
			test.add('k');
			test.add('k');
			test.add("dog");
			test.add("3.4");
			test.add("67");
			System.out.println(test);
		}
}
