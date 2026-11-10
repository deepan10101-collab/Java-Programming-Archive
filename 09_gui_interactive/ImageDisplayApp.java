package BlackJack;


	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.ImageIcon;
	import javax.swing.SwingUtilities;

	public class ImageDisplayApp {

	    public static void main(String[] args) {
	        // Run GUI code on the Event Dispatch Thread (EDT) for thread safety
	        SwingUtilities.invokeLater(() -> {
	            createAndShowGUI();
	        });
	    }

	    private static void createAndShowGUI() {
	        // 1. Create the JFrame
	        JFrame frame = new JFrame("Image not in JFrame");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Define the image file path.
	        // For Windows paths, use double backslashes (\\\\) to escape the backslash character.
	        // For relative paths within your project, a single slash (/) works for all OS.
	        String imagePath = "H:\\\\BlackJack\\\\src\\\\BlackJack\\\\0_gtY-llyEbkeoS1Sp.png"; 
	        // Or for a relative path (e.g., if image is in project root):
	        // String imagePath = "your_image.jpg"; 

	        // 2. Create an ImageIcon from the file path
	        ImageIcon icon = new ImageIcon(imagePath);

	        // Optional: Error handling (ImageIcon constructor doesn't throw an exception, 
	        // so you might check if the icon's image is null to verify it loaded)
	        if (icon.getImageLoadStatus() == java.awt.MediaTracker.ERRORED) {
	            System.err.println("Could not load image from path: " + imagePath);
	            return; // Exit or handle the error gracefully
	        }

	        // 3. Create a JLabel with the ImageIcon
	        JLabel label = new JLabel(icon);

	        // 4. Add the JLabel to the JFrame
	        frame.add(label);

	        // 5. Finalize and display the frame
	        frame.pack(); // Sizes the frame so that all its contents are at or above their preferred sizes
	        frame.setVisible(true);
	        frame.setSize(1050,900);
	    }

}
