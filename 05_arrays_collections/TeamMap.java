
import java.util.LinkedList;
import java.util.Set;

public class TeamMap {

	private LinkedList[] map;
	

	

public TeamMap() {
	map=new LinkedList[10];
	
}

public void add(Wrestler a) {
	
	int x=a.getWeight();
	x=x/10;
	x=x%10;
	if(map[x]==null) {
		map[x]= new LinkedList<TeamSet>();
		map[x].add(new TeamSet());
		((TeamSet)map[x].getFirst()).addwrestler(a);
		
	}
	((TeamSet) map[x].getFirst()).addwrestler(a);
	
}

public void changeweight(Wrestler a,int one) {
	int x = this.getweightgroup(a);
	if(one<x) {
		return;
	}
	((TeamSet)map[x].getFirst()).remove(a);
	((TeamSet)map[one].getFirst()).addwrestler(a);
}

public int getweightgroup(Wrestler a) {
	for(int i=0;i<map.length;i++) {
		TeamSet temp=(TeamSet)(map[i].getFirst());
		for(Wrestler c:temp.getWrestSet()) {
			if(c.equals(a)) {
				return i;
			}
		}
	 }
	}
	 
	return -1;
}



}