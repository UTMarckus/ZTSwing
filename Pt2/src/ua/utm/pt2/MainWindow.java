package ua.utm.pt2;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MainWindow extends JFrame {

	public MainWindow(int width, int height) {
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel panel1 = new JPanel(null);
		JPanel panel2 = new JPanel(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 40, 605, 392);
		getContentPane().add(tabbedPane);
		setVisible(true);
		setResizable(false);
		
		tabbedPane.addTab("Tab1", panel1);
		
		JTextArea  txtEnterUrlHere = new JTextArea();
		txtEnterUrlHere.setText("Enter URL here...");
		txtEnterUrlHere.setBounds(10, 40, 580, 313);
		panel1.add(txtEnterUrlHere);
		
		JButton btnGetImage = new JButton("Get Image");
		btnGetImage.setBounds(10, 10, 140, 20);
		//btnGetImage.addActionListener(e -> System.out.println("1"));
		btnGetImage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1");
			}
		});
		panel1.add(btnGetImage);
		
		JButton btnGetFile = new JButton("Get File");
		btnGetFile.setBounds(450, 10, 140, 20);
		btnGetFile.addActionListener(e -> System.out.println("2"));
		panel1.add(btnGetFile);
		
		tabbedPane.addTab("Tab2", panel2);
		
		Choice format = new Choice();
		format.setBounds(520, 10, 70, 14);
		format.add("*.png");
		format.add("*.jpg, *.jpeg");
		panel2.add(format);
		
		JLabel lblFormat = new JLabel("Format:");
		lblFormat.setBounds(470, 13, 50, 14);
		panel2.add(lblFormat);
		
		JButton btnView = new JButton("View");
		btnView.setBounds(10, 10, 140, 20);
		btnView.addActionListener(e -> System.out.println("3"));
		panel2.add(btnView);
		
	}

}
