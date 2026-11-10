package RestaurantMenu;
import java.util.*;
public class Person implements Comparator<Integer>
{
private String firstName;
private String lastName;
private int id;

public Person(String firstName, String lastName,int id)
{
this.firstName = firstName;
this.lastName = lastName;
this.setId(id);
}
public String getFirstName() { return firstName; }
public String getLastName() { return lastName; }
public String toString()
{
return "Name:" + firstName + ' ' + lastName;
}
public static void main(String[] args)
{
TreeSet<Person> mySet = new TreeSet<Person>(Comparator.comparingInt(null));
mySet.add(new Person("Sally", "Brown",7834));
mySet.add(new Person("Fred", "Kelly",349324));
mySet.add(new Person("Bill", "Akins",4324));
mySet.add(new Person("Julie","Wilkins",3423));
mySet.add(new Person("James", "Langdon",98989));
for (Person p : mySet)
{
System.out.println(p);
}
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public int compare(Integer o1, Integer o2) {
	return 
	
}


}