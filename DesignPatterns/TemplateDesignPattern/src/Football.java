
public class Football extends Game {

	   @Override
	   void endGame() {
	      System.out.println("Football Game Finished!");
	   }

	   @Override
	   void initializeGame() {
	      System.out.println("Football Game Initialized! Start playing.");
	   }

	   @Override
	   void startGame() {
	      System.out.println("Football Game Started. Enjoy the game!");
	   }
	}