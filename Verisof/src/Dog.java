
public class Dog extends Animal implements ILand{
	
	//field
	private final int numberOfLegs;
	
	//c-tor
	public Dog(boolean mammals, boolean carnivorous, int mood) {
		super(mammals,carnivorous,mood);
		this.numberOfLegs=4;
	}
	
	@Override
	public void sayHello() {
		System.out.println("wagging their tails");
	}
	
	@Override
	public void sayHello(int mood) {
		if(mood==MOOD_HAPPY)
			System.out.println("bark loudly");
		if(mood==MOOD_SCARE)
			System.out.println("whooping");
	}
	
    // function that returns how many legs the dog has
	public int getNumberOfLegs() {
		return this.numberOfLegs;
	}

}
