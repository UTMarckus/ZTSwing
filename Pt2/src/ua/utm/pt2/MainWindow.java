package ua.utm.pt2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MainWindow extends JFrame {

	public MainWindow(int width, int height) {
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel(null);
		JPanel panel2 = new JPanel(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 80, 600, 400);
		getContentPane().add(tabbedPane);
		tabbedPane.addTab("Tab1", panel1);
		tabbedPane.addTab("Tab2", panel2);
		
	}

}
