package state;

import javax.swing.JOptionPane;

public interface State {
	default void roll(){
		JOptionPane.showMessageDialog(null, "Unable to roll");
	}
	
	default void score(){
		JOptionPane.showMessageDialog(null, "Unable to score");
	}
	
	default void lock(){
		JOptionPane.showMessageDialog(null, "Unable to lock");
	}
	
	default void reset(){
		JOptionPane.showMessageDialog(null, "Unable to reset");
	}
}
