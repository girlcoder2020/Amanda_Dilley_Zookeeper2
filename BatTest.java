
public class BatTest {

	public static void main(String[] args) {
		Bat maggieSue = new Bat();
		System.out.println("Expected energy level 300");
		maggieSue.displayEnergy();
		
		maggieSue.attackTown();
		maggieSue.attackTown();
		maggieSue.attackTown();
		System.out.println("Expected energy level 0");
		maggieSue.displayEnergy();
		
		maggieSue.eatHumans();
		maggieSue.eatHumans();
		System.out.println("Expected energy level 50");
		maggieSue.displayEnergy();
		
		maggieSue.fly();
		maggieSue.fly();
		System.out.println("Expected energy level -50");
		maggieSue.displayEnergy();

		
		
	}

}
