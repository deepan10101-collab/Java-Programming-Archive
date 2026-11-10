package unit3;

public class adressmaker {
private String name;
private String adress;
private String city;
private String state;
private String zipcode;

public adressmaker (String person , String adress1 , String city1 , String state1 , String zipcode1) {
	name = person;
	adress = adress1;
	city = city1;
	state = state1;
	zipcode = zipcode1;
			
}

public String toString() {
	return name + "\n" + adress + "\n" + city + ", " + state + zipcode + "\n";
}

public String tomycousin() {
	return "My cousin "+ name + " lives in " + state + "." + "\n" + "Their family lives on a road called " + adress + ".\n";
}


public static void main (String[] args) {
	   adressmaker one = new adressmaker("Rob Johnson","123 Main Street","Carlsbad","CA", "94857");
	   adressmaker two = new adressmaker("Erin Muni","56 Shallow Rd","Heathridge","MA","05939");
	   System.out.println(one.toString());
	   System.out.println(two.toString());
	   System.out.println(one.tomycousin());
	   System.out.println(two.tomycousin());
	   
}
}

