
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat(true, true, 1);
		Dog d=new Dog(true, false, -1);
		Frog f=new Frog(false, false, -1);
		Animal[] animals= {c,d,f};
		for(Animal animal:animals) {
			System.out.println("The animal "+animal.getClass().getName()+" say hello: ");
			animal.sayHello();
			System.out.println("Is the "+animal.getClass().getName()+" a mammal?\n"+animal.isMammals());
			System.out.println("Is the "+animal.getClass().getName()+" carnivorous?\n"+animal.isCarnivorous());
			if(animal instanceof IWater) {
				IWater w=(IWater)animal;
				System.out.println("Can a "+animal.getClass().getName()+" lay eggs?\n"+w.hasLaysEggs());
				System.out.println("Does a"+animal.getClass().getName()+" have gills?\n"+w.hasGills());
			}
			System.out.println("-------------------------");
		}

	}

}
