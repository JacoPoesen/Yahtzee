package ui;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Player;
import view.ViewFrame;

public class Launcher {
	private static ArrayList<Player> players = new ArrayList<Player>();
	private static ArrayList<ViewFrame> viewFrames = new ArrayList<ViewFrame>();

	public static void main(String[] args) {
//		ViewFrame frame = new ViewFrame();
//		frame.createViewFrame();
//		Controller c = new Controller(frame);
//		frame.setVisible(true);
		boolean startKnop = false;
		while(!startKnop){
			if(players.size() > 1){
				String name = JOptionPane.showInputDialog(null, "Registreer een speler of start door leeg te laten");
				if (name.isEmpty()){
					startKnop = true;
				} else {
					players.add(new Player(name));
				}
					

			} else {
				String name = JOptionPane.showInputDialog(null, "Registreer een speler");
				players.add(new Player(name));
			}
		}
		
		for (Player p: players){
			ViewFrame frame = new ViewFrame();
			frame.createViewFrame();
		    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		    frame.getAll().setVisible(true);
		    viewFrames.add(frame);
		}
		
		
	    
	    Controller c = new Controller(viewFrames, players);
	}

}
