enum Color{
	RED, YELLOW, BLUE;
	
	private Color() {
		System.out.println("Constructor called");
	}
	
	// Only concrete (not abstract) methods allowed
    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}


public class enumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color color[] = Color.values();
		
		for(Color item: color) {
			System.out.println("Oridinal Of Color "+ item + " is " + item.ordinal() );
		}
		
		System.out.println(Color.valueOf("RED"));
		
		Color c1 = Color.RED;
		c1.colorInfo();
	}

}
