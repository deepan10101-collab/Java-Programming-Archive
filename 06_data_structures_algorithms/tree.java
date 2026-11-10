import java.util.*;
public class tree {

	class node{

		private node left;
		private node right;
		private int value;
		
		
		public node(node left, node right, int value) {
		   this.left=left;
		   this.right=right;
		   this.value=value;
		}

		public node getLeft() {
			return left;
		}

		public void setLeft(node left) {
			this.left = left;
		}

		public node getRight() {
			return right;
		}

		public void setRight(node right) {
			this.right = right;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		public String toString() {
			return ""+value;
		}
		
	
		
	
		}
	
	private node root;
	private node temp;
	public tree() {
		root = null;
		temp=root;
	}
	
	public void add(int value) {
		
		if(root==null) {
			root=new node(null,null,value);
			temp=root;
			return;
		}
		if(value > temp.getValue()) {
		   if(temp.getRight()==null) {
			   temp.setRight(new node(null,null,value));
			   temp=root;
			   return;
		   }
		   else {
			  temp=temp.getRight();
			  add(value);
		   }
		   
		}
		else {
			if(temp.getLeft()==null) {
				 temp.setLeft(new node(null,null,value));
				   temp=root;
				   return;
			}
			else {
				temp=temp.getLeft();
				add(value);
			}
		}
		
	}
	public boolean search(int x) {
		node curr = root;
		node one = null;
		if((curr==null)||curr.getLeft()==null&&curr.getRight()==null) {
			return false;
		}
		while(true) {
			
			if(curr.getValue() == x) {
				return true ;
			}
			else {
			 if(x> curr.getValue()) {
				 if(curr.getRight()!=null) {
					 curr = curr.getRight();
				 }
				 else{
					 return false;
				 }
				
				
			}
			else {
				if(curr.getLeft()!=null) {
					curr=curr.getLeft();
				}
				
				else{
					return false;
				}
			}
			}}
		}
	public int gsmall() {
		return getsmallest(root);
	}
public int getsmallest(node x) {
		if(x==null) {
			return 0;
			
		}
		else if(x.getLeft()!=null) {
			return getsmallest(x.getLeft());
		}
		return x.getValue();
		
	}
	
public int getlargest(node x) {
	if(x==null) {
		return 0;
		
	}
	else if(x.getRight()!=null) {
		return getsmallest(x.getRight());
	}
	return x.getValue();
	
}
public int getnumleaves(node x) {
	if(x==null) {
		return 0;
	}
	if(x.getLeft()==null&& x.getRight()==null) {
		return 1;
	}
	return  getnumleaves(x.getLeft()) + getnumleaves(x.getRight());
	
}
public int getnumlevels(node x) {
	if(x==null) {
		return 0;
	}
	else if(x.getLeft()==null&&x.getRight()==null) {
		return 1;
	}
	int y=getnumlevels(x.getLeft());
	int z=getnumlevels(x.getRight());
	if(y>z) {
		return 1+y;
	}
	else {
		return 1+z;
	}
}

public int getnumnodes(node x) {
	if(x == null) {
		return 0;
	}
	else {
		return 1+getnumnodes(x.getLeft())+getnumnodes(x.getRight());
	}
}

public boolean isfulltree() {
	if(getnumnodes(root) == (int) (Math.pow(2, getnumlevels(root))-1)) {
		return true;
	}
	else {
		return false;
	}
	
}
public void inorder(node x) {
	if(x==null) {
		return;
	}
	inorder(x.getLeft());
	System.out.println(x.getValue());
	inorder(x.getRight());
}
public void preorder(node x) {
	if(x == null) {
		return;
	}
	System.out.println(x.getValue());
	preorder(x.getLeft());
	preorder(x.getRight());
}
public void postorder(node x) {
	if(x == null) {
		return;
	}
	
	postorder(x.getLeft());
	postorder(x.getRight());
	System.out.println(x.getValue());
		
}
public void reverseord(node x) {
	if(x == null) {
		return;
	}
	
	
	reverseord(x.getRight());
	System.out.println(x.getValue());
	reverseord(x.getLeft());
}

public int getwidth() {
	
	
	
}

	

public node search1(int x) {
	node curr = root;
	node one = null;
	if((curr==null)||curr.getLeft()==null&&curr.getRight()==null) {
		return one;
	}
	while(true) {
		
		if(curr.getValue() == x) {
			return curr ;
		}
		else {
		 if(x> curr.getValue()) {
			 if(curr.getRight()!=null) {
				 curr = curr.getRight();
			 }
			 else{
				 return one;
			 }
			
			
		}
		else {
			if(curr.getLeft()!=null) {
				curr=curr.getLeft();
			}
			
			else{
				return one;
			
		
		}
		}}}}
	

	
  

	

	
	
	public static void main(String[] args) {
		tree b=new tree();
		b.add(4);
		b.add(3);
		b.add(98);
		b.add(45);
		b.add(1);
		
		
		Object a=new Object();
		System.out.println(b.search(45));
		System.out.println(b.search1(7));
	}
		
    }
