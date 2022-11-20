enum Sexes {
    MALE,
    FEMALE
}

enum Sizes {
    SMALL,
    MEDIUM,
    LARGE
}

public class Dog {
    String name;
    String breed;
    int age;
    String color;
    double height;
    double weight;
    Sexes sex;
    Sizes size;

    public Dog(String name) {
        this.name = name;
        System.out.println("Creating a dog, name: " + this.name);
    }

    public void barking() {
        System.out.println("Woof!");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
