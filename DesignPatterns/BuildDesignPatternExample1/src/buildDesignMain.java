import com.build.house.*;

public class buildDesignMain {
	
	public static void main(String[] args) {
		HouseBuilder igloo = new IglooTypeHouse();
		CivilEngineer engineer = new CivilEngineer(igloo);

		engineer.ConstructHouse();
		System.out.println(engineer.getHouse());
	}
}
