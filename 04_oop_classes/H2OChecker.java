package unit3;

public class H2OChecker {

 private int val;
 private String state;
public H2OChecker(int val) {
	this.val = val;
}
public String state() {
	if (val < 32)
		state = "solid";
	if(val > 32 && val < 212)
		state = "liquid";
	if(val > 212)
		state = "gas";
	return state;
		
}

	public static void main(String[] args) {
		// Part A - In the class above, implement the code necessary
		//          to make the following testers produce the
		//          Expected Outcome shown below.
		int val = 47;
		H2OChecker one = new H2OChecker(val);
		System.out.println("At " + val + " degrees F, the state of water is " + one.state());

		val = 248;
		H2OChecker two = new H2OChecker(val);
		System.out.println("At " + val + " degrees F, the state of water is " + two.state());

//Expected Outcome:  At 47 degrees F, the state of water is liquid
//					 At 248 degrees F, the state of water is gaseous
	}


}

