abstract class FuelPump {
protected String pumpId;
protected double currentFuelLevel;
public FuelPump(String pumpId, double initialFuelLevel) {
this.pumpId = pumpId;
this.currentFuelLevel = initialFuelLevel;
}
public String getPumpId() {
return pumpId;
}
public double getCurrentFuelLevel() {
return currentFuelLevel;
}
public abstract void dispenseFuel(double amount);
public abstract void refillFuel(double amount);
public void displayPumpStatus() {
System.out.println("Pump ID: " + pumpId);
System.out.println("Current Fuel Level: " + currentFuelLevel + " liters");
}
}
class GasolinePump extends FuelPump {
public GasolinePump(String pumpId, double initialFuelLevel) {
super(pumpId, initialFuelLevel);
}
public void dispenseFuel(double amount) {
if (currentFuelLevel >= amount) {
currentFuelLevel -= amount;
System.out.println("Dispensed " + amount + " liters of Gasoline from pump " + pumpId);
} else {
System.out.println("Insufficient Gasoline in pump " + pumpId);
}
}
public void refillFuel(double amount) {
currentFuelLevel += amount;
System.out.println("Refilled " + amount + " liters of Gasoline to pump " + pumpId);
}
}
class DieselPump extends FuelPump {
public DieselPump(String pumpId, double initialFuelLevel) {
super(pumpId, initialFuelLevel);
}
public void dispenseFuel(double amount) {
if (currentFuelLevel >= amount) {
currentFuelLevel -= amount;
System.out.println("Dispensed " + amount + " liters of Diesel from pump " + pumpId);
} else {
System.out.println("Insufficient Diesel in pump " + pumpId);
}
}
public void refillFuel(double amount) {
currentFuelLevel += amount;
System.out.println("Refilled " + amount + " liters of Diesel to pump " + pumpId);
}
}
public class FuelStation {
public static void main(String[] args) {
GasolinePump gasolinePump = new GasolinePump("G001", 500.0);
DieselPump dieselPump = new DieselPump("D001", 300.0);
gasolinePump.displayPumpStatus();
gasolinePump.dispenseFuel(25.0);
gasolinePump.displayPumpStatus();
gasolinePump.refillFuel(100.0);
gasolinePump.displayPumpStatus();
System.out.println();
dieselPump.displayPumpStatus();
dieselPump.dispenseFuel(150.0);
dieselPump.displayPumpStatus();
dieselPump.dispenseFuel(200.0);
dieselPump.displayPumpStatus();
}
}