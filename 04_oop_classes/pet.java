package unit3;

public class pet {

	private String name;
	private String animal;
	private int age;

	public pet(String name , String animal , int age) {
		this.name = name;
		this.animal = animal;
		this.age = age;
	}

public String getname() {
	return name;
}

public String getanimal() {
	return animal;
}

public int getage() {
	return age;
}

public void setname(String name1) {
	name = name1;
}
public void setanimal(String animal1) {
	animal = animal1;
}
public void setage(int age1) {
	age = age1;
}
public String toString() {
	return "Name: "+ getname() + "\nAnimal: " + getanimal() + "\nAge: " + getage() + "\n"; 
}

public static void main (String[] args) {
	
	pet one = new pet("Fluffy" , "cat" , 3);
	pet two = new pet("Sushi","cat",10);
	pet three = new pet("Kahlo","cat",1);
	
	System.out.println(one.toString());
    System.out.println(two.toString());
    System.out.println(three.toString());
}

}

