class Passenger {
String name;
int age;

Passenger(String name, int age) {
this.name = name;
this.age = age;
}

void bookTicket() {
System.out.println(name + " has booked a standard ticket.");
}
}

class EconomyPassenger extends Passenger {
double price;

EconomyPassenger(String name, int age, double price) {
super(name, age);
this.price = price;
}

@Override
void bookTicket() {
System.out.println(name + " has booked an Economy ticket. Price: $" + price);
}
}

class BusinessPassenger extends Passenger {
double price;

BusinessPassenger(String name, int age, double price) {
super(name, age);
this.price = price;
}

@Override
void bookTicket() {
System.out.println(name + " has booked a Business ticket. Price: $" + price);
}
}

class FirstClassPassenger extends Passenger {
double price;

FirstClassPassenger(String name, int age, double price) {
super(name, age);
this.price = price;
}

@Override
void bookTicket() {
System.out.println(name + " has booked a First Class ticket. Price: $" + price);
}
}

public class AirlineReservationSystem {
public static void main(String[] args) {
Passenger passenger1 = new EconomyPassenger("varshith", 30, 200);
Passenger passenger2 = new BusinessPassenger("friend1", 45, 600);
Passenger passenger3 = new FirstClassPassenger("friend2", 35, 1500);

passenger1.bookTicket();
passenger2.bookTicket();
passenger3.bookTicket();

Passenger polymorphicPassenger = new BusinessPassenger("friend3", 40, 800);
polymorphicPassenger.bookTicket();
}
}
