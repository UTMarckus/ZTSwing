package ua.utm.pt2;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class MainWindow extends JFrame {

	private JMenuItem menuItemExit;
	private JMenu menuOptions;
	private JMenuItem menuItemSaveAs;
	private JMenu menuFile;
	private JMenuBar menuBar;
	private JButton btnView;
	private JLabel lblFormat;
	private Choice format;
	private JButton btnGetFile;
	private JButton btnGetImage;
	private JTextArea txtEnterUrlHere;
	private JTabbedPane tabbedPane;
	private JPanel panel2;
	private JPanel panel1;
	private JScrollPane scrollPane;
	private JPanel panel3;
	private JLabel lblImage;

	public MainWindow(int width, int height) {
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		panel1 = new JPanel(null);
		panel2 = new JPanel(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 40, 605, 392);
		getContentPane().add(tabbedPane);
		setResizable(false);
		
		tabbedPane.addTab("Tab1", panel1);
		
		txtEnterUrlHere = new JTextArea();
		txtEnterUrlHere.setText("Enter URL here...");
		txtEnterUrlHere.setBounds(10, 40, 580, 313);
		panel1.add(txtEnterUrlHere);
		
		btnGetImage = new JButton("Get Image");
		btnGetImage.setBounds(10, 10, 140, 20);
		//btnGetImage.addActionListener(e -> System.out.println("1"));
		btnGetImage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Main.setImage(new URL(txtEnterUrlHere.getText()));
				} catch (MalformedURLException e1) {
					JOptionPane.showMessageDialog(null, "Invalid URL or no internet connection");
				}
			}
		});
		panel1.add(btnGetImage);
		
		btnGetFile = new JButton("Get File");
		btnGetFile.setBounds(450, 10, 140, 20);
		btnGetFile.addActionListener(e -> System.out.println("2"));
		panel1.add(btnGetFile);
		
		tabbedPane.addTab("Tab2", panel2);
		
		format = new Choice();
		format.setBounds(520, 10, 70, 14);
		format.add("*.png");
		format.add("*.jpg, *.jpeg");
		panel2.add(format);
		
		lblFormat = new JLabel("Format:");
		lblFormat.setBounds(470, 13, 50, 14);
		panel2.add(lblFormat);
		
		btnView = new JButton("View");
		btnView.setBounds(10, 10, 140, 20);
		btnView.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Main.getImage()==null) {return;}
				lblImage.setIcon(new ImageIcon(Main.getImage()));
				lblImage.updateUI();
			}
		});
		panel2.add(btnView);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 580, 313);
		panel2.add(scrollPane);
		
		panel3 = new JPanel();
		scrollPane.setViewportView(panel3);
		panel3.setLayout(new BorderLayout(0, 0));
		
		lblImage = new JLabel("");
		panel3.add(lblImage, BorderLayout.CENTER);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 640, 20);
		getContentPane().add(menuBar);
		
		menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		menuItemSaveAs = new JMenuItem("Save as...");
		menuFile.add(menuItemSaveAs);
		
		menuOptions = new JMenu("Options");
		menuBar.add(menuOptions);
		
		menuItemExit = new JMenuItem("Exit");
		menuOptions.add(menuItemExit);
		
		setVisible(true);
	}

}
