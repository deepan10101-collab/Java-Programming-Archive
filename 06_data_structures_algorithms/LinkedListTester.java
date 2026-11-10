package chatbot;

public class LinkedListTester {
	public static void main(String[] args) {
		DLinkedList a=new DLinkedList();
		System.out.println(a.size());
		a.addFirst("yo");
		a.addLast("goob");
		a.addFirst("schplop");
		System.out.println(a+" "+a.size());
		a.removeFirst();
		System.out.println(a);
		a.addFirst("glork");
		a.addFirst("blrk");
		a.removeLast();
		System.out.println(a);
		a.removeFirst();
		a.addFirst("schlomp");
		System.out.println(a.removeLast()+" "+a.size());
		a.addLast("gurt");
		System.out.println(a);
		
		
	}
}
