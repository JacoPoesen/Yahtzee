package model;

public class Player {
	private String name;
	private int score;
	
	public Player (String name){
		setName(name);
		score = 0;
	}
	
	private void setName(String name){
		if (name == null){
			throw new DomainException("Verkeerde naam");
		}
		this.name = name;
	}
	
	
	public String getName(){
		return name;
	}
}
