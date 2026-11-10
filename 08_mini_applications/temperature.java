package unit3;
import java.util.*;
public class temperature {
private int temperature;
private boolean confirm;
Scanner one  = new Scanner(System.in);

public temperature() {
System.out.println("enter :");
temperature = one.nextInt();
}
public boolean ethylfreezing() {
	if(temperature <= -173)
		confirm = true;
	else
		confirm = false;
return confirm;
}
public boolean ethylboiling() {
	if(temperature >= 172)
		confirm = true;
	else
		confirm = false;
return confirm;
}
public boolean oxygenfreezing() {
	if(temperature <=  -362)
		confirm = true;
	else
		confirm = false;
return confirm;
}
public boolean oxygenboiling() {
	if(temperature >= -306)
		confirm = true;
	else
		confirm = false;
return confirm;
}
public boolean waterfreezing() {
	if(temperature <= 32)
		confirm = true;
	else
		confirm = false;
return confirm;
}
public boolean waterboiling() {
	if(temperature >= 212)
		confirm = true;
	else
		confirm = false;
return confirm;
}

}
