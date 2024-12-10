package day13;

class Animal{
void makesound() {
	System.out.println("Animals can make Sound");
	}
}
class Dog extends Animal{
	@Override
	void makesound() {
		System.out.println("The Dog Barks");
	}
}
class Cat extends Animal{
	@Override
	void makesound() {
		System.out.println("The Cat meows");
	}
}
public class AnimalSounds {
public static void main(String[] args) {
	Dog D = new Dog();
	Cat C = new Cat();
	D.makesound();
	C.makesound();
}
}
