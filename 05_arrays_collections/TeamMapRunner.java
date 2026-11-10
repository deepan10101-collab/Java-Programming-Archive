
public class TeamMapRunner {

	public static void main(String[] args) {
		
		TeamMap a = new TeamMap();
		Wrestler bob = new Wrestler("Bob", 102);
		a.add(bob);
		a.add(new Wrestler("Fred", 112));
		a.add(new Wrestler("Jake", 157));
		a.add(new Wrestler("Arnold", 199));
		a.add(new Wrestler("Stan", 119));
		Wrestler juan = new Wrestler("Juan", 180);
		a.add(juan);
		System.out.println(a);

		System.out.println("Juan is in Weight Group " + a.getweightgroup(juan));
		
		
		


	}

}
