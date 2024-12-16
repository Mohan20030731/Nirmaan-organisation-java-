package day16;

public interface IAnimalBehavior {
    String name="Living Being";
    static boolean isMammal(String AnimalName) {
    	return (AnimalName.equalsIgnoreCase("Dog")||(AnimalName.equalsIgnoreCase("Cat"))||(AnimalName.equalsIgnoreCase("Human")));
    	}
    default void Speak() {
    	System.out.println("Animal is making Sound");
    }
     void Move();
    	
    }

