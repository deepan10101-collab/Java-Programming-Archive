package chatbot;
import java.util.*;


	 class ShapeTester {
		private List<Polygon> Shapes;

		public ShapeTester() {
			Shapes = new ArrayList<Polygon>();
		}

		public void add(Polygon poly) {
			Shapes.add(poly);
		}

		public void printOut() {

			double tot = 0; // accumulates total area of polygons
			for (Polygon x : Shapes) // prints out all polygons
			{
				 System.out.println("TYPE: " + x.getType() + "\t AREA: " +
				 x.getArea() + "\t PERIMETER: " + x.getPerimeter());
//				System.out.println(x);
				tot += x.getArea();
			}
			System.out.println("\nTotal Area: " + tot);
		}
	}
	class RegularNgon extends Polygon{
	    private double area;
	    public double getArea() {
	        return area;
	    }
	    public void setArea(double area) {
	        this.area = area;
	    }
	    public double getPerimeter() {
	        return perimeter;
	    }
	    public void setPerimeter(double perimeter) {
	        this.perimeter = perimeter;
	    }
	    public int getSides() {
	        return sides;
	    }
	    public void setSides(int sides) {
	        this.sides = sides;
	    }
	    private double perimeter;
	    private String type;
	    
	    public String getType() {
	        return type;
	    }
	    public void setType(String type) {
	        this.type = type;
	    }
	    private int sides;
	    private double length;
	    public double getLength() {
	        return length;
	    }
	    public void setLength(double length) {
	        this.length = length;
	    }
	   
	  
	    public RegularNgon(){
	        super();
	        
	        setSides(0);
	        setLength(0);
	        setType("Regular "+getSides()+"gon");
	    }
	    public RegularNgon(int s,double l){
	        super();
	       
	        setLength(l);
	        setSides(s);
	        setType("Regular "+getSides()+"gon");
	        setArea(0.25*s*l*l*(1/Math.tan(Math.PI/s)));
	        setPerimeter(s*l);

	    }
	}
	abstract class Polygon{
	    private double area;
	    public double getArea() {
	        return area;
	    }
	    public void setArea(double area) {
	        this.area = area;
	    }
	    public double getPerimeter() {
	        return perimeter;
	    }
	    public void setPerimeter(double perimeter) {
	        this.perimeter = perimeter;
	    }
	    public int getSides() {
	        return sides;
	    }
	    public void setSides(int sides) {
	        this.sides = sides;
	    }
	    private double perimeter;
	    private String type;
	    
	    public String getType() {
	        return type;
	    }
	    public void setType(String type) {
	        this.type = type;
	    }
	    private int sides;
	    public Polygon(){
	        setSides(0);
	        setArea(0);
	        setPerimeter(0);
	        setType("Polygon");
	        
	    }
	    public String toString(){
	        return "this "+ getType()+" has "+getSides()+" sides and it has an area of "+getArea()+" and it has a perimeter of "+getPerimeter();
	    }

	}
	class Rectangle extends Polygon{
	    private double area;
	    public double getArea() {
	        return area;
	    }
	    public void setArea(double area) {
	        this.area = area;
	    }
	    public double getPerimeter() {
	        return perimeter;
	    }
	    public void setPerimeter(double perimeter) {
	        this.perimeter = perimeter;
	    }
	    public int getSides() {
	        return sides;
	    }
	    public void setSides(int sides) {
	        this.sides = sides;
	    }
	    private double perimeter;
	    private String type;
	    
	    public String getType() {
	        return type;
	    }
	    public void setType(String type) {
	        this.type = type;
	    }
	    private int sides;
	    private double length;
	    public double getLength() {
	        return length;
	    }
	    public void setLength(double length) {
	        this.length = length;
	    }
	    public double getWidth() {
	        return width;
	    }
	    public void setWidth(double width) {
	        this.width = width;
	    }
	    private double width;
	    public Rectangle(){
	        super();
	        setSides(4);
	        setWidth(0);
	        setLength(0);
	        setType("Rectangle");
	    }
	    public Rectangle(double l,double w){
	        super();
	        setWidth(w);
	        setLength(l);
	        setSides(4);
	        setType("Rectangle");
	        setArea(w*l);
	        setPerimeter(w+w+l+l);

	    }
	  


	}


	class Square extends Rectangle{
	     private double area;
	    public double getArea() {
	        return area;
	    }
	    public void setArea(double area) {
	        this.area = area;
	    }
	    public double getPerimeter() {
	        return perimeter;
	    }
	    public void setPerimeter(double perimeter) {
	        this.perimeter = perimeter;
	    }
	    public int getSides() {
	        return sides;
	    }
	    public void setSides(int sides) {
	        this.sides = sides;
	    }
	    private double perimeter;
	    private String type;
	    
	    public String getType() {
	        return type;
	    }
	    public void setType(String type) {
	        this.type = type;
	    }
	    private int sides;
	    private double length;
	    public double getLength() {
	        return length;
	    }
	    public void setLength(double length) {
	        this.length = length;
	    }
	    public double getWidth() {
	        return width;
	    }
	    public void setWidth(double width) {
	        this.width = width;
	    }
	    private double width;
	    public Square(){
	        super();
	        setType("Square");
	    }
	    public Square(double l,double w){
	        super(l,w);
	        setType("Square");
	        

	    }
	    public Square(double x){
	        super(x,x);
	        setType("Square");
	       
	    }
	}

	class RightTriangle extends Polygon{
	    private double area;
	    public double getArea() {
	        return area;
	    }
	    public void setArea(double area) {
	        this.area = area;
	    }
	    public double getPerimeter() {
	        return perimeter;
	    }
	    public void setPerimeter(double perimeter) {
	        this.perimeter = perimeter;
	    }
	    public int getSides() {
	        return sides;
	    }
	    public void setSides(int sides) {
	        this.sides = sides;
	    }
	    private double perimeter;
	    private String type;
	    
	    public String getType() {
	        return type;
	    }
	    public void setType(String type) {
	        this.type = type;
	    }
	    private double sideA;
	    private double sideB;
	    private double sideC;
	    public double getSideC() {
	        return sideC;
	    }
	    public void setSideC(double sideC) {
	        this.sideC = sideC;
	    }
	    public double getSideA() {
	        return sideA;
	    }
	    public void setSideA(double sideA) {
	        this.sideA = sideA;
	    }
	    public double getSideB() {
	        return sideB;
	    }
	    public void setSideB(double sideB) {
	        this.sideB = sideB;
	    }

	    private int sides;
	    public RightTriangle(){
	        super();
	        setSides(3);
	        setType("RightTriangle");
	        
	    }
	    public RightTriangle(double a,double b){
	        super();
	        setType("RightTriangle");
	        setSideA(a);
	        setSideB(b);
	        setSideC(Math.sqrt((a*a)+(b*b)));
	        setSides(3);
	        setArea(0.5*a*b);
	        setPerimeter(a+b+getSideC());

	    }
	} 



	   


