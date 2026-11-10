package unit3;
import java.util.Arrays;
public class ArraysClasswork01 {
	/** Create a method that will create an int array
	 *  (using a for loop) and return the array, 
	 *  which will contain {0,1,2,3,4,5,6,7,8,9}
	 */
	public static int[] classwork01(){

		int[] nums = new int[10];
		for(int spot = 0; spot <= nums.length - 1; spot++) {
			nums[spot] = spot;
		}
		return nums;
	}
	
	/** Create a method that will create an int array
	 *  (using a for loop) and return the array, 
	 *  which will contain the first 100 even numbers.
	 */
	public static int[] classwork02(){

		int[] even = new int[100];
		int a = 0;
		for(int spot = 0; spot <= even.length - 1; spot++) {
			even[spot] = a;
			a = a + 2;
		}
		
		
		return even;
	}
	
	
	/** Create a method that will create an int array
	 *  (using a for loop) and return the array, 
	 *  which will contain all of the perfect squares
	 *  less than 1 million.  !! Have the method first
	 *  determine how many squares there actually are
	 *  less than 1 million...and THEN create/populate
	 *  the array !!
	 */
	public static int[] classwork03(){
	int numofsq = 0;
    for(int i = 0; i <= 1000000; i++) {
    	if (Math.sqrt(i) % 1.0 == 0) {
    		numofsq += 1;
    	}
    }
    int[] arr = new int[numofsq];
    for(int spot = 0 ; spot < numofsq; spot++ ) {
    	arr[spot] = spot * spot;
    }
	return arr;
	}

	public static void main(String[] args) {
	System.out.println(Arrays.toString(classwork01()));
	System.out.println(Arrays.toString(classwork02()));
	System.out.println(Arrays.toString(classwork03()));
	}


}
 