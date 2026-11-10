package unit3;
import java.util.*;
public class romannumeralsextension {
	private int num;
	private String number;
public romannumeralsextension() {
}
public String num() {
	  Scanner keyboard = new Scanner(System.in);
	  System.out.println("enter a number greater than 10 : ");
	  num = keyboard.nextInt();
	  
	  if (num > 10 && num < 50 ) {
		  if (num > 10 && num < 20) {
			number += "X";
			num -= 10;
		  }
		  if (num >= 20 && num < 30 ) {
				number += "XX";
				num -= 20;
			  }
		  if (num >= 30 && num < 40) {
				number += "XXX";
				num -= 30;
			  }
		  if (num >= 40 && num < 50) {
				number += "XL";
				num -= 40;
			  }
		  if (num == 50) {
				number += "V";
				num -= 50;
			  }
			 
		  
		  switch (num) {
		  case 0 :
			  number += "";
		  case 1 :
			  number += "I";
		  case 2 :
			  number += "II";
		  case 3 :
			  number += "III";
		  case 4 :
			  number += "IV";
		  case 5 :
			  number += "V";
		  case 6 :
			  number += "VI";
		  case 7:
			  number += "VII";
		  case 8 :
			  number += "VIII";
		  case 9:
			  number += "IX";
		  }}
		  
      else if(num > 50 && num < 100) {
             if (num > 50 && num < 60) {
        	   number += "LV";
        	    num -= 50;
        	 if (num >= 60 && num < 70) {
        		 number += "LX";
         	    num -= 60;
        	 }
        	 if (num >= 70 && num < 80) {
        		 number += "LXX";
         	    num -= 70;
        	 }
        	 if (num >= 80 && num < 90) {
        		 number += "LXXX";
         	    num -= 80;   
           }
        	 if (num >= 90 && num < 100) {
        		 number += "XC";
          	     num -= 90; 
        	 }
        	 
        	 switch (num) {
   		  case 0 :
   			  number += "";
   		  case 1 :
   			  number += "I";
   		  case 2 :
   			  number += "II";
   		  case 3 :
   			  number += "III";
   		  case 4 :
   			  number += "IV";
   		  case 5 :
   			  number += "V";
   		  case 6 :
   			  number += "VI";
   		  case 7:
   			  number += "VII";
   		  case 8 :
   			  number += "VIII";
   		  case 9:
   			  number += "IX";
        
   			return number;	}
  }}
	return number;
}}


