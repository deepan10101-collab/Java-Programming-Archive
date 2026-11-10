
import java.util.Random;
public class Dice {
private int die1;
private int die2;
private int total;
private String name;
private boolean doubles;

public Dice() {
	
}

void setdie1() {
	Random one = new Random();
	die1 = one.nextInt(6)+1;
}
void setdie2() {
	Random one = new Random();
	die2 = one.nextInt(6)+1;
}
void settotal() {
	total = die1 + die2;
}
public int getdie1() {
	return die1;
}
public int getdie2() {
	return die2;
}
public int gettotal() {
	return total;
}
public void checkDouble() {
	if(die1 ==  die2) {
		doubles = true;
	}
	else {
		doubles = false;
	}
}
public String getName() {
if(total == 2 )
	if(doubles == true)
		System.out.println("Snake Eyes - Acey duecy");
	else
		System.out.println("acey deucy");
if(total == 4 )
	if(doubles == true)
		System.out.println("easy four");
	else
		System.out.println(" hard four ");

import java.util.Random;
public class Dice {
private int die1;
private int die2;
private int total;
private String name;
private boolean doubles;

public Dice() {
	
}

void setdie1() {
	Random one = new Random();
	die1 = one.nextInt(6)+1;
}
void setdie2() {
	Random one = new Random();
	die2 = one.nextInt(6)+1;
}
void settotal() {
	total = die1 + die2;
}
public int getdie1() {
	return die1;
}
public int getdie2() {
	return die2;
}
public int gettotal() {
	return total;
}
public void checkDouble() {
	if(die1 ==  die2) {
		doubles = true;
	}
	else {
		doubles = false;
	}
}
public String getName() {
if(total == 2 )
	if(doubles == true)
		System.out.println("Snake Eyes - Acey duecy");
	else
		System.out.println("acey deucy");
if(total == 4 )
	if(doubles == true)
		System.out.println("hard four");
	else
		System.out.println("easy four");
if(total == 5 )
		System.out.println("fever five");
if(total == 6 )
	if(doubles == true)
		System.out.println("easy four");
	else
		System.out.println("");

	


	
}
}
