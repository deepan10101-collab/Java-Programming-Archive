package chatbot;

public class polygontester {
	 public static void main(String[] args){
         ShapeTester one = new ShapeTester();
		    Polygon a = new Rectangle(2, 10);
		    one.add(a);
		    Polygon b = new Square(5);
		    one.add(b);
		    Polygon c = new RightTriangle(10000, 1);
		    one.add(c);
		    Polygon d = new RegularNgon(1000, 8);
		    one.add(d);
		    one.printOut();
	    }
}
