package unit3;
import java.util.Random;
public class dicetester {
	public static void main(String[] args) {
		Random one = new Random();
		int dice1 = one.nextInt(30) + 50 ;
		int dice2 = one.nextInt();
		
		System.out.println(dice1);
}
}
