package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Shelter {

    List<AnimalAtShelter> animals;

    public Shelter() {
        animals = new ArrayList<>();
    }

    public void addAnimal(final Animal animal) {
        animals.add(new AnimalAtShelter(animal));
    }

    public List<Animal> lookSortedAnimals(final Animal.AnimalType animalType) {
        return animals.stream()
                .filter(animalAtShelter -> animalAtShelter.getAnimal().getType().equals(animalType))
                .sorted((animalAtShelter1, animalAtShelter2) -> animalAtShelter1.getAnimal().getName().compareTo(animalAtShelter2.getAnimal().getName()))
                .map(AnimalAtShelter::getAnimal)
                .collect(Collectors.toList());
    }

    public Animal getAnimalWithKnownedType(Animal.AnimalType animalType) throws NoSuchElementException {
        AnimalAtShelter animal = animals.stream()
                .filter(animalAtShelter -> animalAtShelter.getAnimal().getType().equals(animalType))
                .min((animalAtShelter1, animalAtShelter2) -> animalAtShelter1.getTimeAddingToShelter().compareTo(animalAtShelter2.getTimeAddingToShelter()))
                .get();

        animals.remove(animal);
        return animal.getAnimal();
    }

    public Animal getAnimalWithUnknownedType() throws NoSuchElementException {
        AnimalAtShelter animal = animals.stream()
                .min((animalAtShelter1, animalAtShelter2) -> animalAtShelter1.getTimeAddingToShelter().compareTo(animalAtShelter2.getTimeAddingToShelter()))
                .get();

        animals.remove(animal);
        return animal.getAnimal();
    }
}
