import javax.swing.JOptionPane;

public class TryCatchTest {
	public static void main(String[] args) {
		String error = "That wasn't a number!";
		String prompt = "Please enter a number";
		String reply = JOptionPane.showInputDialog(null, prompt);
		int num = 0;
		try {
			num = Integer.parseInt(reply);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, error);
		}
	}
}
