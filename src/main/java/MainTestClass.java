import animals.Animal;
import animals.Shelter;

import java.util.List;

import static animals.Animal.AnimalType.*;

public class MainTestClass {

    public static void main(String[] args) {

        /**
         * initialization our shelter
         */
        Shelter shelter = new Shelter();

        /**
         * create animals
         */
        Animal dog1 = new Animal("dog1", 2, Dog);
        Animal dog2 = new Animal("dog2", 4, Dog);
        Animal dog3 = new Animal("dog3", 1, Dog);
        Animal dog4 = new Animal("dog1", 4, Dog);
        Animal dogFred = new Animal("fred", 11, Dog);

        Animal cat1 = new Animal("cat1", 6, Cat);
        Animal cat2 = new Animal("cat2", 2, Cat);
        Animal cat3 = new Animal("cat3", 13, Cat);
        Animal catTom = new Animal("tom", 1, Cat);

        Animal turtle1 = new Animal("turtle1", 66, Turtle);
        Animal turtle2 = new Animal("turtle2", 42, Turtle);
        Animal turtle3 = new Animal("turtle3", 1, Turtle);
        Animal turtleMasha = new Animal("masha", 100, Turtle);

        /**
         * add animals to shelter
         */
        shelter.addAnimal(dogFred);
        shelter.addAnimal(cat2);
        shelter.addAnimal(turtle3);
        shelter.addAnimal(turtleMasha);
        shelter.addAnimal(cat1);
        shelter.addAnimal(cat3);
        shelter.addAnimal(catTom);
        shelter.addAnimal(turtle1);
        shelter.addAnimal(dog2);
        shelter.addAnimal(dog4);
        shelter.addAnimal(dog1);
        shelter.addAnimal(turtle2);
        shelter.addAnimal(dog3);

        /**
         * get a list sorted by animals' name
         */
        System.out.println("Print a sorted list with dogs.");
        List<Animal> animals = shelter.lookSortedAnimals(Dog);
        animals.forEach(System.out::println);

        System.out.println("Print a sorted list with cats.");
        animals = shelter.lookSortedAnimals(Cat);
        animals.forEach(System.out::println);

        System.out.println("Print a sorted list with turtles.");
        animals = shelter.lookSortedAnimals(Turtle);
        animals.forEach(System.out::println);

        /**
         * get the animal with the largest time
         */
        System.out.println("Print the dog with the largest time spent in the shelter: " + shelter.getAnimalWithKnownedType(Dog));
        System.out.println("Print the cat with the largest time spent in the shelter: " + shelter.getAnimalWithKnownedType(Cat));
        System.out.println("Print the turtle with the largest time spent in the shelter: " + shelter.getAnimalWithKnownedType(Turtle));

        System.out.println("Print the animal with the largest time spent in the shelter: " + shelter.getAnimalWithUnknownedType());

        System.out.println("Print a sorted list with dogs after removing dogFred");
        animals = shelter.lookSortedAnimals(Dog);
        animals.forEach(System.out::println);

    }
}
