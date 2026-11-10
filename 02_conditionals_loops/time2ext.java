package unit3;
import java.util.*;
public class time2ext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the number of seconds: ");
		int time = keyboard.nextInt();
		int timeminuteconverter;
		int timeseconds;
		int timehourconverter;
		int timedayconverter;
		if (time >= 60) {
			 timeminuteconverter = (int)time/60;
			 timeseconds = time - (timeminuteconverter * 60);
		    System.out.println("minutes : " + timeminuteconverter + " seconds :" + timeseconds);
		}
	    if(time >= 3600) {
			 timehourconverter = (int)time/3600;
			timeminuteconverter = (time - (timehourconverter * 3600)) / 60;
			timeseconds = time - (timeminuteconverter * 60);
			System.out.println("Time:  "+ timehourconverter + " hours " + timeminuteconverter + " minutes " + timeseconds + " seconds"  ) ;
			
		}
       if(time >= 86400) {
			 timedayconverter = (int)time/86400;
			 timehourconverter = (time - (timedayconverter * 86400)) / 3600;
			 timeminuteconverter = (time - (timehourconverter * 3600))/60;
			 timeseconds =  (time - (timeminuteconverter * 60));
             System.out.println(" days :" +  timedayconverter + " hours" + timehourconverter + " minutes" + timeminuteconverter + " seconds"+timeseconds );
	}
}}
