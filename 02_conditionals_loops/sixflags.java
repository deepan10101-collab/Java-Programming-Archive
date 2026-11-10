package unit3;
import javax.swing.JOptionPane;
public class sixflags {

	public static void main(String[] args) {
		String season = JOptionPane.showInputDialog("what season enter 1,2,3 : ");
		int a = Integer.parseInt(season);
		
		String tickets = JOptionPane.showInputDialog("tickets : ");
		int b = Integer.parseInt(tickets);
		
		String message;
		int price;
		
		switch(a) {
		case 1:
			price = 30 * b;
			message = "spring tickets cost 30 " + price;
			break;
		case 2:
			price = 60 * b;
			message = "spring tickets cost 30 " + price;
			break;
		case 3:
			price = 40 * b;
			message = "spring tickets cost 30 " + price;
			break;
		default:
			message = "error , enter 1,2 or 3";
			
		JOptionPane.showMessageDialog(message);
			
		
		
		}
		
		
	}

}
