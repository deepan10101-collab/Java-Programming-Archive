package unit3;
import java.util.*;
public class twosetproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner one = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = one.nextInt();
		int sum = 0;
		for(int i = 0; i <= num ; i++) {
			
			sum += i;
		
		}
		System.out.println(sum);
	
	}

}
