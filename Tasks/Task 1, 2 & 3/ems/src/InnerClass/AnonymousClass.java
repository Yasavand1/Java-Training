package InnerClass;

import java.awt.*;
import java.awt.event.*;

public class AnonymousClass {
	private Frame f;

	public AnonymousClass() {
		f = new Frame("Hello .....!");
	}

	public void launchFrame() {
		f.setSize(170, 170);
		f.setBackground(Color.orange);
		f.setVisible(true);
		// Add a window listener

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		}); // Anonymous Inner Classes

	}

	public static void main(String args[]) {
		AnonymousClass f = new AnonymousClass();
		f.launchFrame();
	}
}
