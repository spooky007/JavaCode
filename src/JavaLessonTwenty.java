import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// Extends JFrame so it can create frames

public class JavaLessonTwenty extends JFrame {
	
	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	int buttonClicked;
	
	public static void main(String[] args) {
		
		new JavaLessonTwenty();
	}
	
	public JavaLessonTwenty() {
		
		this.setSize(400,400);
//		this.setLocationRelativeTo(null);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		System.out.println(dim);
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height/2) - (this.getHeight() / 2);
		System.out.println(this.getWidth());
		System.out.println(dim.width / 2);
//		System.out.println(xPos);
//		System.out.println(yPos);
		System.out.println(this.getX());
		System.out.println(this.getY());
		
		this.setLocation(xPos, yPos);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My First App");

		JPanel thePanel = new JPanel();
		JLabel label1 = new JLabel("Tell me something");
		
		label1.setText("New Text");
		label1.setToolTipText("Doesn't do anything");
		
		thePanel.add(label1);
		
		// create a new button
		this.button1 = new JButton("Send");
		button1.setBorderPainted(true);
		
//		button1.setContentAreaFilled(true);
//		button1.setText("New Button");
		button1.setToolTipText("Doesn't do anything either");
		
		ListenForButton lForButton = new ListenForButton();
		
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		//create text field
		this.textField1 = new JTextField("", 10);
//		textField1.setColumns(10);
//		textField1.setText("Type again");
		
		ListenForKeys lForKeys = new ListenForKeys();
		
		textField1.addKeyListener(lForKeys);
		thePanel.add(textField1);
		
		//create text area 
		this.textArea1 = new JTextArea(15, 20);
		
		textArea1.setText("Tracking Events \n");
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		
		int numOfLines = textArea1.getLineCount();
		textArea1.append("number of lines: " + numOfLines);
		
		JScrollPane scrollbar1 = new JScrollPane(textArea1,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
//		thePanel.add(textArea1);
		thePanel.add(scrollbar1);
		this.add(thePanel);
		
		ListenForWindow lForWindow = new ListenForWindow();
		
		this.addWindowListener(lForWindow);
		
		this. setVisible(true);
		
		ListenForMouse lForMouse = new ListenForMouse();
		
		thePanel.addMouseListener(lForMouse);
		
		textField1.requestFocus();
	}
	
	// Implement Listeners
	
	private class ListenForButton implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				buttonClicked++;
				
				textArea1.append("Button clicked " + buttonClicked + "times\n");
				
				e.getSource().toString();
				
			}
		}
	}
	
	private class ListenForKeys implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			textArea1.append("Key Hit: " + e.getKeyChar() + "\n");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	private class ListenForWindow implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			textArea1.append("Window is created");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		//this.dispose();
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			textArea1.append("Window is Normal State");			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			textArea1.append("Window is minimized");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			textArea1.append("Window is active");
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			textArea1.append("Window is Not active");
			
		}
		
	}
	
	private class ListenForMouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			textArea1.append("Mouse Panel pos: " +  e.getX() + e.getY() + "\n");
			textArea1.append("Mouse Panel pos: " +  e.getXOnScreen() + e.getYOnScreen() + "\n");
			textArea1.append("Mouse Panel pos: " +  e.getButton() + "\n");
			textArea1.append("Mouse Panel pos: " +  e.getClickCount() + "\n");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

