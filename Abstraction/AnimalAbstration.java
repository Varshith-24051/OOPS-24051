abstract class Animal{
protected String name;
public Animal(String name){
this.name=name;
}
public abstract void makeSound();
public abstract void move();
public String getName(){
return name;
}
public void displayInfo(){
System.out.println("Animal: "+name);
makeSound();
move();
}
}
abstract class Pet extends Animal{
public Pet(String name){
super(name);
}
public abstract void play();
}
class Dog extends Pet{
public Dog(String name){
super(name);
}
public void makeSound(){
System.out.println("Woof!");
}
public void move(){
System.out.println("Runs and wags tail.");
}
public void play(){
System.out.println("Fetches a ball.");
}
}
class Cat extends Pet{
public Cat(String name){
super(name);
}
public void makeSound(){
System.out.println("Meow!");
}
public void move(){
System.out.println("Silently walks.");
}
public void play(){
System.out.println("Chases a laser pointer.");
}
}
class Bird extends Animal{
public Bird(String name){
super(name);
}
public void makeSound(){
System.out.println("Chirp!");
}
public void move(){
System.out.println("Flies through the air.");
}
}
public class AnimalAbstration{
public static void main(String[] args){
Dog dog=new Dog("Buddy");
Cat cat=new Cat("Whiskers");
Bird bird=new Bird("Tweety");
dog.displayInfo();
dog.play();
System.out.println();
cat.displayInfo();
cat.play();
System.out.println();
bird.displayInfo();
}
}