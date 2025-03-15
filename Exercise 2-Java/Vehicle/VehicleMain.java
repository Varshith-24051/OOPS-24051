class Vehicle {
void start() {
System.out.println("Vehicle is starting...");
}
void stop() {
System.out.println("Vehicle is stopping...");
}
}

class Car extends Vehicle {
void drive() {
System.out.println("Car is driving...");
}
}

class ElectricCar extends Car {
void chargeBattery() {
System.out.println("Electric Car is charging...");
}
}

public class VehicleMain {
public static void main(String[] args) {
ElectricCar myCar = new ElectricCar();
myCar.start();
myCar.drive();
myCar.chargeBattery();
myCar.stop();
}
}
