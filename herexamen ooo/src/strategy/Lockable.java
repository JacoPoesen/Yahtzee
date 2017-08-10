package strategy;

public interface Lockable {
	public void lock();
	public void unlock();
	//(un)Locks the dice, so it can('t) be rolled again
}
