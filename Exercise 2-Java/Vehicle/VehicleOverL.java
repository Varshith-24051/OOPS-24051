class Vehicle {
void start() {
System.out.println("Vehicle is starting...");
}
void stop() {
System.out.println("Vehicle is stopping...");
}
void fuelUp(int liters) { 
System.out.println("Vehicle is refueling with " + liters + " liters.");
}
void fuelUp(int liters, String fuelType) { 
System.out.println("Vehicle is refueling with " + liters + " liters of " + fuelType + ".");
}
}

class Car extends Vehicle {
void drive() {
System.out.println("Car is driving...");
}
void fuelUp(String fuelType) { 
System.out.println("Car is refueling with " + fuelType + ".");
}
void fuelUp(double price) { 
System.out.println("Car is refueling, total cost: $" + price);
}
}

class ElectricCar extends Car {
void chargeBattery() {
System.out.println("Electric Car is charging...");
}
void chargeBattery(int percentage) { 
System.out.println("Electric Car is charging to " + percentage + "%.");
}
void chargeBattery(int percentage, int time) { 
System.out.println("Electric Car will charge to " + percentage + "% in " + time + " minutes.");
}
}

public class VehicleOverL {
public static void main(String[] args) {
ElectricCar myCar = new ElectricCar();
myCar.start();
myCar.drive();
myCar.fuelUp(40); 
myCar.fuelUp("Diesel"); 
myCar.fuelUp(20, "Petrol"); 
myCar.fuelUp(50.75); 
myCar.chargeBattery(); 
myCar.chargeBattery(80); 
myCar.chargeBattery(90, 30); 
myCar.stop();
}
}
