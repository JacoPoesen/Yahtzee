package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.JOptionPane;

import model.Player;
import model.YahtzeeDice;
import strategy.GameStrategyYahtzee;
import view.ViewFrame;

public class Controller extends Observable{
	
	private ArrayList<Player> players = new ArrayList<Player>();
	public static GameStrategyYahtzee yahtzee = new GameStrategyYahtzee();
	private ArrayList<ViewFrame> views;
	
	public Controller(ArrayList<ViewFrame> views, ArrayList<Player> p) {
		this.views = views;
		this.players = p;
		
		
		//Voegt voor elke ViewFrame een actionlistener toe aan de "start" knop.
		for (ViewFrame v: views){
			v.getRollButton().addActionListener( new ActionListener()
			{
			    public void actionPerformed(ActionEvent e)
			    {
			      for (YahtzeeDice d: yahtzee.getDices()){
			    	  d.roll();
			      }
			      setChanged();
			      notifyObservers(yahtzee);
			    }
			});
		}
		
	}
	
	public void addPlayer(Player p){
		this.players.add(p);
	}
	
	public void createPlayer(String name){
		
		Player player = new Player(name);
		addPlayer(player);
		
	}

//	public void show(){
//		String menu = createMenu();
//		int choise = -1;
//		while (choise != 0){
//			choise = -1;
//			String keuzeAlsString = JOptionPane.showInputDialog(menu);
//			try {
//				choise = Integer.parseInt(keuzeAlsString);
//				dispatch(choise);
//	              }
//			  catch (NumberFormatException e) {
//				  JOptionPane.showMessageDialog(null,
//						"Gelieve een geldig cijfer in te geven");
//	              }
//			  catch (Exception e) {
//				  JOptionPane.showMessageDialog(null, e.getMessage());
//			  }
//		}
//	}
//	
//	public String createMenu() {
//		return "1. Registreer speler\n" +
//				"0. Stop\n\n" +
//				"Maak uw keuze: ";
//				
//	}
//	
//	public void dispatch(int choise){
//		switch (choise){
//		case 0: 
//			System.exit(0);
//			break;
//		case 1:
//			createPlayer();
//			break;
//		}
//	}
//
//	private void createPlayer() {
//		boolean used = true;
//		String name = "";
//		while (used == true){
//			used = false;
//			name = JOptionPane.showInputDialog("Wat is uw naam?");
//			for (Player p : players){
//				if (name == p.getName()){
//					used = true;
//				}
//			}
//		}
//		
//		Player player = new Player(name);
//		players.add(player);
//		
//	}
}
