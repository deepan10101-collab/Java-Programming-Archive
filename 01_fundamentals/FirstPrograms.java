package unit3;

import java.util.Arrays;
import java.util.Random;
public class FirstPrograms {

	
public static char[] method1(){
	
	char[] alphabet = new char[26];
	int a  = 97;
	for(int i = 0; i <= alphabet.length - 1; i++) {
		alphabet[i] = (char) a;
		a++;
	}
	
	return alphabet;
}
public static int[] method2(){
	
	int[] rand  = new int[10];
	Random gen = new Random();
	int a  = 0;
	for(int i = 0; i <= rand.length - 1; i++) {
		a = gen.nextInt(11);
		rand[i] = a;
	}
	System.out.println(rand[2]);
	System.out.println(rand[9]);
	int total = 0;
	for(int i = 0; i <= rand.length - 1; i++) {
		total += rand[0];
	}
	System.out.println(total / rand.length);
	return rand;
}

public static double[] method3(){
	double random = 0;
	double[] numberArray1 = new double[100];
	for(int i = 0 ;  i <= 100 - 1; i++) {
		random 	= Math.random();
		numberArray1[i] = random;
	}
	double[] numberArray2 = new double[100];
	for(int i = 0 ;  i <= 100 - 1; i++) {
		numberArray2[i] = 0;
	}
	
	for(int i = 0; i <= 100 - 1; i++) {
		numberArray2[i] = numberArray1[i];
	}
	return numberArray2;
}






public static void main(String[] args) {
	System.out.println(Arrays.toString(method1()));
	System.out.println(Arrays.toString(method2()));
	System.out.println(Arrays.toString(method3()));
	}
}
