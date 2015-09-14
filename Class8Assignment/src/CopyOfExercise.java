import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CopyOfExercise implements ActionListener, WindowFocusListener {
	
	private static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame();
        CopyOfExercise app = new CopyOfExercise();
        Container pane = frame.getContentPane();
    	pane.setSize(500, 500);
        JButton button = new JButton( "Push Me" );
        button.addActionListener(app);
        pane.add( button );
        frame.addWindowFocusListener(app);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );
    }
    
    public void actionPerformed( ActionEvent evt ) {
        JOptionPane.showMessageDialog( null, "I've been pushed!" );
    }

	public void windowGainedFocus(WindowEvent e) {
		frame.setTitle("Receiving Keyboard Input");
	}

	public void windowLostFocus(WindowEvent e) {
		frame.setTitle("Idle...");
	}

}
