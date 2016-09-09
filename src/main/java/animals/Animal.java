package animals;

public class Animal {

    private String name;
    private int age;
    private AnimalType type;

    public Animal(String name, int age, AnimalType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public AnimalType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }

    public enum AnimalType {
        Dog, Cat, Turtle
    }
}
