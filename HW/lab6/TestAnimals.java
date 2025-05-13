package hus.oop.lab6;

public class TestAnimals {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal);
        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal);
        Cat cat = new Cat("Whiskers");
        System.out.println(cat);
        cat.greets(); // Meow
        System.out.println();
        Dog dog = new Dog("Buddy");
        System.out.println(dog);
        dog.greets(); // Woof
        System.out.println();
        // Test overloading method
        Dog dog2 = new Dog("Max");
        dog.greets(dog2); // Woooof
    }
}
