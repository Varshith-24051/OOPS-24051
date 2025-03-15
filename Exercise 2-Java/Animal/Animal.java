class Animal {
void eat() {
System.out.println("Animals can eat.");
}
}
class Mammal extends Animal {
 void walk() {
 System.out.println("Mammals can walk.");
}
}

class Dog extends Mammal {
void bark() {
System.out.println("Dog barks.");
    }
}

public class Animal {
public static void main(String[] args) {
Dog myDog = new Dog();
myDog.eat();  // From Animal class
myDog.walk(); // From Mammal class
myDog.bark(); // From Dog class
}
}
