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
void bark(String sound) { 
System.out.println("Dog barks: " + sound);
}
void bark(int times) {
System.out.println("Dog barks " + times + " times.");
}
}

public class AnimalOverL {
public static void main(String[] args) {
Dog myDog = new Dog();
myDog.eat(); 
myDog.walk(); 
myDog.bark();
myDog.bark("Woof Woof!");
myDog.bark(3);
}
}
