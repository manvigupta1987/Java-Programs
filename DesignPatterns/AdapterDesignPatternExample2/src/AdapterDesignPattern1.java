import com.battle.BattleShip;
import com.battle.Captain;
import com.battle.FishingBoat;

/**The story of this implementation is this. <br> 
 * Pirates are coming! we need a {@link BattleShip} to fight! We have a {@link FishingBoat} and our 
 * captain. We have no time to make up a new ship! we need to reuse this {@link FishingBoat}. The 
 * captain needs a battleship which can fire and move. The spec is in {@link BattleShip}. We will 
 * use the Adapter pattern to reuse {@link FishingBoat}.
 * */ 

public class AdapterDesignPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Captain captain = new Captain();
		captain.fire();
		captain.move();
	}
}
