class Vehicle {
void start() {
System.out.println("Vehicle is starting...");
}
void stop() {
System.out.println("Vehicle is stopping...");
}
}

class Car extends Vehicle {
@Override
void start() {
System.out.println("Car is starting with a key...");
}
@Override
void stop() {
System.out.println("Car is stopping by pressing brakes...");
}
void drive() {
System.out.println("Car is driving...");
}
}

class ElectricCar extends Car {
@Override
void start() {
System.out.println("Electric Car is starting silently...");
}
@Override
void stop() {
System.out.println("Electric Car is stopping using regenerative braking...");
}
void chargeBattery() {
System.out.println("Electric Car is charging...");
}
}

public class VehicleOverR {
public static void main(String[] args) {
ElectricCar myCar = new ElectricCar();
myCar.start();
myCar.drive();
myCar.chargeBattery();
myCar.stop();
}
}
