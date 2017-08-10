package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Dice;
import model.Player;
import ui.Controller;

public class ViewFrame extends JFrame implements java.util.Observer {
	
	private ArrayList<Integer> diceValues = new ArrayList<Integer>();
	private ViewFrame all, playerCreationFrame;
	private JPanel top, middle, bottom;
	private JLabel topYahtzee, bottomPlaying, d1, d2, d3, d4, d5;
	private JButton rollButton;
	private JTextField playerTextField;
	
	public ViewFrame(){
		super();
	}
	
	public ViewFrame createViewFrame(){
		diceValues = Controller.yahtzee.getValues();
		all = new ViewFrame();
		all.setLayout(null);
		all.setSize(2000,900);
		all.setResizable(false);
		all.setLocationRelativeTo(null);
		
		//TOP PANEL
		
		top = new JPanel();
		top.setLayout(null);
		top.setSize(2000, 150);
		top.setLocation(0, 0);
		top.setBackground(Color.cyan);
				
		topYahtzee = new JLabel("yahtzee");
		topYahtzee.setLocation(0,0);
		topYahtzee.setSize(2000, 150);
				
		top.add(topYahtzee);

		//MIDDLE PANEL
		
		middle = new JPanel();
		middle.setLayout(null);
		middle.setSize(2000, 600);
		middle.setLocation(0, 151);
		middle.setBackground(Color.WHITE);
		
		d1 = new JLabel("dobbelsteen 1: " + diceValues.get(0));
		d1.setSize(300, 500);
		d1.setLocation(0, 0);
		
		d2 = new JLabel("dobbelsteen 2: " + diceValues.get(1));
		d2.setSize(300, 500);
		d2.setLocation(300, 0);
		
		d3 = new JLabel("dobbelsteen 3: " + diceValues.get(2));
		d3.setSize(300, 500);
		d3.setLocation(600, 0);
		
		d4 = new JLabel("dobbelsteen 4: " + diceValues.get(3));
		d4.setSize(300, 500);
		d4.setLocation(900, 0);
		
		d5 = new JLabel("dobbelsteen 5: " + diceValues.get(4));
		d5.setSize(300, 500);
		d5.setLocation(1200, 0);
		
		rollButton = new JButton("rol de dobbelstenen");
		rollButton.setSize(250, 25);
		rollButton.setLocation(10, 525);
		
		middle.add(d1);
		middle.add(d2);
		middle.add(d3);
		middle.add(d4);
		middle.add(d5);
		middle.add(rollButton);
				
		//BOTTOM PANEL 
		
		bottom = new JPanel();
		bottom.setLayout(null);
		bottom.setLocation(0,700);
		bottom.setSize(2000, 150);
		bottom.setBackground(Color.pink);
				
		bottomPlaying = new JLabel("'speler die aan het spelen is' is aan het spelen");
		bottomPlaying.setLocation(0,0);
		bottomPlaying.setSize(2000, 150);
				
		bottom.add(bottomPlaying);
		
		all.add(bottom);		
		all.add(top);
		all.add(middle);
		
		return all;
		
	}

	public ViewFrame getAll() {
		return all;
	}

	public JPanel getTop() {
		return top;
	}

	public JPanel getMiddle() {
		return middle;
	}

	public JPanel getBottom() {
		return bottom;
	}

	public JLabel getTopYahtzee() {
		return topYahtzee;
	}
	
	public String getPlayerTextFieldString(){
		return playerTextField.getText();
	}

	public ViewFrame getPlayerCreationFrame(){
		return playerCreationFrame;
	}
	
	public JButton getRollButton(){
		return rollButton;
	}
	
	public void showFrame() {
		this.setVisible(true); 
	}
	public void hideFrame(){
		this.setVisible(false);
	}

	@Override
	public void update(Observable arg0, Object o) {
		System.out.println("hier kom ik ook");
		ArrayList<Integer> list = (ArrayList<Integer>)o;
		this.d1.setText("dobbelsteen 1: " + list.get(0));
		this.d2.setText("dobbelsteen 2: " + list.get(1));
		this.d3.setText("dobbelsteen 3: " + list.get(2));
		this.d4.setText("dobbelsteen 4: " + list.get(3));
		this.d5.setText("dobbelsteen 5: " + list.get(4));
		
	}
	
//	public ViewFrame createPlayerCreationFrame() {
//		
//			playerCreationFrame =  new ViewFrame();
//			playerCreationFrame.setLayout(null);
//			playerCreationFrame.setSize(2000, 900);
//			playerCreationFrame.setResizable(false);
//			playerCreationFrame.setLocationRelativeTo(null);
//			
//			playerNameLabel = new JLabel("naam van de speler");
//			playerNameLabel.setSize(2000, 100);
//			playerNameLabel.setLocation(10,10);
//			playerNameLabel.setBackground(Color.CYAN);
//			playerTextField = new JTextField(30);
//			playerTextField.setLocation(10, 100);
//			playerTextField.setSize(200, 25);
//			
//			playerCreationFrame.add(playerNameLabel);
//			playerCreationFrame.add(playerTextField);
//			playerRegisterButton = new JButton("Registreer");
//			playerRegisterButton.setSize(100,25);
//			playerRegisterButton.setLocation(10,500);
//			playerCreationFrame.add(playerRegisterButton);
//			playerCreationFrame.setVisible(true);
//			return playerCreationFrame;
//			
//	}
//	
//	
//	public ViewFrame test(){
//		ViewFrame f = new ViewFrame();
//		JButton b =  new JButton();
//		f.add(b);
//		
//		f.setLayout(null);
//		f.setSize(2000, 900);
//		f.setResizable(false);
//		f.setLocationRelativeTo(null);
//		f.setVisible(true);
//		return f;
//	}

}
