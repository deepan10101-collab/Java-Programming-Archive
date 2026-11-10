package unit3;

public class rectangle {
    private double area;
    private double perimeter;
	private double length;
	private double width;
 public rectangle(double width , double length) {
	this.length = length;
	this.width = width;
}
 public String toString() {
	
	return "rectangle dimensions \n lenght: " + length + "\nwidth: " + width;
     
	
}
 public double getArea() {
	area = length * width;
	return area;
	// get area
}
public double getPerimeter() {
	perimeter = 2*(length + width);
	return perimeter;
	
}
	 public static void main (String[] args) {
		   rectangle one = new rectangle(5,3);
		   System.out.println(one.toString());
		   System.out.println("The area of Rectangle one is " + one.getArea());
		   System.out.println("The perimeter of Rectangle one is " + one.getPerimeter());
	 }
	 
}
