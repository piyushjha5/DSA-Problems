// Base class
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Derived class Dog
class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    @Override
    void eat() {
        System.out.println(name + " the dog is eating.");
    }
}

// Derived class Cat
class Cat extends Animal {
    String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }

    @Override
    void sleep() {
        System.out.println(name + " the cat is sleeping.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 3, "Black");

        System.out.println("Dog details:");
        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        System.out.println("Breed: " + dog.breed);
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println("\nCat details:");
        System.out.println("Name: " + cat.name);
        System.out.println("Age: " + cat.age);
        System.out.println("Color: " + cat.color);
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}
