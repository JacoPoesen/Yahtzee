package model;

import strategy.Lockable;
import strategy.Rollable;

public class YahtzeeDice extends Dice implements Rollable, Lockable{
	//NORMAL DICE, VALUES GOING FROM 1 TO 6, BUT DICE CAN BE LOCKED IN ORDER NOT TO ROLL IT AGAIN
	private boolean locked = false;
	
	public YahtzeeDice(){
		super();
		setLocked(false);
	}
	
	public boolean isLocked(){
		return this.locked;
	}
	private void setLocked(boolean b){
		this.locked = b;
	}
	
	public void lockDice(){
		this.locked = true;
	}
	public void unlockDice(){
		this.locked = false;
	}

	@Override
	public void lock() {
		setLocked(true);
	}

	@Override
	public void roll() {
		rollDice();
	}

	@Override
	public void unlock() {
		setLocked(false);
	}
}
