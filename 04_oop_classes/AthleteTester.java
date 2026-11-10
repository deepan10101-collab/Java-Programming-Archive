package chatbot;

class AthleteTester {
	public static void main(String[] args) {
		System.out.println("hi");

		Athlete one = new Wrestler("Bob", "Janek");
		one.train(10);
		one.race(200);
		System.out.println(one);

		Athlete two = new Runner("Ted", "Collins");
		two.train(5);
		two.race(12.0);
		two.race(5);
		System.out.println(two);

		Runner three = new Marathoner("Edith", "Quinby");
		three.train(15);
		three.race(26);
		three.race(20);
		three.race(2);
		three.race(8);
		System.out.println(three);
		

		
	}
	
	
	
}
