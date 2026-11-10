import java.util.HashSet;
import java.util.Set;

public class TeamSet {
	private HashSet<Wrestler> wrestSet;
	
	public TeamSet() {
		wrestSet = new HashSet<Wrestler>();
		
	}
	
	public void addwrestler(Wrestler one) {
		wrestSet.add(one);
	}
	
	public double avgweight() {
		double avg = 0.0;
		for(Wrestler x: wrestSet) {
			avg += x.getWeight();
		}
		return avg/wrestSet.size();
	}
	
	public Set<Wrestler> lightweight(){
		 HashSet<Wrestler> two = new HashSet<>();
		for(Wrestler x: wrestSet) {
			if(x.getWeight()<120) {
				two.add(x);
			}
		
		}
		
	return two;
}
   public Set<Wrestler> getWrestSet(){
	   return wrestSet;
   }
   
   public String toString() {
	   return wrestSet.toString();
   }
   
   public void remove(Wrestler a) {
	   wrestSet.remove(a);
   }
             
	   


}