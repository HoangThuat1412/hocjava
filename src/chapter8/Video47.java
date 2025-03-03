package chapter8;


public class Video47 {
	public static void main(String[] args) {
		Pig pig1 = new Pig();
		IAnimal animal = new Pig();
		animal.animalSound();
		pig1.animalSound();
		pig1.run();
	}
}
