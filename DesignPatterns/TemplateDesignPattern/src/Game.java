import javax.print.attribute.standard.Finishings;

public abstract class Game {
	
	abstract void initializeGame();
	abstract void startGame();
	abstract void endGame();
	
	public final void play() {
		initializeGame();
		startGame();
		endGame();
	}
}
