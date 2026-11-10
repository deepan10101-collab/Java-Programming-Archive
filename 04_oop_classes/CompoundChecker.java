package unit3;

public class CompoundChecker {
	private String stuff;
	private int val;
	private String state;
public CompoundChecker(String stuff , int val) {
	this.stuff = stuff;
	this.val = val;	
}
public String checker() {
	if(stuff == "water") {
		if(val < 32)
			state = "solid";
	    if(val > 32 && val < 212)
	    	state = "liquid";
	    if(val > 212)
	    	state = "gas";}
	    
	else if(stuff == "ammonia") {
		if(val < -108)
			state = "solid";
	    if(val > -108 && val < -28)
	    	state = "liquid";
	    if(val > -28)
	    	state = "gas";
		
	}
	else if(stuff == "petroleum") {
		if(val <= -100)
			state = "solid";
	    if(val > -100 && val < 400)
	    	state = "liquid";
	    if(val > 400)
	    	state = "gas";
	}
	else {
		state = "unknown";
	}
	return state;
			
}
	

	public static void main(String[] args) {
		// Part B - In the class above, implement the code necessary
		//          to make the following testers produce the
		//          Expected Outcome shown below.
		
		String stuff = "water";
		int val = 40;
		CompoundChecker one = new CompoundChecker(stuff, val);
		System.out.println("At " + val + " degrees F, the state of " +
							stuff + " is " + one.checker());
		
		stuff = "ammonia";
		val = 100;
		CompoundChecker two = new CompoundChecker(stuff, val);
		System.out.println("At " + val + " degrees F, the state of " +
							stuff + " is " + two.checker());
		
		stuff = "petroleum";
		val = -100;
		CompoundChecker three = new CompoundChecker(stuff, val);
		System.out.println("At " + val + " degrees F, the state of " +
							stuff + " is " + three.checker());
		
		stuff = "Slurpees";
		val = 31;
		CompoundChecker four = new CompoundChecker(stuff, val);
		System.out.println("At " + val + " degrees F, the state of " +
							stuff + " is " + four.checker());
//Expected Outcome:
//		At 40 degrees F, the state of water is liquid
//		At 100 degrees F, the state of ammonia is gaseous
//		At -100 degrees F, the state of petroleum is solid
//		At 31 degrees F, the state of Slurpees is unknown

	}

}

