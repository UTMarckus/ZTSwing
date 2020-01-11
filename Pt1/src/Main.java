import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		
		Window window = new Window();
		window.setVisible(true);
		window.setSize(450, 350);
		window.setLayout(null);
		JScrollPane scrPane = new JScrollPane();
		scrPane.setBounds(25, 25, 350, 250);
		window.add(scrPane);
		JTextArea txtArea = new JTextArea();
		txtArea.setText("asdsadsadsadsafddsgfdsokv,ejtb,moiosjtvbmildsuthgjkesrvhgnksuerhgvjkesrhgnsjkervgn");
		scrPane.setViewportView(txtArea);

	}

}
