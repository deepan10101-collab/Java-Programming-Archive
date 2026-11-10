package chatbot;
class DListNode
{
public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public DListNode getNext() {
		return next;
	}
	public void setNext(DListNode next) {
		this.next = next;
	}
	public DListNode getPrevious() {
		return previous;
	}
	public void setPrevious(DListNode previous) {
		this.previous = previous;
	}
private Object value;
private DListNode next;
private DListNode previous;
public DListNode(Object initValue, DListNode initNext, DListNode initPrev)
{
value= initValue;
next = initNext;
previous = initPrev;
}
}
public class DLinkedList {
	
	
private DListNode firstNode;
private DListNode lastNode;
/**
* Construct an empty list
*/
public DLinkedList() {
firstNode = null;

lastNode = null;
}
public DListNode getFirstNode() {
	return firstNode;
}
public void setFirstNode(DListNode firstNode) {
	this.firstNode = firstNode;
}
public DListNode getLastNode() {
	return lastNode;
}
public void setLastNode(DListNode lastNode) {
	this.lastNode = lastNode;
}
/**
* Returns true if the list contains no elements
*/
public boolean isEmpty() {
	if(firstNode==null&&lastNode==null){
		return true;
	}
	else {
		return false;
	}
}
/**
* Inserts the argument as the first element of this list.
* ts is circular.FYI.
*/
public void addFirst(Object o) {
	 if(this.size() == 0) {
		 firstNode = new DListNode(o,null,null);
		 firstNode.setPrevious(firstNode);
		 firstNode.setNext(firstNode);
	 }
	 else {
		
		 this.addLast(o);
		 firstNode=lastNode;
		 lastNode=lastNode.getPrevious();
	 }
	}
	
/**
* Inserts the argument as the last element of this list.
*/
	// assume that there is one node already 

public void addLast(Object o) {
	if(this.size()==1) {
		firstNode.setNext(new DListNode(o,firstNode,firstNode));
		lastNode=firstNode.getNext();
		firstNode.setPrevious(lastNode);
	}
	else {
		lastNode.setNext(new DListNode(o,firstNode,lastNode));
		lastNode=lastNode.getNext();
		firstNode.setPrevious(lastNode);
		
	}
}
/**
* Removes and returns the first element of this list.
* yo ts is circular.
*/
public Object removeFirst() {
	if(firstNode == null) {
		return new Object();
	}
	else if(firstNode.getNext() == firstNode) {
		{
			int firstNode=3;
			System.out.println(firstNode);
			
		}
		Object n = firstNode.getValue();
		firstNode = null;
		return n;
	}
	firstNode = firstNode.getNext();
	DListNode x = lastNode.getNext();
	
	lastNode.setNext(firstNode);
	return x.getValue();
	
}
/**
* Removes and returns the last element of this list.
*/
public Object removeLast() {
	if(firstNode == null) {
		return new Object();
	}
	lastNode=lastNode.getPrevious();
	firstNode=lastNode.getNext();
	return this.removeFirst();
	
/**
* Returns a String representation of the list.
*/}
public String toString() {
	
	String value = "";
	if(firstNode==null) {
		return null;
	}
	value=value+firstNode.getValue()+" ";
	DListNode temp=firstNode.getNext();
	while(temp!=firstNode) {
		value=value+temp.getValue()+" ";
		temp=temp.getNext();
	}
	return value;
	}
/**
* Returns the number of elements in the list as an int.
*/
public int size() {
	if(firstNode==null) {
		return 0;
	}
	int count = 1;
	DListNode curr = firstNode;
	while(curr.getNext()!=firstNode) {
	    count++;
		curr = curr.getNext();
		
	}
	return count;
/**
* Removes all of the elements from this list.
*/}
private void clear() {
/**
* Returns a DListIterator.
*/
	
	firstNode=null;
	lastNode=null;
}
public DListIterator iterator() {
return new DListIterator(this);
}
}
//circular 

class DListIterator {
	
public DListNode getCurrent() {
		return current;
	}
	public void setCurrent(DListNode current) {
		this.current = current;
	}
	public DListNode getPrevious() {
		return previous;
	}
	public void setPrevious(DListNode previous) {
		this.previous = previous;
	}
	public DLinkedList getMyList() {
		return myList;
	}
	public void setMyList(DLinkedList myList) {
		this.myList = myList;
	}
	public boolean isCanRemove() {
		return canRemove;
	}
	public void setCanRemove(boolean canRemove) {
		this.canRemove = canRemove;
	}
private DListNode current;
private DListNode previous;
private DLinkedList myList;
private boolean canRemove; // for remove() method. true if OK to call

// remove()

public DListIterator(DLinkedList list) {
myList = list;
current = list.getFirstNode();
previous = list.getFirstNode();
canRemove = false;
}
public String toString() {
	String b="";
	DListNode temp=current;
	b=b+temp.getValue();
	temp=temp.getNext();
	while(temp!=current) {
		b=b+temp.getValue()+" ";
		temp=temp.getNext();
	}
	
	return b;
	
}
public boolean hasPrevious() {
	if(previous.getPrevious()!=myList.getLastNode()) {
		return true;
	}
	else {
		return false;
	}
}
public boolean hasNext() {
	if(current.getNext()!=myList.getFirstNode()) {
		return true;
	}
	else {
		return false;
	}
}
public Object next() {
	if(myList.size()==0) {
		return new Object();
	}
	else if(myList.size()==1) {
		return current.getValue();
	}
	else {
		if(!hasNext()) {
			return new Object();
		}
		current=current.getNext();
		previous=current.getPrevious();
		return previous.getValue();
	}
}

	
	

public Object previous() {
	
	if(myList.size()==0) {
		return new Object();
	}
	else if(myList.size()==1) {
		return current.getValue();
	}
	else {
		if(!hasPrevious()) {
			return new Object();
		}
		current=current.getNext();
		previous=current.getPrevious();
		return previous.getValue();
	}
	
}
public void remove() {
	if(hasNext()) {
		current=current.getNext();
		previous.setNext(current);
		current.setPrevious(previous);
		
	}
	else {
		current=current.getPrevious();
	}
	
	
}
public void add(Object element) {
	if(myList.size()==0) {
		current=new DListNode(element,null,null);
		previous=current;
		current.setNext(current);
		current.setPrevious(previous);
	}
	if(hasNext()) {
		current=new DListNode(element,current,previous);
		current.getNext().setPrevious(current);
		previous.setNext(current);
		
	}
	else {
		current=new DListNode(element,myList.getFirstNode(),current);
		myList.getFirstNode().setPrevious(current);
		previous=previous.getNext();
		previous.setNext(current);
	}
	
	
}
public void set(Object element) {
	
}
}
