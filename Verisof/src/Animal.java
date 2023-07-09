
public abstract class Animal {
	
	//fields
	private boolean mammals;
	private boolean carnivorous;
	protected static int MOOD_HAPPY=1;
	protected static int MOOD_SCARE=-1;
	private int mood;
	
	//c-tor
	public Animal(boolean mammals, boolean carnivorous, int mood) {
		this.mammals=mammals;
		this.carnivorous=carnivorous; 
		this.mood=mood;
	}
	
	public void sayHello() {
	}
	
	public abstract void sayHello(int mood);

	//getters and setters
	public boolean isMammals() {
		return this.mammals;
	}

	public void setMammals(boolean mammals) {
		this.mammals = mammals;
	}

	public boolean isCarnivorous() {
		return this.carnivorous;
	}

	public void setCarnivorous(boolean carnivorous) {
		this.carnivorous = carnivorous;
	}

}
