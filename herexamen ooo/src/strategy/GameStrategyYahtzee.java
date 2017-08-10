package strategy;

import java.util.ArrayList;
import model.Dice;
import model.Player;
import model.YahtzeeDice;

public class GameStrategyYahtzee {
	
	private ArrayList<YahtzeeDice> dices =  new ArrayList<YahtzeeDice>();
	
	public GameStrategyYahtzee(){
		dices.add(new YahtzeeDice());
		dices.add(new YahtzeeDice());
		dices.add(new YahtzeeDice());
		dices.add(new YahtzeeDice());
		dices.add(new YahtzeeDice());
	}
	
	public void rollDices(){
		for (YahtzeeDice y: dices){
			y.rollDice();
		}
	}
	
	private void lockDice(int diceNr){
		YahtzeeDice d = dices.get(diceNr);
		d.lockDice();
	}
	
	public ArrayList<YahtzeeDice> getDices(){
		return dices;
	}
	
	public ArrayList<Integer> getValues(){
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (YahtzeeDice y: dices){
			values.add(y.getValue());
		}
		return values;
	}
	
}
