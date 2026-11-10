
	public class NumberPairs {
		// declare the fields (AKA - instance variables)
		// "num1 and num2"
		private double num1 , num2 , sum;

		// Code the default constructor

		public NumberPairs() {}
		/*
		 * Code the overloaded constructor that takes two numbers as parameters
		 */
		public NumberPairs(double num1 , double num2) {
			this.num1 = num1;
			this.num2 = num2;
			
		}

		// Code a mutator to change the values in the NumberPairs object
		public void setNums(int num1 , int num2) {
			this.num1 = num1;
			this.num2 = num2;
		}

		public double num1() {
			return num1;
		}
		
		public double num2() {
			return num2;
		}
		// Code a mutator that computes the sum, but does not print it out
       public void getsum() {
    	   
    	   sum = num1 + num2;
       }
		// Code a toString method that returns the numbers and their sum
      public String toString() {
    	  getsum();
    	  return num1 + " + " + num2 + " == " + sum;
      }
		// EXTENSION - CAN YOU DO IT?
		// Code a mutator that adds the second NumberPair to increase the first.
      
      public void addnumberpair(NumberPairs b) {
    	  b.getsum();
    	  sum += b.sum;
      }
		// EXTENSION - CAN YOU DO IT?
		// Create a new NumberPairs object from the sum of the others and display it
      
		public static void main(String[] args) {
			NumberPairs one = new NumberPairs();
			one.setNums(5, 5);
			NumberPairs two = new NumberPairs(90, 100.0);
			NumberPairs three = new NumberPairs(100.5, 85.8);
			NumberPairs four = new NumberPairs(-100, 55);
			NumberPairs five = new NumberPairs(15236, 5642);
			NumberPairs six = new NumberPairs(1000, 555);
			System.out.println(one);
			System.out.println(two);
			System.out.println(three);
			System.out.println(four);
			System.out.println(five);
			System.out.println(six);
			
			
			//Add to the main method to complete the extension
			
		  double Num1 = one.num1() + two.num1() + three.num1() + four.num1() + five.num1() + six.num1();
		  double Num2 = one.num2() + two.num2() + three.num2() + four.num2() + five.num2() + six.num2();
		  NumberPairs extension = new NumberPairs(Num1 , Num2) ;
		  System.out.println(extension);
			  
		  }
			
		}

	

