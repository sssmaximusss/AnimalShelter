package animals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class AnimalAtShelter {

    private final Animal animal;
    private String timeAddingToShelter;

    public AnimalAtShelter(Animal animal) {
        this.animal = animal;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm", new Locale("en_US"));
        timeAddingToShelter = dateFormat.format(Calendar.getInstance().getTime());
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getTimeAddingToShelter() {
        return timeAddingToShelter;
    }

    @Override
    public String toString() {
        return "AnimalAtShelter{" +
                "animal=" + animal +
                ", timeAddingToShelter='" + timeAddingToShelter + '\'' +
                '}';
    }
}
