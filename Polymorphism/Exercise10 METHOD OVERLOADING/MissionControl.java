abstract class SpaceVehicle {
abstract void launch();
abstract void land();
}

class Rocket extends SpaceVehicle {
public void launch() {
System.out.println(" Rocket Launch Initiated!");
}
public void land() {
System.out.println(" Rocket has landed safely.");
}
}

class Satellite extends SpaceVehicle {
public void launch() {
System.out.println(" Satellite launched into orbit.");
}
public void land() {
System.out.println(" Satellites don't land! Staying in orbit.");
}
}

class MissionControl {
public static void main(String[] args) {
SpaceVehicle vehicle;

vehicle = new Rocket();
vehicle.launch();
vehicle.land();

vehicle = new Satellite();
vehicle.launch();
vehicle.land();
}
}
