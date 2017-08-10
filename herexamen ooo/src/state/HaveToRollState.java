package state;

import strategy.GameStrategyYahtzee;

public class HaveToRollState implements State {
	private GameStrategyYahtzee g;
	
	@Override
	public void roll(){
		g.setActualState(g.getCanRollOneState());
	}
}
