class Animal {
void eat() {
System.out.println("Animals eat food.");
}
}

class Mammal extends Animal {
@Override
void eat() {
System.out.println("Mammals eat different types of food.");
}
void walk() {
System.out.println("Mammals can walk.");
}
}

class Dog extends Mammal {
@Override
void eat() {
System.out.println("Dogs eat bones and meat.");
}
void bark() {
System.out.println("Dog barks.");
}
}

public class AnimalOver {
public static void main(String[] args) {
Dog myDog = new Dog();
myDog.eat();
myDog.walk();
myDog.bark();
}
}
