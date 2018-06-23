import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JavaLesson24 extends JFrame {

	JComboBox favoriteShows;
	JButton button1;
	String infoOnComponent = "";
	public static void main(String[] args) {
		new JavaLesson24();
	}
	
	public JavaLesson24() {
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("My Fourth Frame");
		
		JPanel thePanel = new JPanel();
		
		String[] shows = {"Breaking Bad", "Life on Mars", "Doctor Who"};
		favoriteShows = new JComboBox(shows);
		favoriteShows.addItem("Pushing Daisies");
		
		thePanel.add(favoriteShows);
		
		button1 = new JButton("Get Answer");
		
		ListenForButton lForButton = new ListenForButton();
		
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		this.add(thePanel);
		this.setVisible(true);
		
		favoriteShows.insertItemAt("Dexter", 1);
		
		favoriteShows.setMaximumRowCount(3);
		
		favoriteShows.removeItem("Dexter");
		favoriteShows.removeItemAt(1);
	}
	
	private class ListenForButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == button1) {
				favoriteShows.setEditable(true);
				
				infoOnComponent += "Item at 0: " + favoriteShows.getItemAt(0) + "\n";
				infoOnComponent += "Num of Show: " + favoriteShows.getItemCount() + "\n";
				infoOnComponent += "Selected ID: " + favoriteShows.getSelectedIndex() + "\n";
				infoOnComponent += "Selected value: " + favoriteShows.getSelectedItem() + "\n";
				infoOnComponent += "Are Editable: " + favoriteShows.isEditable() + "\n";
				
				JOptionPane.showMessageDialog(JavaLesson24.this, infoOnComponent,"Information", JOptionPane.INFORMATION_MESSAGE);
				
				infoOnComponent = "";
			}
		}
		
	}

}
