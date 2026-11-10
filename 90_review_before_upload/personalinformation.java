package unit3;

public class personalinformation {
	private String name , adress , phonenumber;
	private int age;
	public personalinformation(String name , String adress , String phonenumber , int age ) {
		this.name = name;
		this.adress = adress;
		this.phonenumber = phonenumber;
	}
	
	public String getname() {
		return name;
	}
	public String getadress() {
		return adress;
	}
	public String getohonenumber() {
		return phonenumber;
	}
	public int getage() {
		return age;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setadress(String adress) {
		this.adress = adress;
	}
	public void setphonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public void setage(int age) {
		this.age = age;
	}
	public String toString() {
		return "name : " + getname() + "adress : " + ""
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
	}

}
