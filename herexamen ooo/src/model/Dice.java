package model;

import java.util.ArrayList;
import java.util.Random;

import strategy.Rollable;
import ui.Controller;

public class Dice implements Rollable {
	//NORMAL DICE, VALUES GOING FROM 1 TO 6
	private final static ArrayList<Integer> possibleValues = new ArrayList<Integer>();
	private int value = 1;
	
	public Dice(){
		for (int i = 1; i < 7; i++){
			possibleValues.add(i);
		}
	}
	
	public int getValue(){
		return this.value;
	}
	private void setValue(int i){
		if (possibleValues.contains(i)){
			this.value = i;
		} else
			throw new DomainException("ongeldige waarde");
		
	}
	
	public void rollDice(){
		setValue(randomValue());
	}
	
	private int randomValue(){
		Random r = new Random();
		int min = possibleValues.get(0) - 1;
		int max = 0;
		for(int i : possibleValues){
			max = i;
		}
		int nr = r.nextInt(max - min) + min + 1;
		return nr;
	}

	@Override
	public void roll() {
		rollDice();
	}
}
