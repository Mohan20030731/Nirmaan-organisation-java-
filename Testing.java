package day16;
class Dog implements IAnimalBehavior {

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		System.out.println("The dog runs on four legs.");	
	}
	@Override
	public void Speak() {
		System.out.println("The dog says: Woof Woof!");
	}
	}
	class Bird implements  IAnimalBehavior {

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		System.out.println("The bird flies in the Sky.");
		}
		@Override
		public void Speak() {
		System.out.println("The bird says: Chrip Chrip!");
		}
	}
public class Testing {
	public static void main(String[] args) {
		System.out.println(IAnimalBehavior.name);
		Dog D = new Dog();
		D.Move();
		D.Speak();
		Bird B = new Bird();
		B.Move();
		B.Speak();
		System.out.println(IAnimalBehavior.isMammal("Dog"));
		System.out.println(IAnimalBehavior.isMammal("Bird"));
	}
}

