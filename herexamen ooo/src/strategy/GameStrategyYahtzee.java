package strategy;

import java.util.ArrayList;
import model.Dice;
import model.Player;
import model.YahtzeeDice;
import state.CanRollOneState;
import state.CanRollTwoState;
import state.ChooseScoreState;
import state.HaveToRollState;
import state.State;
import state.WaitState;

public class GameStrategyYahtzee {
	
	private State haveToRollState;
	private State canRollOneState;
	private State canRollTwoState;
	private State chooseScoreState;
	private State waitState;
	private State actualState;
	
	
	private ArrayList<YahtzeeDice> dices =  new ArrayList<YahtzeeDice>();
	
	public GameStrategyYahtzee(){
		dices.add(new YahtzeeDice());
		dices.add(new YahtzeeDice());
		dices.add(new YahtzeeDice());
		dices.add(new YahtzeeDice());
		dices.add(new YahtzeeDice());
		
		haveToRollState = new HaveToRollState();
		canRollOneState = new CanRollOneState();
		canRollTwoState = new CanRollTwoState();
		chooseScoreState = new ChooseScoreState();
		waitState = new WaitState();
		actualState = waitState;
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
	
	public void setActualState(State s){
		this.actualState = s;
	}

	public State getHaveToRollState() {
		return haveToRollState;
	}

	public State getCanRollOneState() {
		return canRollOneState;
	}

	public State getCanRollTwoState() {
		return canRollTwoState;
	}

	public State getChooseScoreState() {
		return chooseScoreState;
	}

	public State getWaitState() {
		return waitState;
	}

	public State getActualState() {
		return actualState;
	}
	
	
}
