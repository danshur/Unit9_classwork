import javax.swing.JOptionPane;

public class TryCatchTest {
	public static void main(String[] args) {
		String error = "That wasn't a number!";
		String prompt = "Please enter a number";
		String reply = JOptionPane.showInputDialog(null, prompt);
		int num = 0;
		try {
			// check for null
			if (reply == null) {
				throw new Exception("Invalid operation; no data entered.");
			} else {
				num = Integer.parseInt(reply);
			}
		} catch (Exception exc) {
			// JOptionPane.showMessageDialog(null, error);
			JOptionPane.showMessageDialog(null, error + "\n" + exc.getMessage());
		}
	}
}
