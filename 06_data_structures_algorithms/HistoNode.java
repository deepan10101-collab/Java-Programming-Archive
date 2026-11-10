package unit3;

public class HistoNode
{
	private char letter;
	private int letterCount;
	private HistoNode next;

	public HistoNode(char let, int cnt, HistoNode n)
	{
		letter=let;
		letterCount=cnt;
		next=n;
	}

	public char getLetter()
	{
		return letter;
	}

	public int getLetterCount()
	{
		return letterCount;
	}

	public HistoNode getNext()
	{
	   return next;
	}

	public void setLetter(char let)
	{
		letter=let;
	}

	public void setLetterCount(int cnt)
	{
		letterCount=cnt;
	}

	public void setNext(HistoNode n)
	{
		next = n;
	}
}




 class HistoList
{
   private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{

		if(front==null) {
			front=new HistoNode(let,1,null);
		}
		else {
			boolean found=false;
			HistoNode temp=front;
			while(temp!=null) {
				if(temp.getLetter()==let) {
					found=true;
					temp.setLetterCount(temp.getLetterCount()+1);
					break;
				}
				temp = temp.getNext();
			}
			if(!found) {
				front=new HistoNode(let,1,front);
			}
		}
		





	}


	//returns a string will all values from list
	public String toString()
	{
		String output = "";

		HistoNode temp=front;
		while(temp!=null) {
			output=output+temp.getLetter()+"-"+temp.getLetterCount()+"\t";
			temp=temp.getNext();
		}








		return output;
	}
	
	public void remove(char a) {
		HistoNode temp = front;
		if(temp.getLetter()==a) {
			if(temp.getLetterCount()==1) {
				front=temp.getNext();
				temp=front;
			}
			else {
				temp.setLetterCount(temp.getLetterCount()-1);
			}
		}
		while(temp.getNext() != null) {
			if(temp.getNext().getLetter() == a) {
				if(temp.getNext().getLetterCount() == 1) {
					
						temp.setNext(temp.getNext().getNext());
					
					
					
					
				}
				else {
					temp.getNext().setLetterCount(temp.getNext().getLetterCount()-1);
					
				}
				
				
			}
			temp=temp.getNext();
			if(temp==null) {
				break;
			}
		}
	}
}
