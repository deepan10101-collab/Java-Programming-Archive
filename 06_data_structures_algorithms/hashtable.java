
public class hashtable {
	private ListNode[] map;
	private int n;
	public hashtable() {
		
		n=10;
		map=new ListNode[n];
	}
	public void add(word a) {
		int x=a.hashCode()%n;
		if(map[x]==null) {
			map[x]=new ListNode(a,null);
		}
		else {
			ListNode temp=map[x];
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(new ListNode(a,null));
			
		}
	}
	public void print() {
		for(int i=0;i<map.length;i++) {
			System.out.println("in bucket "+i);
			ListNode temp=map[i];
			while(temp!=null) {
				System.out.print(temp.getValue()+", ");
				temp=temp.getNext();
			}
			System.out.println();
		}
	}
}

class ListNode
{  
	private Object value;
	private ListNode next;
	
	public ListNode(Object initValue, ListNode initNext)
	{ 
		value = initValue; 
		next = initNext; 
	}
	
	public Object getValue() 
	{ 
		return value; 
	}
	
	public ListNode getNext() 
	{ 
		return next; 
	}
	
	public void setValue(Object theNewValue) 
	{ 
		value = theNewValue; 
	}
	
	public void setNext(ListNode theNewNext) 
	{ 
		next = theNewNext; 
	}
}
