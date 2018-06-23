import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class JavaLesson25 extends JFrame {

	JButton button1;
	String infoOnComponent = "";
	JList favoriteMovies, favoriteColors;
	DefaultListModel defListModel = new DefaultListModel();
	JScrollPane scroller;
	
	public static void main(String[] args) {
		new JavaLesson25();
	}

	public JavaLesson25() {
		
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("My Fifth Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		String[] movies = {"Matrix", "Minority Report", "Star Trek"};
		
		favoriteMovies = new JList(movies);
		favoriteMovies.setFixedCellHeight(30);
		favoriteMovies.setFixedCellWidth(150);
		favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		String[] colors = {"pink", "Blue", "Green", "Purple"};
		
		for(String color : colors) {
			defListModel.addElement(color);
		}
		
		defListModel.add(2, "Purple");
		favoriteColors = new JList(defListModel);
		favoriteColors.setVisibleRowCount(4);
		
		scroller = new JScrollPane(favoriteColors,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		favoriteColors.setFixedCellHeight(30);
		favoriteColors.setFixedCellWidth(150);
		thePanel.add(scroller);
		
		thePanel.add(favoriteMovies);
		
		thePanel.add(button1);
		this.add(thePanel);
		this.setVisible(true);
	}
	
	private class ListenForButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				if (defListModel.contains("Black")) {
					infoOnComponent += "Black is Here\n";
				}
				if (!defListModel.isEmpty()) {
					infoOnComponent += "Isn't Empty\n";
 				}
				infoOnComponent += "Elements in the List " + defListModel.size() + "\n";
				infoOnComponent += "Last Element in the List " + defListModel.lastElement() + "\n";
				infoOnComponent += "First Element in the List " + defListModel.firstElement() + "\n";
				infoOnComponent += "At Index 1 " + defListModel.get(1) + "\n";
				
				defListModel.remove(0);
				defListModel.removeElement("Big");
				
				Object[] arrayOfList = defListModel.toArray();
				
				for(Object color : arrayOfList) {
					infoOnComponent += color + "\n";
				}
				
				JOptionPane.showMessageDialog(JavaLesson25.this,infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				infoOnComponent = "";
			}
			
		}
		
	}
}
