package unit3;

import java.util.Scanner;

public class ifpractice4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("What is your weight? ");
	    int weight = keyboard.nextInt();
	    if (weight > 220 && weight < 280)
	    {
	    	System.out.println("Allowed fort contest");
	    }
	    else
	    {
	    	System.out.println("Not eligible for contest");
	    }
}}
