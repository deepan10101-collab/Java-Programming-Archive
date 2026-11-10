package unit3;

public class payroll {

	public double hoursworked;
	public double payrate;
	
public payroll () {
	hoursworked = 0;
	payrate = 0;
}

public void sethoursworked(double hoursworked) {
	this.hoursworked = hoursworked;
}
public void setpayrate(double payrate) {
	this.payrate = payrate;
}
public double gethoursworked() {
	return hoursworked;
}
public double getpayrate() {
	return payrate;
}
public double getgrosspay() {
	int overtimehours = (int) (hoursworked - 40);
	double grosspay ;
	if(hoursworked > 40) {
		grosspay =  overtimehours * (payrate * 1.5) + (40 * payrate);
		System.out.println("gross pay : " + grosspay );
	}
	else {
		grosspay = (hoursworked * payrate);
		System.out.println("gross pay :" + grosspay);
	}
	return (Double) null;
}
}
