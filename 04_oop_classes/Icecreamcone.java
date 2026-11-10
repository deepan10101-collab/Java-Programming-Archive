package unit3;

import java.math.*;

public class Icecreamcone {

	private double radius,hieght;
	
	public Icecreamcone(double radius , double hieght) {
		this.radius = radius;
		this.hieght = hieght;
	}
	
	public double getvolume() {
		return (double) 3.14 * (radius * radius) * (hieght / 3);
	}
	public double getsurfacearea() {
		return (double) (3.14 * radius) * (Math.sqrt(radius * radius + hieght * hieght));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		
	}

}
