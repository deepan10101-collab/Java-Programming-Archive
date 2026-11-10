package unit3;

public class employee {

	private String name;
	private int idnum;
	private String department;
	private String position;
public employee(String name1 , int idnum1 , String department1 , String position1) {sh m
	name =name1;
	idnum = idnum1;
	department = department1;
	position = position1;
}
public String getname() {
	return name;
}
public int getidnum() {
	return idnum;
}
public String getdepartment() {
	return department;
}
public String getposition() {
	return position;
}
public String toString() {
	return "Name\tID Number\tDepartment\tPosition";
}
public String tox() {
	return getname() + "\t" + getidnum() + "\t" + getdepartment() + "\t" + getposition() ;
}

public static void main (String[] args) {
employee one = new employee("Susan Mayers" , 47899 ,"Accounting" , "Vice president");
employee two = new employee("Mark Jones" , 39119 ,"IT" , "Programmer");
employee three = new employee("Joy Rogers" , 81774 ,"Manufacturing" , "Engineer");
System.out.println(one.toString());
System.out.println("______________________________________________________");
System.out.println(one.tox());
System.out.println(two.tox());
System.out.println(three.tox());
}
}
