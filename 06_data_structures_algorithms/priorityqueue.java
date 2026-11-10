package chatbot;
import java.util.*;
import java.util.LinkedList;

public class priorityqueue {
	ArrayList<patient> list;
public priorityqueue() {
	 list = new ArrayList<patient>();

}

public boolean isempty() {
	return list.get(0) == null;
}

public void add(patient x) {
	for(int i = 0;  i < list.size(); i++) {
		if(x.getorder() < list.get(i).getorder()) {
			list.get(i) = x.
		}
	}				
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
