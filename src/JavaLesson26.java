import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class JavaLesson26 extends JFrame {

	JButton button1;
	JSpinner spinner1, spinner2, spinner3, spinner4;
	String outputString;
	public static void main(String[] args) {
		new JavaLesson26();
	}
	
	public JavaLesson26() {
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("My fifth Frame");
		
		JPanel thePanel = new JPanel();
		
		// create a button
		button1 = new JButton("Get Answer");
		
		ListenForButton lForButton = new ListenForButton();
		
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		spinner1 = new JSpinner();

		thePanel.add(spinner1);
		
		spinner2 = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		
		thePanel.add(spinner2);
		
		String[] weekDays = {"Mon", "Tue", "Wed", "Thur", "Fri"};
		
		spinner3 = new JSpinner(new SpinnerListModel(weekDays));
		
		Dimension d = spinner3.getPreferredSize();
		d.width = 80;
		spinner3.setPreferredSize(d);
		thePanel.add(spinner3);
		
		Date todaysDate = new Date();
		
		spinner4 = new JSpinner(new SpinnerDateModel(todaysDate,
				null, null, Calendar.DAY_OF_MONTH));
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinner4, "dd/MM/yy");
		
		spinner4.setEditor(dateEditor);
		
		thePanel.add(spinner4);
		this.add(thePanel);
		this.setVisible(true);
	}
	
	private class ListenForButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == button1) {
				outputString += "Spinner 1 Value: " + spinner1.getValue() + "\n";
				outputString += "Spinner 1 Value: " + spinner2.getValue() + "\n";
				outputString += "Spinner 1 Value: " + spinner3.getValue() + "\n";
				outputString += "Spinner 1 Value: " + spinner4.getValue() + "\n";
				
				JOptionPane.showMessageDialog(JavaLesson26.this, outputString, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				outputString = "";
			}
		}
		
	}

}
