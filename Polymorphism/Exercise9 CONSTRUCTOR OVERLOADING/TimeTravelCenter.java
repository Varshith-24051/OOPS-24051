class TimeMachine {
String travelerName;
String timePeriod;
boolean roundTrip;

TimeMachine() {
travelerName = "Unknown";
timePeriod = "Medieval Era";
roundTrip = false;
System.out.println(" Booking default solo trip to Medieval Era.");
}

TimeMachine(String name) {
travelerName = name;
timePeriod = "Future 3020 AD";
roundTrip = true;
System.out.println(  name + " booked a round trip to the year 3020.");
}

TimeMachine(String name, String period, boolean isRoundTrip) {
travelerName = name;
timePeriod = period;
roundTrip = isRoundTrip;
System.out.println(" Time Travel Confirmed: " + name + " → " + timePeriod + " | Round Trip: " + (isRoundTrip ? "Yes" : "No"));
}

void showTicket() {
System.out.println(" Traveler: " + travelerName + " | Destination: " + timePeriod + " | Round Trip: " + roundTrip);
}
}

public class TimeTravelCenter {
public static void main(String[] args) {
TimeMachine t1 = new TimeMachine();
TimeMachine t2 = new TimeMachine("Ava Quantum");
TimeMachine t3 = new TimeMachine("Dr. Chrono", "Ancient Egypt", false);

System.out.println("\n Time Travel Ticket Summary:");
t1.showTicket();
t2.showTicket();
t3.showTicket();
}
}
