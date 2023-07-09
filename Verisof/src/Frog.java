
public class Frog extends Animal implements ILand, IWater{
	
	//field
	private final int numberOfLegs;
	
	//c-tor
	public Frog(boolean mammals, boolean carnivorous, int mood) {
		super(mammals,carnivorous,mood);
		this.numberOfLegs=4;
	}
	
	@Override
	public void sayHello(int mood) {
		if(mood==MOOD_HAPPY)
			System.out.println("quack quack quack");
		if(mood==MOOD_SCARE)
			System.out.println("plop into the water");
	}
	
	public boolean hasGills() {
		return true;
	}
	
	public boolean hasLaysEggs() {
		return true;
	}

    // function that returns how many legs the dog has
	public int getNumberOfLegs() {
		return this.numberOfLegs;
	}
}
