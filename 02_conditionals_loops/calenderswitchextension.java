package unit3;

import java.util.Scanner;

public class calenderswitchextension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keybaord = new Scanner(System.in);
		System.out.println("which do you want to convert(months or days): ");
		String choice = keybaord.next().toLowerCase();
		String month;
		String day;
		if(choice.equals("months")) {
			System.out.println("which month do you want to convert ? ");
			month = keybaord.next().toLowerCase();
			switch(month) {
			case "j":
				System.out.println("January is month #1");
				break;
			case "f":
				System.out.println("February is month #2");
				break;
			case "m":
				System.out.println("provide further information");
			  case "mar":
				System.out.println("March is month #3");
				break;
			case "a":
				System.out.println("provide further information");
			  case "ap":
				System.out.println("April is month #4");
				break;
			case "may":
				System.out.println("provide further information");
			 case ""
				System.out.println("May is month #5");
				break;
			case "june":
				System.out.println("June is month #6");
				break;
			case "july":
				System.out.println("july is month #7");
				break;
			case "august":
				System.out.println("August is month #8");
				break;
			case "september":
				System.out.println("September is month #9");
				break;
			case "october":
				System.out.println("October is month #10");
				break;
			case "november":
				System.out.println("November is month #11");
				break;
			case "december":
				System.out.println("December is month #12");
				break;
			}
		}
		else if(choice.equals("days")) {
			System.out.println("which day do you want to convert ? ");
			day = keybaord.next().toLowerCase();
			switch(day) {
			case "monday":
				System.out.println("monday is day #1");
				break;
			case "tuesday":
				System.out.println("tuesday is day #2");
				break;
			case "wednesday":
				System.out.println("wednesday is day #3");
				break;
			case "thurday":
				System.out.println("thurday is day #4");
				break;
			case "friday":
				System.out.println("friday is day #5");
				break;
			case "saturday":
				System.out.println("saturday is day #6");
				break;
			case "sunday":
				System.out.println("sunday is day #7");
				break;
		}
			}

			

	}

}
