/** Template design pattern defines the sequence of algorithm. Child class can override the 
 * implementation of the steps but it can not change the sequence. So, parent class is a abstract clas
 * with methods and child class provides implementation of them. 
 * Here, we have to two games (child class) cricket and football. The sequence to play the game is 
 * decided by abstract class game (Parent class). The sequence can not be changed hence we have made the play 
 * method as final. 
 * @author manvi
 *
 */


public class TemplateDesignPatternDemo {
	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		
		Game football = new Football();
		football.play();
		
	}
}
