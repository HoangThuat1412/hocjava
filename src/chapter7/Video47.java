package chapter7;

class Animal{  
	void eat(){
		System.out.println("animal is eating...");
		}  
}  
class Dog extends Animal{  
	void eat(){
		System.out.println("dog is eating...");
		}  
}  
class BabyDog1 extends Dog{
		void eat() {
			System.out.println("Baby dog is eating.....");
		}
	}
	
class Cat extends Animal{
	void eat() {
		System.out.println("Cat is eating ....");
	}
}
public class Video47 {
		public static void main(String args[]){  
		Animal a = new BabyDog1(); 
		Animal c = new Cat();
		a.eat();  
		c.eat();
		}
	  
}
