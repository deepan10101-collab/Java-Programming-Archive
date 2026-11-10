import java.util.Scanner;
public class CalorieCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int oneCookieCalorie = 75;
	 int onePotatoChipCalorie = 152;
	 int oneCanColaCalories = 150;
	 Scanner keyboard = new Scanner(System.in); 
	 System.out.println("ENTER THE NUMBER OF COOKIES: ");
	 int cookie = keyboard.nextInt();
	 int totalcookieclaorie = cookie * oneCookieCalorie;
	 System.out.println("ENTER THE NUMBER OF CHIPS: ");
	 int chip = keyboard.nextInt();
	 int totalchipcalorie = chip * oneCanColaCalories;
	 System.out.println("ENTER THE CANS OF SODA: ");
	 int soda = keyboard.nextInt();
	 int totalsodacalorie = soda * oneCanColaCalories;
	 System.out.println("total calories of cookies " + totalcookieclaorie );
	 System.out.println("total chip calorie " + totalchipcalorie);
	 System.out.println("total soda calorie " + totalsodacalorie);
	 
   int x = 2;
   double y = 5.0;
   double z = (y%x);
   x += z;
   System.out.println(x);
	 
	 

	}

}
