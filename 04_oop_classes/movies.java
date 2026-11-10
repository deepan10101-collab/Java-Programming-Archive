package unit3;
import javax.swing.JOptionPane;
public class movies {
private String menu;
private String message;
private String asktixmsg;
private int movie;
private int tix;
private double price;
private double tax;
private String selectedmovie;

public movies() {
	price = 10.0;
	tax = 0.06;
}
public void getTaxRate() {
	JOptionPane.showMessageDialog(null, tax);
	
}
public void getTax() {
	JOptionPane.showMessageDialog(null, tix * tax); 
	
}
public void getprice() {
	
	JOptionPane.showMessageDialog(null, price * tix);  
	
}

public void moviemenu() {
	
  JOptionPane.showMessageDialog(null, "1 - E.T \n 2 - Avengers: Endgame \n 3 - Interstellar \n 4 - The Dark Knight \n 5 - Home Alone");
	
}

public void getMovie() {
	message = JOptionPane.showInputDialog("which movie : ");
	movie = Integer.parseInt(message);
	switch(movie) {
	case 1:
		selectedmovie = "E.T";
		break;
	case 2:
		selectedmovie = "Avengers: Endgame";
		break;
	case 3:
		selectedmovie = "Interstellar";
		break;
	case 4:
		selectedmovie = "The dark knight";
		break;
	case 5:
		selectedmovie = "Home Alone";
		break;
	default:
		JOptionPane.showMessageDialog(null, "error");
	}
	
	
	
}
public void gettix() {
	asktixmsg = JOptionPane.showInputDialog("how many tickets: ");
	tix = Integer.parseInt(asktixmsg);
	JOptionPane.showMessageDialog(null, tix);
	
}
public double getsubtotal() {
	
	return price * tix + price;
	
}
public void gettotal() {
	
	JOptionPane.showMessageDialog(null, getsubtotal()); 
	
}



}
