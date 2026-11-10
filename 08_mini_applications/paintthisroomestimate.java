import java.util.Scanner;

public class paintthisroomestimate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		final int  COVERAGE =275;
		int lenght;
		int width;
		int hieght;
		double totalsqft;
		double paintneeded;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the lenght of the room: ");
		lenght = keyboard.nextInt();
		System.out.println("enter the hieght of the room: ");
		hieght = keyboard.nextInt();
		System.out.println("enter the width of the room: ");
		width = keyboard.nextInt();
		totalsqft = lenght * width*hieght;
		System.out.println("enter the no. of doors: ");
		int doors = keyboard.nextInt() * 25;
		System.out.println("enter the no. of windows: ");
		int windows = keyboard.nextInt()*20;
		totalsqft = (totalsqft - doors) - windows;
		paintneeded = totalsqft / COVERAGE;
		
	    System.out.printf("\nLenght: %d " , lenght);
	    System.out.printf("\nWidth: %d " , width);
	    System.out.printf("\nHieght: %d " , hieght);
	    System.out.printf("\ngallons of paint needed %.2f " , paintneeded);
		
	}

}
