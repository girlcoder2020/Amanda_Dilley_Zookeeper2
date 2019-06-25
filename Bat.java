public class Bat extends Mammal{
	
	public Bat() {
		super(300); //method is from Mammal, but i changed the energy level 
		//in the parameter
		
	}

	public void attackTown() {
		this.energyLevel = this.energyLevel -100;
		System.out.println("This world is on fire! " + this.energyLevel);
		//print the sound of a town on fire
		}

	public void eatHumans() {
		this.energyLevel = this.energyLevel + 25;
		System.out.println("Humans... tasty " + this.energyLevel);
		//sound of eating humans
	}
	
	public void fly() {
		this.energyLevel = this.energyLevel - 50;
		System.out.println("Whoosh! " + this.energyLevel);
	}
	
	
}
