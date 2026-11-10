package RestaurantMenu;
import java.util.*;
import java.util.Scanner;
public class grades {
	public static void main(String[] args) {
		Map<Student, String> students = new TreeMap<>();
		
		Map<Integer,Student> ids=new TreeMap<>();
		printMenuAndGetChoice(students,ids);
	}
	public static void printMenuAndGetChoice(Map<Student, String> studentToGradeMap,Map<Integer, Student> idToStudentMap) {
		
		Scanner one  = new Scanner(System.in);
		while(true) {
			System.out.println("Choose between the following\n q = print grades \n z  = modify \n d = remove student \n t = add student\n l=leave program ");
			String b=one.nextLine().toLowerCase();
			if(b.equals("q")) {
				System.out.println( printGrades(studentToGradeMap));
				
			}
			else if(b.equals("z")) {
				
				System.out.println("what id do you want to put in"); 
				int x=one.nextInt();
				System.out.println("what grade do you want to put in"); 
				one.skip("\\R?");
				String g=one.nextLine();  
				
				System.out.println(modifyStudent(studentToGradeMap, idToStudentMap,x,g)); 
				
			}
			else if(b.equals("d")) {
				System.out.println("what id do you want to remove");
				int x=one.nextInt();
				one.skip("\\R?");
				System.out.println( removeStudent(studentToGradeMap, idToStudentMap,x));
			}
			else if(b.equals("t")) {
				System.out.println("what is their first name");
				String m=one.nextLine();
				System.out.println("what is their last name");
				String n=one.nextLine();
				System.out.println("what id do you want to put in");
				int x=one.nextInt();
				one.skip("\\R?");
				Student c=new Student(m,n,x);
				if(idToStudentMap.containsKey(x)) {
					System.out.println("oi huwee, that student already exists no cap on god bro");
					continue;
				}
				System.out.println("what grade do you want to put in");
				idToStudentMap.put(x, c);
				String g=one.nextLine();
				
				
				System.out.println( addStudent(studentToGradeMap, idToStudentMap,x,g));
			}
			else if(b.equals("l")){
				break;
			}
			else {
				System.out.println("that is not an option you nincompoopian narwhal\n\n");
			}
		}
		
		
		
		
	}
	/**
	Prints the students and grades
	@param gradeMap the map to print
	*/
	public static String printGrades(Map<Student, String> studentToGradeMap) {
		String a="";
		
		for(Student x : studentToGradeMap.keySet() ) {
			
			a+=x + " : " + studentToGradeMap.get(x)+"\n";
		}
		return a;
	}
	/**
	Modifies an entry based on user input. Prints an error if an invalid student is
	modified
	@param studentToGradeMap the map to modify
	@param idToStudentMap the map to associate student id with a student
	*/
	public static String modifyStudent(Map<Student, String> studentToGradeMap,
	Map<Integer, Student> idToStudentMap, int id,String grade) {
		String a="";
		if(idToStudentMap.containsKey(id)){
			if(studentToGradeMap.containsKey(idToStudentMap.get(id))) {
				studentToGradeMap.put(idToStudentMap.get(id), grade);
				a="student inputed";
			}
			else {
				a="this student don't exist";
			}
		}
		else {
			a="this student don't exist";
		}
		return a;
		
	}
	/**
	Removes a student from the map based on user input
	@param studentToGradeMap the map to remove the student from
	@param idToStudentMap the map to associate student id with a student
	*/
	public static String removeStudent(Map<Student, String> studentToGradeMap,
	Map<Integer, Student> idToStudentMap,int x) {
		String a="";
		if(idToStudentMap.containsKey(x)) {
			studentToGradeMap.remove(idToStudentMap.get(x));
			idToStudentMap.remove(x);
			a="student removed";
			return a;
		}
		else {
			a="student doesnt exist you pistachioed pancake";
		}
		return a;
		
	}
	/**
	Adds a student based on user input. Prints an error if a student
	is added that already exists in the map.
	@param studentToGradeMap the map to add the student to
	@param idToStudentMap the map to associate student id with a student
	*/
public static String addStudent(Map<Student, String> studentToGradeMap,Map<Integer, Student> idToStudentMap,int x,String grade) {
	
			
		
		studentToGradeMap.put(idToStudentMap.get(x), grade);
		
		return "added student";
		
}

}


class Student implements Comparable{
	
	private int id;
	private String fName;
	private String lName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Student(String fn,String ln,int i) {
		setfName(fn);
		setlName(ln);
		setId(i);
	}
	
	@Override
	public int compareTo(Object o) {
		return ((Student)o).getlName().compareTo(lName);
	}
	
	public String toString() {
		return  " "  + fName.substring(0,1).toUpperCase() + fName.substring(1,fName.length())+ ", "+lName.substring(0,1).toUpperCase() + lName.substring(1,lName.length())+ " id " +id;
	}
	
	public boolean equals(Student a) {
		return this.compareTo(a)==0;
	}
	
	public int HashCode() {
		return Objects.hash(lName);
		
	}
	
	
	
	
}
