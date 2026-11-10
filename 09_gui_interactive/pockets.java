package unit3;
import javax.swing.JOptionPane;
public class pockets {
private String color;

public pockets() {
	
}

public String getcolor() {
	
String number = JOptionPane.showInputDialog("enter the number");
int num = Integer.parseInt(number);
if (num == 0)
	color = "GREEN";
if(num >= 1&& num <= 10)
	if(num % 2 == 0)
	    color = "black";
	else
		color = "red";
if(num >= 11 && num <= 18)
	if(num % 2 == 0)
	    color = "red";
	else
		color = "black";
if(num >= 19 && num <= 28)
	if(num % 2 == 0)
	    color = "red";
	else
		color = "black";
if(num >= 29 && num <= 36)
	if(num % 2 == 0)
	    color = "black";
	else
		color = "red";
else 
	System.out.println("error");
return color;
	
}
}
