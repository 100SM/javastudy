package prob03;

public abstract class Unit {
	// νμ¬ μμΉ
	@SuppressWarnings("unused")
	private int x;
	@SuppressWarnings("unused")
	private int y;

	abstract void move(int x, int y);

	abstract void stop();
}
